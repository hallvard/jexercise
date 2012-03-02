package no.hal.jex.views.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipOutputStream;

import no.hal.jex.jdt.JdtHelper;
import no.hal.jex.resource.JexResource;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class ZipFileSubmitter extends Job {

	private JexZipFile jexZip;
	private String submitUrl;
	private boolean m_autosubmitmode = false;
	
	public ZipFileSubmitter(JexResource jexRes, String jobtitle) {
		super(jobtitle);
		jexZip = new JexZipFile(jexRes);
	}
	
	public void setAutoSubmitMode (boolean mode) {
	    m_autosubmitmode = mode;
	}
	
	public IStatus run(IProgressMonitor progress) {
	    
	    if (m_autosubmitmode) {
	        try {
	            jexZip.create(progress);
	        }
	        catch (Exception e) {
	        }
	        // Ignore all problems in autosubmit-mode
	        return Status.OK_STATUS;
	    }
	    else {
	        return jexZip.create(progress);
	    }
	}
	
	public void setSubmitUrl(String submitUrl) {
		this.submitUrl = submitUrl;
	}

	protected int getTaskCount() {
		return jexZip.getTaskCount() + (submitUrl != null ? 1 : 0);
	}

	protected void postProcessZipOutputStream(ZipOutputStream zipOutputStream, OutputStream subOutputStream, IProgressMonitor progress) throws Exception {
		jexZip.postProcessZipOutputStream(zipOutputStream, subOutputStream, progress);
		if (submitUrl != null) {
			if (m_autosubmitmode == false) {
			    progress.subTask("Posting zip to " + submitUrl);
			}
			if (m_autosubmitmode) {
			    submitUrl += "&auto=true";
			}
			File file = new File(JdtHelper.getLocation (jexZip.getZipUri()));
			InputStream in = postData(new URL(submitUrl), file);
			progress.worked(1);
			BufferedReader inb = new BufferedReader(new InputStreamReader(in));
			resultURL = inb.readLine();
//			System.out.println (resultURL);
			in.close();
		}
	}
	
	public String getResultURL () {
	    return resultURL;
	}
	
	/*
	POST /path/to/script.php HTTP/1.0
	Host: example.com
	Content-type: multipart/form-data, boundary=AaB03x
	Content-Length: $requestlen

	--AaB03x
	content-disposition: form-data; name="field1"

	$field1
	--AaB03x
	content-disposition: form-data; name="field2"

	$field2
	--AaB03x
	content-disposition: form-data; name="userfile"; filename="$filename"
	Content-Type: $mimetype
	Content-Transfer-Encoding: binary

	$binarydata
	--AaB03x--
		 */

	private Map parameters = new HashMap();
	
	public void setParameters(String fieldName, String fieldContent) {
		parameters.put(fieldName, fieldContent);
	}
	
	private String boundary = "-----------------JEX-78jkjcfhHALjAaB03xFS";
	private static String fieldContentDispositionHeaderFormat = "content-disposition: form-data; name=\"{0}\"";

	private String fieldContentDispositionHeader;

	private void setFieldContentHeaders(Entry entry) {
		fieldContentDispositionHeader = MessageFormat.format(fieldContentDispositionHeaderFormat, new Object[]{entry.getKey()});
	}
	
	private static String fileContentDispositionHeaderFormat = "content-disposition: form-data; name=\"{0}\"; filename=\"{1}\"";
	private static String fileContentTypeHeaderFormat = "content-Type: {0}";
	private static String fileContentTransferEncodingHeaderFormat = "Content-Transfer-Encoding: binary";

	private String fileContentDispositionHeader;
	private String fileContentTypeHeader;
	private String fileContentTransferEncodingHeader;
	
	private String resultURL;
	
	private static final String FILE_PARAMETER_NAME = "submission";

	private void setFileContentHeaders() {
		fileContentDispositionHeader = MessageFormat.format(fileContentDispositionHeaderFormat, new Object[]{FILE_PARAMETER_NAME, jexZip.getZipUri().lastSegment()});
		fileContentTypeHeader = MessageFormat.format(fileContentTypeHeaderFormat, new Object[]{"application/zip"});
		fileContentTransferEncodingHeader = MessageFormat.format(fileContentTransferEncodingHeaderFormat, new Object[]{});
	}
	
	private InputStream postData(URL url, File file) throws IOException {
		if (! url.getProtocol().equals("http")) {
			throw new IllegalArgumentException("Only the http protocol is supported");
		}
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
//		System.out.println (url.toString ());
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.setRequestProperty("Content-type", "multipart/form-data, boundary=" + boundary);

		// compute content length
		int len = writeRequest(null, file);
		con.setRequestProperty("Content-length", String.valueOf(len));
		
		OutputStream out = con.getOutputStream();
		writeRequest(out, file);
		out.close();
		
//		System.out.println (con.getResponseCode ());
		
		if (con.getResponseCode () != 200) {
		    
		    throw new IOException ("Error submitting file: status code " + 
		            con.getResponseCode () + " (" + 
		            con.getResponseMessage () + ")");
		}
		
		return con.getInputStream();
	}

	private int postLen = 0;
	private OutputStream postOut = null;
	
	private void print(byte[] bytes) throws IOException {
		if (postOut != null) {
			postOut.write(bytes);
		}
		postLen += bytes.length;
	}
	private static byte[] crlf = "\r\n".getBytes();
	
	private void crlf() throws IOException {
		print(crlf);
	}
	private void print(byte[] bytes, int crlfCount) throws IOException {
		print(bytes);
		while (crlfCount-- > 0) {
			crlf();
		}
	}
	private void print(String s, int crlfCount) throws IOException {
		print(s.getBytes(), crlfCount);
	}
	private void println(String s) throws IOException {
		print(s, 1);
	}

	private int writeRequest(OutputStream out, File file) throws IOException {
		try {
			postLen = 0;
			postOut = out;
			for (Iterator entries = parameters.entrySet().iterator(); entries.hasNext();) {
				Entry entry = (Entry)entries.next();
				print("--", 0); println(boundary);			// --<boundary><CRLF>
				setFieldContentHeaders(entry);
				println(fieldContentDispositionHeader); 	// <contentDispositionHeader><CRLF>
				crlf(); 									// <CRLF>
				if (entry.getValue() instanceof String) {
					entry.setValue(((String)entry.getValue()).getBytes());
				}
				print(((byte[])entry.getValue()), 1); 		// <value><CRLF>
			}
	
			if (file != null && file.exists()) {
			    print("--", 0); println(boundary);          // --<boundary><CRLF>
			    setFileContentHeaders();
				println(fileContentDispositionHeader); 			// <contentDispositionHeader><CRLF>
				println(fileContentTypeHeader); 				// <contentTypeHeader><CRLF>
				// Content transfer encoding is not necessary to specify
				//println(fileContentTransferEncodingHeader); 	// <contentTransferEncodingHeader><CRLF>
				crlf(); 										// <CRLF>
				postLen += file.length();
				if (out != null) {
					jexZip.copyStream(new FileInputStream(file), out);
				}
				crlf();											// <CRLF>
			}
			print("--", 0); print(boundary, 0); println("--"); 	// --<boundary>--<CRLF>
		}
		finally {
			postOut = null;
		}
		return postLen;
	}

	public boolean prepare() {
		return jexZip.prepare();
	}

	public void addClasses(Boolean testLogic) {
		jexZip.addClasses(testLogic);
	}

	public void setJexRelatedFiles(String[] jexRelatedFiles) {
		jexZip.setJexRelatedFiles(jexRelatedFiles);
	}
}
