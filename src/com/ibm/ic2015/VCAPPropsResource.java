package com.ibm.ic2015;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/vcapprops")
public class VCAPPropsResource {

	@GET
	@Produces("text/plain")
	public String getVcapProperties() {
		// TODO
		
		return "RXResource.getVcapProperties() method still needs implementing";
		
	}

}