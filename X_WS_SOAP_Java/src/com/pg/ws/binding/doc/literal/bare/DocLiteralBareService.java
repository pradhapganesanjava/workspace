package com.pg.ws.binding.doc.literal.bare;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.pg.ws.binding.bo.ExchangeRateBO;
import com.pg.ws.binding.bo.ExchangeRateRequestBO;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DocLiteralBareService {
	@WebMethod
	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO);
}
