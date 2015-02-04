package com.ibm.ic2015;

import java.io.IOException;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

public class VCAPProperties {

	private String serviceName = "<service name>";
	private String baseURL = "<service url>";
	private String username = "<service username>";
	private String password = "<service password>";
	
	
	public VCAPProperties(String serviceName) {
		this.serviceName = serviceName;
		processVCAP_Services();
	}
	

    /**
     * If exists, process the VCAP_SERVICES environment variable in order to get the 
     * username, password and baseURL
     */
    private void processVCAP_Services() {
    	// TODO
    	
    }

    
    /**
     * Gets the <b>VCAP_SERVICES</b> environment variable and return it
     *  as a JSONObject.
     *
     * @return the VCAP_SERVICES as Json
     */
    private JSONObject getVcapServices() {
    	// TODO

        return null;
    }
	
	
	public String getBaseURL() {
		return baseURL;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getServiceName() {
		return serviceName;
	} 
  
}
