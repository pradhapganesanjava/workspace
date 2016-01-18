package com.pg.ws.servlet;

import javax.jws.WebService;

@WebService
public class CatalogWS {
	public String sayHello(String name){
		return "Helloooo "+name;
	}
}
