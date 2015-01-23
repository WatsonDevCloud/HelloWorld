package com.ibm.ic2015;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;

import relexbind.Marshaller;
import relexbind.Rep;

public class RelExAPI {


	
	
	
	
	/*
	 * Using Apache HTTPClient library to call the Relationship Extraction REST service.  
	 * Results are an XML document.
	 */
	public static String performExtraction(String text, String sid, String url, String username, String password) {
	
		System.out.println("text: " + text);
		System.out.println("sid: " + sid);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		List<NameValuePair> queryParams = new ArrayList<NameValuePair>();
		queryParams.add(new BasicNameValuePair("txt", text ));
		queryParams.add(new BasicNameValuePair("sid", sid ));
		queryParams.add(new BasicNameValuePair("rt", "xml" ));
		
		String response = "ERROR";
    	try {
    		Executor executor = Executor.newInstance().auth(username, password);
    		URI serviceURI = new URI(url).normalize();
    	    byte[] responseBytes = null;
			//try {
				responseBytes = executor.execute(Request.Post(serviceURI)
				    .bodyString(URLEncodedUtils.format(queryParams, "utf-8"), 
				    		ContentType.APPLICATION_FORM_URLENCODED)
				    ).returnContent().asBytes();
//			} catch (Exception e) {
//				throw new RuntimeException("Relationship Extraction service is unavailable: status=" + e.getMessage());
//			}

    	    response = new String(responseBytes, "UTF-8");    	    
//		} catch (IOException e) {
//			
//			//throw new RuntimeException("Relationship Extraction service is unavailable: status=" + e.getMessage());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return response;
	}
	
	
	
	/*
	 * Using Apache HTTPClient library to call the Relationship Extraction REST service.  
	 * Results are an XML document.
	 */
	public static String EMPTYperformExtraction(String text, String sid, String url, 
							String username, String password) {
    	
    	return "RelExAPI.performExtraction() method still needs implementing";
    	
	}
	
	
	
}
