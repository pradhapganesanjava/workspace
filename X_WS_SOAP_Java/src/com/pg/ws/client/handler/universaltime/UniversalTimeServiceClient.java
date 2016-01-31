package com.pg.ws.client.handler.universaltime;

import javax.xml.ws.BindingProvider;

public class UniversalTimeServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UniversalTimeServiceSEI sei = new UniversalTimeServiceSEI();
		UniversalTimeService service = sei.getPort(UniversalTimeService.class);
		((BindingProvider)service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:7777/style/universaltime/UniversalTimeServiceSEI");
		System.out.println(" US CST current time "+service.getCurrentTime("USA", "CST"));
		//System.out.println(" US PST current time "+service.getCurrentTime("USA", "PST"));
		

	}

}
