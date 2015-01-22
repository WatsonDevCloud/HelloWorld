package com.ibm.ic2015;

import java.io.IOException;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

public class VCAPProperties {

	private String serviceName = "relationship_extraction";
	
	private String baseURL = "<service url>";
	private String username = "<service username>";
	private String password = "<service password>";
	
	
	public String getBaseURL() {
		return baseURL;
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public VCAPProperties() {
		processVCAP_Services();
	}
	

    /**
     * If exists, process the VCAP_SERVICES environment variable in order to get the 
     * username, password and baseURL
     */
    private void processVCAP_Services() {
    	System.out.println("Processing VCAP_SERVICES");
        JSONObject sysEnv = getVcapServices();
        if (sysEnv == null) return;
        System.out.println("Looking for: "+ serviceName );
        
        if (sysEnv.containsKey(serviceName)) {
			JSONArray services = (JSONArray)sysEnv.get(serviceName);
			JSONObject service = (JSONObject)services.get(0);
			JSONObject credentials = (JSONObject)service.get("credentials");
			baseURL = (String)credentials.get("url");
			username = (String)credentials.get("username");
			password = (String)credentials.get("password");
			System.out.println("baseURL  = "+baseURL);
			System.out.println("username   = "+username);
			System.out.println("password = "+password);
    	} else {
    		System.out.println(serviceName + " is not available in VCAP_SERVICES, "
        			+ "please bind the service to your application");
        }
    }

    
    /**
     * Gets the <b>VCAP_SERVICES</b> environment variable and return it
     *  as a JSONObject.
     *
     * @return the VCAP_SERVICES as Json
     */
    private JSONObject getVcapServices() {
        String envServices = System.getenv("VCAP_SERVICES");
        if (envServices == null) return null;
        JSONObject sysEnv = null;
        try {
        	 sysEnv = JSONObject.parse(envServices);
        } catch (IOException e) {
        	// Do nothing, fall through to defaults
        	System.out.println("Error parsing VCAP_SERVICES: " + e.getMessage());
        }
        return sysEnv;
    }
	
	
    
    
    
    /**
     * If exists, process the VCAP_SERVICES environment variable in order to get the 
     * username, password and baseURL
     */
    private void EMPTYprocessVCAP_Services() {


    }

    
    
    /**
     * Gets the <b>VCAP_SERVICES</b> environment variable and return it
     *  as a JSONObject.
     *
     * @return the VCAP_SERVICES as Json
     */
    private JSONObject EMPTYgetVcapServices() {

        return null;
    }
    
    
    
    
    
}