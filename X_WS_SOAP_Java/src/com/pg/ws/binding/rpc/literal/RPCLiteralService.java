package com.pg.ws.binding.rpc.literal;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC, use=SOAPBinding.Use.LITERAL)
public interface RPCLiteralService {
	//@WebMethod
	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO, String toCurrency);
}
