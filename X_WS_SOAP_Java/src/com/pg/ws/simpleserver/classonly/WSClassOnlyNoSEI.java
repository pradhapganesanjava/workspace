package com.pg.ws.simpleserver.classonly;

import javax.jws.WebService;

/***
 * 
 * bin>wsgen -cp . -keep -s ../src -wsdl -r ../wsdl -Xnocompile com.pg.ws.simpleserver.classonly.WSClassOnlyNoSEI
 * 
 * <service  name="WSClassOnlyNoSEIService">
 * <port     name="WSClassOnlyNoSEIPort"
 * <portType name="WSClassOnlyNoSEI">
 * 
 * @author pganesan
 *
 */

@WebService
public class WSClassOnlyNoSEI {
	
	public String sayHi(String name){
		return "Hi..."+name;
	}

}
