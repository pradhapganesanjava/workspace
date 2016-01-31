package com.pg.ws.binding.service.helper;

import com.pg.ws.binding.bo.ExchangeRateBO;
import com.pg.ws.binding.bo.ExchangeRateRequestBO;

public class BindingTestServiceHelper {

	public static ExchangeRateBO getExchangeRateImpl(ExchangeRateRequestBO rateRequestBO,
			String toCurrency) {
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
