
package com.pg.ws.binding.client.doc.literal.bare;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pg.ws.binding.client.doc.literal.bare package. 
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

    private final static QName _GetExchangeRateResponse_QNAME = new QName("http://bare.literal.doc.binding.ws.pg.com/", "getExchangeRateResponse");
    private final static QName _GetExchangeRate_QNAME = new QName("http://bare.literal.doc.binding.ws.pg.com/", "getExchangeRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pg.ws.binding.client.doc.literal.bare
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateBO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bare.literal.doc.binding.ws.pg.com/", name = "getExchangeRateResponse")
    public JAXBElement<ExchangeRateBO> createGetExchangeRateResponse(ExchangeRateBO value) {
        return new JAXBElement<ExchangeRateBO>(_GetExchangeRateResponse_QNAME, ExchangeRateBO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateRequestBO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bare.literal.doc.binding.ws.pg.com/", name = "getExchangeRate")
    public JAXBElement<ExchangeRateRequestBO> createGetExchangeRate(ExchangeRateRequestBO value) {
        return new JAXBElement<ExchangeRateRequestBO>(_GetExchangeRate_QNAME, ExchangeRateRequestBO.class, null, value);
    }

}
