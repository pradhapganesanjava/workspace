package com.pg.ws.rest.jersey;

import javax.ws.rs.core.MediaType;

import com.pg.rest.msging.bo.MessageBo;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Jersey19Client {

	public static void main(String... s) {

		String urlStr = "http://localhost:8020/X_RESTfulWS_Jersey/messages/1";
		Client client = Client.create();
		WebResource webSrc = client.resource(urlStr);
		webSrc.accept(MediaType.APPLICATION_JSON); //expected content type
		webSrc.type(MediaType.TEXT_PLAIN); //sending content type

		//webSrc.en
		
		// MessageBo msgBo = webSrc.get(MessageBo.class);
		// System.out.println(" response "+msgBo.toString());

		ClientResponse clientRes = webSrc.get(ClientResponse.class);
		System.out.println("status> " + clientRes.getStatus());
		MessageBo csMsgBo = clientRes.getEntity(MessageBo.class);
		
		System.out.println(" csMsgBo "+csMsgBo.toString());

	}
}
