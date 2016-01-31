package com.pg.ws.handler.universaltime;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
@HandlerChain(file="handler-chain.xml")
public interface UniversalTimeService {

	/*@WebMethod
	public String getCurrentTime(String country);*/
	@WebMethod	
	public String getCurrentTime(String country, String zipcode);
}
