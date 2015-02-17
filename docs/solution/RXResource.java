package com.ibm.ic2015;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/rx")
public class RXResource {

	@POST
	@Produces("application/xml")
	public String getRX(@FormParam("text") String text) {
		
		System.out.println("Form text: " + text);
		
		VCAPProperties vcp = new VCAPProperties("relationship_extraction");
		
		String xml = RelExAPI.performExtraction(text, 
									"ie-en-news", 
									vcp.getBaseURL(), 
									vcp.getUsername(), 
									vcp.getPassword());
		
		return xml;
		
	}
	
	
}