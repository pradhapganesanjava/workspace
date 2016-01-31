
package com.pg.ws.binding.client.doc.literal.bare;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DocLiteralBareService", targetNamespace = "http://bare.literal.doc.binding.ws.pg.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DocLiteralBareService {


    /**
     * 
     * @param amount
     * @param currency
     */
    @WebMethod
    @RequestWrapper(localName = "getExchangeRate", targetNamespace = "http://bare.literal.doc.binding.ws.pg.com/", className = "com.pg.ws.binding.client.doc.literal.bare.ExchangeRateRequestBO")
    @ResponseWrapper(localName = "getExchangeRateResponse", targetNamespace = "http://bare.literal.doc.binding.ws.pg.com/", className = "com.pg.ws.binding.client.doc.literal.bare.ExchangeRateBO")
    public void getExchangeRate(
        @WebParam(name = "amount", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Double> amount,
        @WebParam(name = "currency", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<String> currency);

}
