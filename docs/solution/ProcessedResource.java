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
	public String getProcessedRX(@FormParam("text") String text) {

		System.out.println("Form text: " + text);
		
		VCAPProperties vcp = new VCAPProperties("relationship_extraction");
		
		String xml = RelExAPI.performExtraction(text, 
									"ie-en-news", 
									vcp.getBaseURL(), 
									vcp.getUsername(), 
									vcp.getPassword());
		
		Rep rep = Marshaller.marshallXml(xml);
		
		RelExUtil util = new RelExUtil(rep);
		List<String> entities = util.getEntitiesList();
		List<String> rels = util.getRelationsList();
		
		return "Entities:\n" +
			RelExUtil.stringFromList(entities) + 
			"\nRelations:\n" + 
			RelExUtil.stringFromList(rels);
		
	}

}