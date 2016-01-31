package com.pg.ws.binding.rpc.encode;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.pg.ws.binding.bo.ExchangeRateBO;
import com.pg.ws.binding.bo.ExchangeRateRequestBO;
import com.pg.ws.binding.service.helper.BindingTestServiceHelper;

/**
 * 
 * bin>wsgen -cp . com.pg.ws.binding.rpc.encode.RPCEncodeWrapperServiceImpl -wsdl -r ../wsdl/wsgen/RPCEncodeWrapper -s ../src -verbose
 * >wsimport file:wsdl/wsimport/RPCLiteralServiceSEI.wsdl -keep -s src/ -p com.pg.ws.client.binding.rpc.literal -Xnocompile
 * 
 * 
 * @author pganesan
 *
 */

/*
 * Note:   ap round: 1
Problem encountered during annotation processing;
see stacktrace below for more information.
com.sun.tools.internal.ws.processor.modeler.ModelerException: modeler error: The com.pg.ws.binding.rpc.encode.RPCEncodeWrapperService class has
invalid SOAPBinding annotation. rpc/encoded SOAPBinding is not supported
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceAP.onError(WebServiceAP.java:225)
 */


@WebService(serviceName="RPCEncodeWrapperServiceSEI",endpointInterface = "com.pg.ws.binding.rpc.encode.RPCEncodeWrapperService")
public class RPCEncodeWrapperServiceImpl {

	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO, String toCurrency) {
		return BindingTestServiceHelper.getExchangeRateImpl(rateRequestBO, toCurrency);
	}
}
