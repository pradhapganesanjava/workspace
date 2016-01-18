package com.pg.ws.servlet.exposews;

import javax.jws.WebService;

@WebService(name = "ChildWSImplPortType", 
			serviceName = "ChildWSService")
public class ChildWSImpl implements ChildWS{
	public void childWSImplMethod(){return;}
	@Override
	public void childM1() {}
	@Override
	public void oneLevel() {}
	@Override
	public void twoLevel() {}
}
