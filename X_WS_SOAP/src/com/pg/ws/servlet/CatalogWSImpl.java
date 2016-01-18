package com.pg.ws.servlet;

import javax.jws.WebService;

@WebService(serviceName="CatalogWSImpl", name="CatalogWS")
public class CatalogWSImpl implements Catalog {

	@Override
	public String getTitle(String id) {
		return null;
	}
}
