package com.pg.ws.binding.client.doc.literal.bare;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class DocLiteralBareServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DocLiteralBareServiceSEI docBareServiceSEI = new DocLiteralBareServiceSEI();
		DocLiteralBareService docLiteralBareService = docBareServiceSEI
				.getPort(DocLiteralBareService.class);
		((BindingProvider) docLiteralBareService).getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:7777/style/docliteralbare");

		Holder<Double> holdDblIn = new Holder<Double>(1.0);
		Holder<String> holdStrIn = new Holder<String>("USD");
		docLiteralBareService.getExchangeRate(holdDblIn, holdStrIn);

		System.out.println("holdDblIn " + holdDblIn + " holdStrIn " + holdStrIn);

	}

}
