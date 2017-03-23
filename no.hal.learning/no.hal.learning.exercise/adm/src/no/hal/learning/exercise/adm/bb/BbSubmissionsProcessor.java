package no.hal.learning.exercise.adm.bb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.jdt.JdtPackage;
import no.hal.learning.exercise.junit.JunitPackage;
import no.hal.learning.exercise.util.ExerciseResourceFactoryImpl;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

public class BbSubmissionsProcessor {

	private Map<SubmissionData, Resource> submissions = new HashMap<SubmissionData, Resource>();
	
	public Map<SubmissionData, Resource> getSubmissions() {
		return submissions;
	}
	
	public static class SubmissionData {

		public String exerciseName, userName, fileName;

		@Override
		public String toString() {
			return getSubmissionPath(exerciseName, userName, fileName);
		}
		
		private static boolean stringEquals(String s1, String s2) {
			return (s1 == null ? s2 == null : s1.equals(s2));
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			} else if (obj == null || (obj.getClass() != this.getClass())) {
				return false;
			}
			SubmissionData other = (SubmissionData) obj;
			return stringEquals(exerciseName, other.exerciseName) &&
					stringEquals(fileName, other.fileName) &&
					stringEquals(userName, other.userName);
		}

		private static int stringHash(String s) {
			return (s == null ? 0 : s.hashCode());
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = prime + stringHash(exerciseName);
			result = prime * result + stringHash(fileName);
			result = prime * result + stringHash(userName);
			return result;
		}
	}

	public void readSubmissionsFromDirectory(File dir, boolean anon) {
		for (String fileName : dir.list()) {
			String[] segments = fileName.split("_");
			File submission = new File(dir, fileName);
			String exName = segments[0], userName = userName(segments[1], anon), subFileName = segments[segments.length - 1];
			if (acceptSubmission(subFileName)) {
				try {
					SubmissionData sub = createSubmission(exName, userName, subFileName);
					addSubmissionResource(sub, new FileInputStream(submission));
				} catch (FileNotFoundException e) {
				}
			} else if (subFileName.endsWith(".zip")) {
				try {
					ZipFile zipFile = new ZipFile(submission);
					Enumeration<? extends ZipEntry> entries = zipFile.entries();
				    while (entries.hasMoreElements()) {
				        try {
				        	ZipEntry zipEntry = entries.nextElement();
							String entryName = zipEntry.getName();
							if (acceptSubmission(entryName)) {
								int pos = entryName.lastIndexOf('/');
								subFileName = (pos >= 0 ? entryName.substring(pos + 1) : entryName);
								SubmissionData sub = createSubmission(exName, userName, subFileName);
								addSubmissionResource(sub, zipFile.getInputStream(zipEntry));
							}
						} catch (Exception e) {
							System.err.println("Exception when reading from " + submission + ": " + e);
						}
				    }
				    zipFile.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public void readSubmissionsFromZip(File file, boolean anon) throws IOException {
		ZipFile zipFile = new ZipFile(file);
		Enumeration<? extends ZipEntry> entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			try {
				ZipEntry zipEntry = entries.nextElement();
				String entryName = zipEntry.getName();
				if (acceptSubmission(entryName)) {
					SubmissionData sub = createSubmission(entryName);
					addSubmissionResource(sub, zipFile.getInputStream(zipEntry));
				}
			} catch (Exception e) {
				System.err.println("Exception when reading from " + file + ": " + e);
			}
		}
		zipFile.close();
	}

	public SubmissionData createSubmission(String exName, String userName, String subFileName) {
		SubmissionData sub = new SubmissionData();
		sub.exerciseName = exName;
		sub.userName = userName;
		sub.fileName = subFileName;
		return sub;
	}

	public SubmissionData createSubmission(String path) {
		SubmissionData sub = null;
		String[] segments = path.split("/");
		if (segments.length >= 3) {
			String exName = segments[0], userName = userName(segments[1], false), subFileName = segments[2];
			sub = new SubmissionData();
			sub.exerciseName = exName;
			sub.userName = userName;
			sub.fileName = subFileName;
		}
		return sub;
	}
	
	public String getSubmissionPath(SubmissionData sub, boolean anon) {
		return getSubmissionPath(sub.exerciseName, userName(sub.userName, anon), sub.fileName);
	}

	public static String getSubmissionPath(String exerciseName, String userName, String subFileName) {
		return exerciseName + "/" + userName + "/" + subFileName;
	}

	public String userName(String userName, boolean anon) {
		if (anon) {
			try {
				Long.valueOf(userName);
			}
			catch (Exception e) {
				long hashCode = userName.hashCode();
				if (hashCode < 0) {
					hashCode = ((long) Integer.MAX_VALUE) - hashCode;
				}
				String hash = String.valueOf(hashCode);
				String padding = "0000000000"; // 10 zeros
				if (padding.length() > hash.length()) {
					hash = padding.substring(hash.length()) + hash;
				}
				return hash;
			}
		}
		return userName;
	}

	protected boolean acceptSubmission(String subFileName) {
		return subFileName.endsWith(".ex");
	}

	private Resource.Factory factory = new ExerciseResourceFactoryImpl();

	protected boolean addSubmissionResource(SubmissionData sub, InputStream input) {
		Resource resource = null;
		try {
			resource = factory.createResource(URI.createURI(getSubmissionPath(sub, false)));
			resource.load(input, null);
			submissions.put(sub, resource);
			input.close();
		} catch (IOException e) {
		}
		return resource != null && resource.getErrors().isEmpty();
	}
	
	public void writeSubmissionsToZip(File zipFile, boolean anon) throws IOException {
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		for (SubmissionData sub : submissions.keySet()) {
			ZipEntry zipEntry = new ZipEntry(getSubmissionPath(sub, anon));
			Resource resource = submissions.get(sub);
			ByteArrayOutputStream resourceOut = new ByteArrayOutputStream();
			resource.save(resourceOut, null);
			resourceOut.close();
			byte[] data = resourceOut.toByteArray();
			if (data != null) {
				zipOut.putNextEntry(zipEntry);
				zipOut.write(data, 0, data.length);
				zipOut.closeEntry();
			}
		}
		zipOut.close();
	}
	
	// standalone converter
	
	public static void main(String[] args) {
		registerEPackages();
		String dir = getOption("dirIn", args, null);
		String zip = getOption("zipOut", args, null);
		Boolean anon = Boolean.valueOf(getOption("anon", args, "true"));
		if (dir != null && zip != null) {
			BbSubmissionsProcessor bbSubmissionsProcessor = new BbSubmissionsProcessor();
			bbSubmissionsProcessor.readSubmissionsFromDirectory(new File(dir), anon);
			try {
				bbSubmissionsProcessor.writeSubmissionsToZip(new File(zip), anon);
			} catch (IOException e) {
				System.err.println("Exception when writing to " + zip);
			}
		}
	}

	private static String getOption(String name, String[] args, String def) {
		String option1 = "-" + name + "=";
		String option2 = name + "=";
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if (arg.equals(option1) && args.length > i + 1) {
				return args[i + 1];
			} else if (arg.startsWith(option2)) {
				return arg.substring(option2.length());
			}
		}
		return def;
	}
	
	private static void registerEPackages() {
		Registry packageRegistry = EPackage.Registry.INSTANCE;
		packageRegistry.put(ExercisePackage.eNS_URI, ExercisePackage.eINSTANCE);
		packageRegistry.put(JdtPackage.eNS_URI, JdtPackage.eINSTANCE);
		packageRegistry.put(JunitPackage.eNS_URI, JunitPackage.eINSTANCE);
		packageRegistry.put(WorkbenchPackage.eNS_URI, WorkbenchPackage.eINSTANCE);
	}
}
