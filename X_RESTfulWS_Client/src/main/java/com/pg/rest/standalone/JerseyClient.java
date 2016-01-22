package com.pg.rest.standalone;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.pg.rest.msging.bo.MessageBo;

public class JerseyClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();

		String baseURLStr = "http://localhost:8020/X_RESTfulWS_Jersey/";
		String rootPath = "messages";
		// String urlGet = String.format("%s%s%s", baseURLStr, rootPath, "1");
		String urlGet = String.format("%s%s", baseURLStr, rootPath);

		GenericType<List<MessageBo>> msgBoList = new GenericType<List<MessageBo>>() {
		};

		List<MessageBo> listRes = client.target(urlGet).request()
				.accept(MediaType.APPLICATION_JSON).get(msgBoList);

		for(MessageBo msgBo : listRes){
			System.out.println("List msgBo " + msgBo.toString());
		}

		MessageBo msgBoRes = client.target(urlGet).path("/{msgId}").resolveTemplate("msgId", "3")
				.request().accept(MediaType.APPLICATION_JSON).get(MessageBo.class);

		System.out.println(" msgBo " + msgBoRes.toString());
	}

}
