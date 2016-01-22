package com.pg.ws.simpleserver.implsei;

import javax.jws.WebService;

@WebService
public interface ClassJustSEI {

	public String sayHi(String name);
	
	// @WebMethod(exclude=false) NOT Allowed
	// @javax.jws.WebMethod annotation cannot be used on a service endpoint interface 
	public String sayBye();
}
