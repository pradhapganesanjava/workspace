
package com.pg.ws.client.handler.universaltime;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pg.ws.client.handler.universaltime package. 
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

    private final static QName _GetCurrentTimeResponse_QNAME = new QName("http://universaltime.handler.ws.pg.com/", "getCurrentTimeResponse");
    private final static QName _GetCurrentTime_QNAME = new QName("http://universaltime.handler.ws.pg.com/", "getCurrentTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pg.ws.client.handler.universaltime
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrentTimeResponse }
     * 
     */
    public GetCurrentTimeResponse createGetCurrentTimeResponse() {
        return new GetCurrentTimeResponse();
    }

    /**
     * Create an instance of {@link GetCurrentTime }
     * 
     */
    public GetCurrentTime createGetCurrentTime() {
        return new GetCurrentTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://universaltime.handler.ws.pg.com/", name = "getCurrentTimeResponse")
    public JAXBElement<GetCurrentTimeResponse> createGetCurrentTimeResponse(GetCurrentTimeResponse value) {
        return new JAXBElement<GetCurrentTimeResponse>(_GetCurrentTimeResponse_QNAME, GetCurrentTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://universaltime.handler.ws.pg.com/", name = "getCurrentTime")
    public JAXBElement<GetCurrentTime> createGetCurrentTime(GetCurrentTime value) {
        return new JAXBElement<GetCurrentTime>(_GetCurrentTime_QNAME, GetCurrentTime.class, null, value);
    }

}
