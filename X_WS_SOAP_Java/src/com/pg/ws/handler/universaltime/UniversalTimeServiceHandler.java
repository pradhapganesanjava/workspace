package com.pg.ws.handler.universaltime;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public class UniversalTimeServiceHandler implements LogicalHandler<LogicalMessageContext> {

	LogicalMessageContext logicalMessageContext;
	
	@Override
	public boolean handleMessage(LogicalMessageContext context) {
		
		System.out.println("UniversalTimeService LogicalHandler handleMessage");
		
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		if(isRequest){
			System.out.println("its request....");
			System.out.println("request msg:"+context.getMessage());
			System.out.println("request header :"+context.get(MessageContext.HTTP_REQUEST_HEADERS));
		}
		
		if(!isRequest){
			System.out.println("its RESPONSE....");
			System.out.println("RESPONSE msg:"+context.getMessage());
			System.out.println("RESPONSE header :"+context.get(MessageContext.HTTP_REQUEST_HEADERS));
		}
		
		return false;
	}
	
	@Override
	public boolean handleFault(LogicalMessageContext context) {
		return false;
	}
	
	@Override
	public void close(MessageContext context) {
		
	}
	
}
