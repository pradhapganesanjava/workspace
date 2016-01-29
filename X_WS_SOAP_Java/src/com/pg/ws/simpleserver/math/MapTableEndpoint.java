package com.pg.ws.simpleserver.math;

import javax.xml.ws.Endpoint;

public class MapTableEndpoint {

	/**
	 * @param args
	 * 
	 * >wsimport -keep -s src/main/java -p  com.pg.ws.soap.stub.math -Xnocompile file:src/main/resources/math.wsdl
	 */
	public static void main(String[] args) {
		String address = "http://localhost:7030/math";
		Endpoint.publish(address, new MapTableServiceImpl());

	}

}
