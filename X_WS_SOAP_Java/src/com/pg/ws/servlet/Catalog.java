package com.pg.ws.servlet;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="CatalogInterface")
public interface Catalog {

	@WebMethod
	String getTitle(String id);

}
