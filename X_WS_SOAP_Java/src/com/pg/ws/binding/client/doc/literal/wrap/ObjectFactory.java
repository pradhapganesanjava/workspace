
package com.pg.ws.binding.client.doc.literal.wrap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pg.ws.binding.client.doc.literal.wrap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetExchangeRateResponse_QNAME = new QName("http://wrap.literal.doc.binding.ws.pg.com/", "getExchangeRateResponse");
    private final static QName _GetExchangeRate_QNAME = new QName("http://wrap.literal.doc.binding.ws.pg.com/", "getExchangeRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pg.ws.binding.client.doc.literal.wrap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExchangeRate }
     * 
     */
    public GetExchangeRate createGetExchangeRate() {
        return new GetExchangeRate();
    }

    /**
     * Create an instance of {@link GetExchangeRateResponse }
     * 
     */
    public GetExchangeRateResponse createGetExchangeRateResponse() {
        return new GetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link ExchangeRateBO }
     * 
     */
    public ExchangeRateBO createExchangeRateBO() {
        return new ExchangeRateBO();
    }

    /**
     * Create an instance of {@link ExchangeRateRequestBO }
     * 
     */
    public ExchangeRateRequestBO createExchangeRateRequestBO() {
        return new ExchangeRateRequestBO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wrap.literal.doc.binding.ws.pg.com/", name = "getExchangeRateResponse")
    public JAXBElement<GetExchangeRateResponse> createGetExchangeRateResponse(GetExchangeRateResponse value) {
        return new JAXBElement<GetExchangeRateResponse>(_GetExchangeRateResponse_QNAME, GetExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wrap.literal.doc.binding.ws.pg.com/", name = "getExchangeRate")
    public JAXBElement<GetExchangeRate> createGetExchangeRate(GetExchangeRate value) {
        return new JAXBElement<GetExchangeRate>(_GetExchangeRate_QNAME, GetExchangeRate.class, null, value);
    }

}
