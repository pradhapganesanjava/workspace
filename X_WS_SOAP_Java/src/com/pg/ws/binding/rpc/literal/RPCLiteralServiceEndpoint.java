package com.pg.ws.binding.rpc.literal;

import javax.xml.ws.Endpoint;

public class RPCLiteralServiceEndpoint {

	public static void main(String... str) {
		// testStandaloneRPCLiteral();
		Endpoint.publish("http://localhost:7777/style/rpcliteral", new RPCLiteralServiceImpl());
	}


	private static void testStandaloneRPCLiteral() {
		RPCLiteralServiceImpl servImpl = new RPCLiteralServiceImpl();

		ExchangeRateRequestBO rateRequestBO = new ExchangeRateRequestBO("USD", 1.0);

		ExchangeRateBO exBo = servImpl.getExchangeRate(rateRequestBO, "INR");

		System.out.println("output " + exBo.toString());
	}

}
