package no.hal.learning.exercise.adm.bb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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

	private final Map<SubmissionData, Resource> submissions = new HashMap<SubmissionData, Resource>();

	public Map<SubmissionData, Resource> getSubmissions() {
		return submissions;
	}

	public static class SubmissionData {

		public String exerciseName, userName, fileName;

		@Override
		public String toString() {
			return getSubmissionPath(exerciseName, userName, fileName);
		}

		private static boolean stringEquals(final String s1, final String s2) {
			return (s1 == null ? s2 == null : s1.equals(s2));
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) {
				return true;
			} else if (obj == null || (obj.getClass() != this.getClass())) {
				return false;
			}
			final SubmissionData other = (SubmissionData) obj;
			return stringEquals(exerciseName, other.exerciseName) &&
					stringEquals(fileName, other.fileName) &&
					stringEquals(userName, other.userName);
		}

		static int stringHash(final String s) {
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

	public void readSubmissionsFromDirectory(final File dir, final boolean anon) {
		for (final String fileName : dir.list()) {
			final String[] segments = fileName.split("_");
			final File submission = new File(dir, fileName);
			final String exName = segments[0], userName = userName(segments[1], anon);
			String subFileName = segments[segments.length - 1];
			if (acceptSubmission(subFileName)) {
				try {
					final SubmissionData sub = createSubmission(exName, userName, subFileName);
					addSubmissionResource(sub, new FileInputStream(submission));
				} catch (final FileNotFoundException e) {
				}
			} else if (subFileName.endsWith(".zip")) {
				try {
					final ZipFile zipFile = new ZipFile(submission);
					final Enumeration<? extends ZipEntry> entries = zipFile.entries();
					while (entries.hasMoreElements()) {
						try {
							final ZipEntry zipEntry = entries.nextElement();
							final String entryName = zipEntry.getName();
							if (acceptSubmission(entryName)) {
								final int pos = entryName.lastIndexOf('/');
								subFileName = (pos >= 0 ? entryName.substring(pos + 1) : entryName);
								final SubmissionData sub = createSubmission(exName, userName, subFileName);
								addSubmissionResource(sub, zipFile.getInputStream(zipEntry));
							}
						} catch (final Exception e) {
							System.err.println("Exception when reading from " + submission + ": " + e);
						}
					}
					zipFile.close();
				} catch (final IOException e) {
				}
			}
		}
	}

	public void readSubmissionsFromZip(final File file, final boolean anon) throws IOException {
		final ZipFile zipFile = new ZipFile(file);
		final Enumeration<? extends ZipEntry> entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			try {
				final ZipEntry zipEntry = entries.nextElement();
				final String entryName = zipEntry.getName();
				if (acceptSubmission(entryName)) {
					final SubmissionData sub = createSubmission(entryName);
					addSubmissionResource(sub, zipFile.getInputStream(zipEntry));
				}
			} catch (final Exception e) {
				System.err.println("Exception when reading from " + file + ": " + e);
			}
		}
		zipFile.close();
	}

	public SubmissionData createSubmission(final String exName, final String userName, final String subFileName) {
		final SubmissionData sub = new SubmissionData();
		sub.exerciseName = exName;
		sub.userName = userName;
		sub.fileName = subFileName;
		return sub;
	}

	public SubmissionData createSubmission(final String path) {
		SubmissionData sub = null;
		final String[] segments = path.split("/");
		if (segments.length >= 3) {
			final String exName = segments[0], userName = userName(segments[1], false), subFileName = segments[2];
			sub = new SubmissionData();
			sub.exerciseName = exName;
			sub.userName = userName;
			sub.fileName = subFileName;
		}
		return sub;
	}

	public String getSubmissionPath(final SubmissionData sub, final boolean anon) {
		return getSubmissionPath(sub.exerciseName, userName(sub.userName, anon), sub.fileName);
	}

	public static String getSubmissionPath(final String exerciseName, final String userName, final String subFileName) {
		return exerciseName + "/" + userName + "/" + subFileName;
	}

	public String userName(final String userName, final boolean anon) {
		if (anon) {
			try {
				Long.valueOf(userName);
			}
			catch (final Exception e) {
				long hashCode = userName.hashCode();
				if (hashCode < 0) {
					hashCode = (Integer.MAX_VALUE) - hashCode;
				}
				String hash = String.valueOf(hashCode);
				final String padding = "0000000000"; // 10 zeros
				if (padding.length() > hash.length()) {
					hash = padding.substring(hash.length()) + hash;
				}
				return hash;
			}
		}
		return userName;
	}

	protected boolean acceptSubmission(final String subFileName) {
		return subFileName.endsWith(".ex");
	}

	private final Resource.Factory factory = new ExerciseResourceFactoryImpl();

	protected boolean addSubmissionResource(final SubmissionData sub, final InputStream input) {
		Resource resource = null;
		try {
			resource = factory.createResource(URI.createURI(getSubmissionPath(sub, false)));
			resource.load(input, null);
			submissions.put(sub, resource);
			input.close();
		} catch (final IOException e) {
		}
		return resource != null && resource.getErrors().isEmpty();
	}

	public void writeSubmissionsToZip(final File zipFile, final boolean anon) throws IOException {
		final ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		for (final SubmissionData sub : submissions.keySet()) {
			final ZipEntry zipEntry = new ZipEntry(getSubmissionPath(sub, anon));
			final Resource resource = submissions.get(sub);
			final ByteArrayOutputStream resourceOut = new ByteArrayOutputStream();
			resource.save(resourceOut, null);
			resourceOut.close();
			final byte[] data = resourceOut.toByteArray();
			if (data != null) {
				zipOut.putNextEntry(zipEntry);
				zipOut.write(data, 0, data.length);
				zipOut.closeEntry();
			}
		}
		zipOut.close();
	}

	// standalone converter

	public static void main(final String[] args) {
		registerEPackages();
		// program arguments example: baseDir=/Downloads/ovinger-bb/ dirIn=oving%s-bb zipOut=oving%s-anon.zip arg1=5
		final String base = getOption("baseDir", args, "");
		final Collection<String> formatArgs = new ArrayList<String>();
		for (int i = 1; i < 10; i++) {
			final String arg = getOption("arg" + i, args, null);
			if (arg == null) {
				break;
			}
			formatArgs.add(arg);
		}
		final String dir = getOption("dirIn", args, null);
		final String zip = getOption("zipOut", args, null);
		final Boolean anon = Boolean.valueOf(getOption("anon", args, "true"));
		if (dir != null && zip != null) {
			final BbSubmissionsProcessor bbSubmissionsProcessor = new BbSubmissionsProcessor();
			final Object[] formatArgsArray = formatArgs.toArray();
			final File dirFile = new File(String.format(base + dir, formatArgsArray));
			final File zipFile = new File(String.format(base + zip, formatArgsArray));
			bbSubmissionsProcessor.readSubmissionsFromDirectory(dirFile, anon);
			try {
				bbSubmissionsProcessor.writeSubmissionsToZip(zipFile, anon);
			} catch (final IOException e) {
				System.err.println("Exception when writing to " + zipFile);
			}
		}
	}

	private static String getOption(final String name, final String[] args, final String def) {
		final String option1 = "-" + name + "=";
		final String option2 = name + "=";
		for (int i = 0; i < args.length; i++) {
			final String arg = args[i];
			if (arg.equals(option1) && args.length > i + 1) {
				return args[i + 1];
			} else if (arg.startsWith(option2)) {
				return arg.substring(option2.length());
			}
		}
		return def;
	}

	private static void registerEPackages() {
		final Registry packageRegistry = EPackage.Registry.INSTANCE;
		packageRegistry.put(ExercisePackage.eNS_URI, ExercisePackage.eINSTANCE);
		packageRegistry.put(JdtPackage.eNS_URI, JdtPackage.eINSTANCE);
		packageRegistry.put(JunitPackage.eNS_URI, JunitPackage.eINSTANCE);
		packageRegistry.put(WorkbenchPackage.eNS_URI, WorkbenchPackage.eINSTANCE);
	}

	public static class GradeUserProcessor {

		/**
		 * @param args the command line args, with the following format: <input file name> [<username field num>] [<output file name>]
		 */
		public static void main(final String[] args) {
			final File inFile = new File(args[0]);
			File outFile = (args.length >= 3 ? new File(args[2]) : null);
			int userNameFieldNum = 0;
			if (args.length >= 2) {
				try {
					userNameFieldNum = Integer.valueOf(args[1]);
				} catch (final NumberFormatException e) {
					if (outFile == null) {
						outFile = new File(args[1]);
					}
				}
			}
			final String inSeparator = ";", outSeparator = inSeparator;
			if (inFile.exists()) {
				try {
					final Scanner scanner = new Scanner(inFile);
					final PrintStream out = (outFile != null ? new PrintStream(outFile) : System.out);
					while (scanner.hasNextLine()) {
						final String line = scanner.nextLine(), fields[] = line.split(inSeparator);
						if (fields.length < 1 || fields[1].length() > 1) {
							continue;
						}
						final String userName = fields[userNameFieldNum];
						long hashCode = userName.hashCode();
						if (hashCode < 0) {
							hashCode = (Integer.MAX_VALUE) - hashCode;
						}
						String hash = String.valueOf(hashCode);
						final String padding = "0000000000"; // 10 zeros
						if (padding.length() > hash.length()) {
							hash = padding.substring(hash.length()) + hash;
						}
						out.print(hash);
						for (int i = 0; i < fields.length; i++) {
							if (i != userNameFieldNum) {
								out.print(outSeparator);
								out.print(fields[i]);
							}
						}
						//						out.print(outSeparator);
						//						out.print(userName);
						out.println();
					}
					scanner.close();
				} catch (final FileNotFoundException e) {
					System.err.println(e);
				}
			} else {
				System.err.println(inFile + " does not exist");
			}
		}
	}

}
