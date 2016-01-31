package com.pg.ws.binding.doc.literal.bare;

import javax.xml.ws.Endpoint;

public class DocLiteralBareServiceEndpoint {

	public static void main(String... str) {
		// testStandaloneRPCLiteral();
		
		Endpoint ep = Endpoint.create(new DocLiteralBareServiceImpl());
		if("publish".equals(str[0])){
			ep.publish("http://localhost:7733/style/docliteralbare");
		}else if("stop".equals(str[0])){
			ep.stop();
		}
			
	}

}
