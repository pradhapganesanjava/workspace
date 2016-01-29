package com.pg.ws.client.math;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import com.pg.ws.client.stub.math.MapTableService;
import com.pg.ws.client.stub.math.MapTableServiceImplService;

public class MapTableClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		wscallURL();

		// wsCallStub();

	}

	private static void wsCallStub() {
		MapTableServiceImplService sei = new MapTableServiceImplService();
		MapTableService service = sei.getMapTableServiceImplPort();
		System.out.println("STUB: Find Square root of " + service.getSquare(11));
	}

	private static void wscallURL() {
		try{

			URL url = new URL("http://localhost:7733/math?wsdl");
			QName qnameService = new QName("http://math.simpleserver.ws.pg.com/",
					"MapTableServiceImplService");
			Service srv = Service.create(url, qnameService);
			MapTableService mapSrv = srv.getPort(MapTableService.class);
			((BindingProvider) mapSrv).getRequestContext().put(
					BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
					"http://localhost:7733/math/MapTableServiceImplService");
			System.out.println("URL: Find Square root of " + mapSrv.getSquare(55));

		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException ioe){

		}
	}

}
