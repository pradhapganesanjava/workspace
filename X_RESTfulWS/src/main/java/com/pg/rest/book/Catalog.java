package com.pg.rest.book;

import java.io.StringWriter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.pg.rest.book.bo.CatalogBo;

@Path("/catalog")
public class Catalog {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayWelcome() {
		System.out.println("Catalog.sayWelcome called Welcome :) !!!!");

		return "Hi.. WELCOME.. !!!";
	}

	/*@GET
	@Path("/{catalogId}")
	@Produces(MediaType.APPLICATION_JSON)
	public CatalogBo getCatalog(@PathParam("catalogId") String catalogId) {

		System.out.println("getCatalog is called for catalogId " + catalogId);

		return new CatalogBo().retrievCatalog(catalogId);
	}*/

	@GET
	@Path("/{catalogId}")
	@Produces(MediaType.APPLICATION_JSON + "," + MediaType.APPLICATION_XML)
	public String getCatalog(@PathParam("catalogId") String catalogId,
			@QueryParam("ftype") String mType) {

		System.out.println("getCatalog is called for catalogId " + catalogId + " and mType "
				+ mType);

		CatalogBo catalogBo = CatalogBo.retrievCatalog(catalogId);
		if(null == catalogBo){
			System.out.println("No Record found");
			return "No Record found";
		}

		if(null != mType && "xml".equalsIgnoreCase(mType)){
			try{
				JAXBContext jaxbContext = JAXBContext.newInstance(CatalogBo.class);
				Marshaller jaxbMarsh = jaxbContext.createMarshaller();
				jaxbMarsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				StringWriter strWriter = new StringWriter();
				jaxbMarsh.marshal(catalogBo, strWriter);
				
				String catInXmlStr = strWriter.toString();
				
				System.out.println("xml return : "+catInXmlStr);
				return catInXmlStr;
			}catch(JAXBException e){
				e.printStackTrace();
			}
		}else if(null != mType && "json".equalsIgnoreCase(mType)){/*
			ObjectMapper objMapper = new ObjectMapper();
			String catBoInJsonStr = "N/A";
			try{
				catBoInJsonStr = objMapper.writeValueAsString(catalogBo);
			}catch(JsonProcessingException e){
				e.printStackTrace();
			}
			System.out.println("json return : "+catBoInJsonStr);
			return catBoInJsonStr;

		*/}else{
			System.out.println("toString return : "+catalogBo.toString());
			return catalogBo.toString();
		}

		return null;
	}
}
