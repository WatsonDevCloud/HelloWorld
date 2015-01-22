package com.ibm.ic2015;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/vcapprops")
public class VCAPPropsResource {

	@GET
	public String getVcapProperties() {
		
		return System.getenv("VCAP_SERVICES");
		
	}
	
	
	

	public String EMPTYgetVcapProperties() {
		
		return "RXResource.getVcapProperties() method still needs implementing";
		
	}

}