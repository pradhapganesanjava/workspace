
package com.pg.ws.binding.client.doc.literal.wrap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DocLiteralWrapService", targetNamespace = "http://wrap.literal.doc.binding.ws.pg.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DocLiteralWrapService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.pg.ws.binding.client.doc.literal.wrap.ExchangeRateBO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExchangeRate", targetNamespace = "http://wrap.literal.doc.binding.ws.pg.com/", className = "com.pg.ws.binding.client.doc.literal.wrap.GetExchangeRate")
    @ResponseWrapper(localName = "getExchangeRateResponse", targetNamespace = "http://wrap.literal.doc.binding.ws.pg.com/", className = "com.pg.ws.binding.client.doc.literal.wrap.GetExchangeRateResponse")
    public ExchangeRateBO getExchangeRate(
        @WebParam(name = "arg0", targetNamespace = "")
        ExchangeRateRequestBO arg0);

}
