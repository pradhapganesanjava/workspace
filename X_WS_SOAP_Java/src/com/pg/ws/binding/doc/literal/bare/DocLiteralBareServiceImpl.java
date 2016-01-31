package com.pg.ws.binding.doc.literal.bare;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.pg.ws.binding.bo.ExchangeRateBO;
import com.pg.ws.binding.bo.ExchangeRateRequestBO;
import com.pg.ws.binding.service.helper.BindingTestServiceHelper;

/**
 * 
 * bin>wsgen -cp . com.pg.ws.binding.doc.literal.bare.DocLiteralBareServiceImpl -wsdl -r ../wsdl/wsgen/DocLiteralBare -s ../src -verbose
 * >wsimport file:wsdl/wsimport/DocLiteralBare/DocLiteralBareServiceSEI.wsdl -keep -s src/ -p com.pg.ws.binding.client.doc.literal.bare -Xnocompile
 * 
 * wsgen:
 * Note:   ap round: 1
	[ProcessedMethods Interface: com.pg.ws.binding.doc.literal.bare.DocLiteralBareService]
	[should process method: getExchangeRate hasWebMethods: false ]
	[endpointReferencesInterface: true]
	[declaring class has WebSevice: true]
	[returning: true]
	[WrapperGen - method: getExchangeRate(com.pg.ws.binding.bo.ExchangeRateRequestBO)]
	[method.getDeclaringType(): com.pg.ws.binding.doc.literal.bare.DocLiteralBareService]
 * 
 * @author pganesan
 *
 */


@WebService(serviceName="DocLiteralBareServiceSEI",endpointInterface = "com.pg.ws.binding.doc.literal.bare.DocLiteralBareService")
public class DocLiteralBareServiceImpl {

	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO) {
		return BindingTestServiceHelper.getExchangeRateImpl(rateRequestBO,"INR");
	}
}
