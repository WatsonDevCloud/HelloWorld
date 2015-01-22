package com.ibm.ic2015.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/processed")
public class ProcessedResource {

	@POST
	public String getProcessedRX(@FormParam("text") String text) {
		
		return "ProcessedResource.getProcessedRX() method still needs implementing";
		
	}
	
	
	

	public String EMPTYgetProcessedRX() {
		
		return "ProcessedResource.getProcessedRX() method still needs implementing";
		
	}

}