package com.pg.ws.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloResource {
	@GET
	public String sayHello(){
		return "Hello !!!";
	}
	
	@GET
	@Path("{name}")
	public String sayHello(@PathParam("name") String name){
		return "Helloooo "+name;
	}
}
