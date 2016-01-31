package com.pg.ws.handler.universaltime;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class UniversalTimeServiceSoapHandler implements SOAPHandler<SOAPMessageContext> {

	SOAPMessageContext soapMessageContext;

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		System.out.println("UniversalTimeService SOAPHandler handleMessage");

		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		try{
			if(isRequest){
				System.out.println("its request....");
				System.out.println("request msg:" + context.getMessage());

				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHead = soapEnv.getHeader();
				
				if(soapHead != null){
					
				}
				

				System.out.println("request header :"
						+ context.get(MessageContext.HTTP_REQUEST_HEADERS));
				
				soapMsg.writeTo(System.out);
			}

			if(!isRequest){
				System.out.println("its RESPONSE....");
				System.out.println("RESPONSE msg:" + context.getMessage());
				System.out.println("RESPONSE header :"
						+ context.get(MessageContext.HTTP_REQUEST_HEADERS));
				
				
				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				
				soapMsg.writeTo(System.out);
			}
		}catch(Exception ex){
			System.out.println("Excpetion ex " + ex.getMessage());
		}
		return false;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {

	}

}

