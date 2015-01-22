package com.ibm.ic2015.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ibm.ic2015.VCAPProperties;


@Path("/vcapprops")
public class VCAPPropsResource {

	@GET
	public String getVcapProperties() {
		
		VCAPProperties vcp = new VCAPProperties();
		
		String props = "URL: " + vcp.getBaseURL() +
						"\nUsername: " + vcp.getUsername() +
						"\nPassword: " + vcp.getPassword();
		
		return props;
		
	}
	
	
	

	public String EMPTYgetVcapProperties() {
		
		return "RXResource.getVcapProperties() method still needs implementing";
		
	}

}