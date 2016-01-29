
package com.pg.ws.client.stub.math;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pg.ws.client.stub.math package. 
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

    private final static QName _GetSquareResponse_QNAME = new QName("http://math.simpleserver.ws.pg.com/", "getSquareResponse");
    private final static QName _GetSquare_QNAME = new QName("http://math.simpleserver.ws.pg.com/", "getSquare");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pg.ws.client.stub.math
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSquareResponse }
     * 
     */
    public GetSquareResponse createGetSquareResponse() {
        return new GetSquareResponse();
    }

    /**
     * Create an instance of {@link GetSquare }
     * 
     */
    public GetSquare createGetSquare() {
        return new GetSquare();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://math.simpleserver.ws.pg.com/", name = "getSquareResponse")
    public JAXBElement<GetSquareResponse> createGetSquareResponse(GetSquareResponse value) {
        return new JAXBElement<GetSquareResponse>(_GetSquareResponse_QNAME, GetSquareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSquare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://math.simpleserver.ws.pg.com/", name = "getSquare")
    public JAXBElement<GetSquare> createGetSquare(GetSquare value) {
        return new JAXBElement<GetSquare>(_GetSquare_QNAME, GetSquare.class, null, value);
    }

}
