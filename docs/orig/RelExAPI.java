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

import com.ibm.ic2015.relexbind.Marshaller;
import com.ibm.ic2015.relexbind.Rep;

public class RelExAPI {


	/*
	 * Using Apache HTTPClient library to call the Relationship Extraction REST service.  
	 * Results are an XML document.
	 */
	public static String performExtraction(String text, String sid, String url, 
							String username, String password) {
		// TODO
    	
    	return "RelExAPI.performExtraction() method still needs implementing";
    	
	}
	
	
}
