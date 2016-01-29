package com.pg.ws.binding.rpc.literal;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class ExchangeRateRequestBO {

	//INR, USD, EUR
	private String currency;
	private Double amount;
	
	public ExchangeRateRequestBO() {
		this(null, 0.0);
	}

	public ExchangeRateRequestBO(String currency, Double amount){
		this.currency = currency;
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return String.format("ExchangeRateRequestBO: [currency:%s, amount:%f ]", currency,amount);
	}

}
