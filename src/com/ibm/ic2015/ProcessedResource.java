package com.ibm.ic2015;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ibm.ic2015.relexbind.Marshaller;
import com.ibm.ic2015.relexbind.RelExUtil;
import com.ibm.ic2015.relexbind.Rep;


@Path("/processed")
public class ProcessedResource {

	@POST
	@Produces("text/plain")
	public String getProcessedRX() {
		// TODO
		
		return "ProcessedResource.getProcessedRX() method still needs implementing";
		
	}

}