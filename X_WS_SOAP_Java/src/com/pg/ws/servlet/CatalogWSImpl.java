package com.pg.ws.servlet;

import javax.jws.WebService;

@WebService(serviceName="CatalogWSImplServAlias", name="CatalogWSPortType")
public class CatalogWSImpl implements Catalog {

	@Override
	public String getTitle(String id) {
		return null;
	}
}
