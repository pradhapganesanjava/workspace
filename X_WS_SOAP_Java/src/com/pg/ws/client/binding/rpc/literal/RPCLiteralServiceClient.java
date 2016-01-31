package com.pg.ws.client.binding.rpc.literal;

import javax.xml.ws.BindingProvider;

public class RPCLiteralServiceClient {

	/*
	 * @WebServiceRef(type=RPCLiteralService.class) static RPCLiteralServiceSEI
	 * rpcLiteralService;
	 */

	public static void main(String... str) {

		ExchangeRateRequestBO reqBO = new ExchangeRateRequestBO();
		reqBO.setAmount(1.0);
		reqBO.setCurrency("USD");
		ExchangeRateBO resBo = null;

		RPCLiteralServiceSEI rpcLiteralServiceSEI = new RPCLiteralServiceSEI();
		RPCLiteralService rpcLiteralService = rpcLiteralServiceSEI.getPort(RPCLiteralService.class);
		((BindingProvider) rpcLiteralService).getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:7700/style/rpcliteral/RPCLiteralServiceSEI");
		resBo = rpcLiteralService.getExchangeRate(reqBO, "INR");

		System.out.println("successful executed ws " + resBo.getAmount() + " curr:"
				+ resBo.getCurrency());

	}

}
