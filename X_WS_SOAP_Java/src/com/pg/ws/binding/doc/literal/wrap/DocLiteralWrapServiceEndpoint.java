package com.pg.ws.binding.doc.literal.wrap;

import javax.xml.ws.Endpoint;

import com.pg.ws.binding.doc.literal.bare.DocLiteralBareServiceImpl;

public class DocLiteralWrapServiceEndpoint {

	/**
	 * @param args
	 */
	public static void main(String[] str) {
		// testStandaloneRPCLiteral();
		
		Endpoint ep = Endpoint.create(new DocLiteralWrapServiceImpl());
		if("publish".equals(str[0])){
			ep.publish("http://localhost:7744/style/docliteralwrap");
		}else if("stop".equals(str[0])){
			ep.stop();
		}
			
	}

}
