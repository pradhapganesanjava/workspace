package com.pg.ws.binding.client.doc.literal.wrap;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import com.pg.ws.binding.client.doc.literal.bare.DocLiteralBareService;
import com.pg.ws.binding.client.doc.literal.bare.DocLiteralBareServiceSEI;

/*
 * 
 * >wsimport file:wsdl/wsimport/DocLiteralWrap/DocLiteralWrapServiceSEI.wsdl -keep -s src/ -p com.pg.ws.binding.client.doc.literal.wrap -Xnocompile -verbose
 * 
 * com\pg\ws\binding\client\doc\literal\wrap\DocLiteralWrapService.java
 com\pg\ws\binding\client\doc\literal\wrap\DocLiteralWrapServiceSEI.java
 com\pg\ws\binding\client\doc\literal\wrap\ExchangeRateBO.java
 com\pg\ws\binding\client\doc\literal\wrap\ExchangeRateRequestBO.java
 com\pg\ws\binding\client\doc\literal\wrap\GetExchangeRate.java
 com\pg\ws\binding\client\doc\literal\wrap\GetExchangeRateResponse.java
 com\pg\ws\binding\client\doc\literal\wrap\ObjectFactory.java
 com\pg\ws\binding\client\doc\literal\wrap\package-info.java
 * 
 */
public class DocLiteralWrapServiceClient {

	public static void main(String... str) {
		DocLiteralWrapServiceSEI docBareServiceSEI = new DocLiteralWrapServiceSEI();
		DocLiteralWrapService docLiteralWrapService = docBareServiceSEI
				.getPort(DocLiteralWrapService.class);
		((BindingProvider) docLiteralWrapService).getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:7777/style/docliteralwrap");

		ExchangeRateRequestBO exchangeRateRequestBO = new ExchangeRateRequestBO();
		exchangeRateRequestBO.setAmount(1.0);
		exchangeRateRequestBO.setCurrency("USD");

		ExchangeRateBO resExchangeRateBO = docLiteralWrapService
				.getExchangeRate(exchangeRateRequestBO);

		System.out.println("resExchangeRateBO " + resExchangeRateBO.toString());
		System.out.println("resExchangeRateBO [currency: " + resExchangeRateBO.getCurrency()
				+ " , amount: " + resExchangeRateBO.getAmount());
	}

}
