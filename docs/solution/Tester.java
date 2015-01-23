package com.ibm.ic2015;

import java.util.List;

import com.ibm.ic2015.relexbind.Marshaller;
import com.ibm.ic2015.relexbind.RelExUtil;
import com.ibm.ic2015.relexbind.Rep;

public class Tester {

	
	/*
	 * 
	 * Tester for Relationship Extraction API so we don't have to deploy to Bluemix to test.
	 * 
	 */
	public static void main(String[] args) {
		String text = "Barack Obama is the president of the United States.";
		
		String url = "https://gateway.watsonplatform.net/laser/service/api/v1/sire/cf997efc-3c5d-440d-9c54-885b04d56c4e";
		String username = "ebe462b4-16d8-4ed7-9653-ad70999bb34c";
		String password = "htbNjBXFzHpG";
		
		
		String xml = RelExAPI.performExtraction(text, 
							"ie-en-news", 
							url, 
							username, 
							password);
		
		System.out.println(xml);
		
		Rep rep = Marshaller.marshallXml(xml);
		
		System.out.println(rep);
		
		RelExUtil util = new RelExUtil(rep);
		
		List<String> entities = util.getEntitiesList();
		List<String> rels = util.getRelationsList();
		
		System.out.println(RelExUtil.stringFromList(entities));
		System.out.println(RelExUtil.stringFromList(rels));
		
	}
	
	
}
