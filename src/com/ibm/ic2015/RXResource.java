package com.ibm.ic2015;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/rx")
public class RXResource {

	@POST
	@Produces("application/xml")
	public String getRX() {
		// TODO
		
		return "RXResource.getRX() method still needs implementing";
		
	}

}