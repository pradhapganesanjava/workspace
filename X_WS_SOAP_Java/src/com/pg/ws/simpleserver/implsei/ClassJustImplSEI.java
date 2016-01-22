package com.pg.ws.simpleserver.implsei;

import javax.jws.WebService;

/***
 * 
 * <service name="ClassJustImplSEIService">
 * <port name="ClassJustImplSEIPort"
 * <portType name="ClassJustSEI"
 * 
 * @author pganesan
 *
 * bin>wsgen -cp . -keep -s ../src -wsdl -r ../wsdl -Xnocompile com.pg.ws.simpleserver.implsei.ClassJustImplSEI
 * src>wsimport -keep -p com.pg.ws.simpleclient.implsei -Xnocompile file:../wsdl/ClassJustImplSEIService.wsdl
 */

@WebService(endpointInterface="com.pg.ws.simpleserver.implsei.ClassJustSEI")
public class ClassJustImplSEI {

	//@WebMethod(exclude=true)
	// @javax.jws.WebMethod annotation cannot be used in with @javax.jws.WebService.endpointInterface element
	public String sayHiFromClassImpl(String name){
		return "Hi from ClassImpl "+name;
	}
	
	public String sayHi(String name){
		return "Hi "+name;
	}
	
	//@WebMethod(exclude=true)
	// @javax.jws.WebMethod annotation cannot be used in with @javax.jws.WebService.endpointInterface element 
	public String sayBye(){
		return "Dont say bye";
	}
}
