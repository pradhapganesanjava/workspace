package com.pg.ws.binding.doc.literal.wrap;

import javax.jws.WebService;

import com.pg.ws.binding.bo.ExchangeRateBO;
import com.pg.ws.binding.bo.ExchangeRateRequestBO;
import com.pg.ws.binding.service.helper.BindingTestServiceHelper;

/**
 * 
 * bin>wsgen -cp . com.pg.ws.binding.doc.literal.wrap.DocLiteralWrapServiceImpl -wsdl -r ../wsdl/wsgen/DocLiteralWrap -s ../src -verbose
 * wsimport file:wsdl/wsimport/DocLiteralWrap/DocLiteralWrapServiceSEI.wsdl -keep -s src/ -p com.pg.ws.binding.client.doc.literal.wrap -Xnocompile
 * 
 * @author pganesan
 *
 * wsgen:
 * Note:   ap round: 1
	[ProcessedMethods Interface: com.pg.ws.binding.doc.literal.wrap.DocLiteralWrapService]
	[should process method: getExchangeRate hasWebMethods: false ]
	[endpointReferencesInterface: true]
	[declaring class has WebSevice: true]
	[returning: true]
	[WrapperGen - method: getExchangeRate(com.pg.ws.binding.bo.ExchangeRateRequestBO)]
	[method.getDeclaringType(): com.pg.ws.binding.doc.literal.wrap.DocLiteralWrapService]
	[requestWrapper: com.pg.ws.binding.doc.literal.wrap.jaxws.GetExchangeRate]
	com\pg\ws\binding\doc\literal\wrap\jaxws\GetExchangeRate.java
	com\pg\ws\binding\doc\literal\wrap\jaxws\GetExchangeRateResponse.java
	Note:   ap round: 2
 *
 */


@WebService(serviceName = "DocLiteralWrapServiceSEI", endpointInterface = "com.pg.ws.binding.doc.literal.wrap.DocLiteralWrapService")
public class DocLiteralWrapServiceImpl {
	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO) {
		return BindingTestServiceHelper.getExchangeRateImpl(rateRequestBO, "INR");
	}
}
