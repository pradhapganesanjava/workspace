package com.pg.ws.handler.universaltime;

import javax.xml.ws.Endpoint;

public class UniversalTimeServiceEndpoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Endpoint.publish("http://localhost:7710/style/universaltime", new UniversalTimeServiceImpl());
		

	}

}
