package com.pg.ws.binding.rpc.literal;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class ExchangeRateBO {

	//INR, USD, EUR
	private String currency;
	private Double amount;
	
	public ExchangeRateBO() {
	}
	
	public ExchangeRateBO(String currency, Double amount) {
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
		return String.format("ExchangeRateBO [currency:%s, amount:%f ]", currency,amount);
	}
}

