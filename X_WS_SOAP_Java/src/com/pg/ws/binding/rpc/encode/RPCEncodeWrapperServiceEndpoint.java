package com.pg.ws.binding.rpc.encode;

import javax.xml.ws.Endpoint;

public class RPCEncodeWrapperServiceEndpoint {

	public static void main(String... str) {
		// testStandaloneRPCLiteral();
		Endpoint.publish("http://localhost:7733/style/rpcencodewrap", new RPCEncodeWrapperServiceImpl());
	}

}
