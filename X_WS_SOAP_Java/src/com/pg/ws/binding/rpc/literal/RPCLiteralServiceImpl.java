package com.pg.ws.binding.rpc.literal;

import javax.jws.WebService;

/**
 * 
 * bin>wsgen -cp . com.pg.ws.binding.rpc.literal.RPCLiteralServiceImpl -wsdl -r ../wsdl -s ../src -verbose
 * >wsimport file:wsdl/wsimport/RPCLiteralServiceSEI.wsdl -keep -s src/ -p com.pg.ws.client.binding.rpc.literal -Xnocompile
 * 
 * 
 * @author pganesan
 *
 */


@WebService(serviceName="RPCLiteralServiceSEI",endpointInterface = "com.pg.ws.binding.rpc.literal.RPCLiteralService")
public class RPCLiteralServiceImpl {

	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO, String toCurrency){
		System.out.println("request to currency " + toCurrency);
		Double resAmt = 0.0;
		String resCurrency = toCurrency;
		if(null != toCurrency && "INR".equalsIgnoreCase(toCurrency)){
			if(null != rateRequestBO && null != rateRequestBO.getAmount()){
				if("USD".equalsIgnoreCase(rateRequestBO.getCurrency())){
					resAmt = rateRequestBO.getAmount() * 68;
				}
			}
		}
		ExchangeRateBO resExchangeRateBO = new ExchangeRateBO(resCurrency, resAmt);

		return resExchangeRateBO;
	}
}
