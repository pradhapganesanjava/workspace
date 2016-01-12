/**
 * HelloService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pg.ws.basics;

/**
 * @author  pganesan
 */
public interface HelloService extends javax.xml.rpc.Service {
    /**
	 * @uml.property  name="helloAddress"
	 */
    public java.lang.String getHelloAddress();

    /**
	 * @uml.property  name="hello"
	 * @uml.associationEnd  
	 */
    public com.pg.ws.basics.Hello getHello() throws javax.xml.rpc.ServiceException;

    public com.pg.ws.basics.Hello getHello(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
