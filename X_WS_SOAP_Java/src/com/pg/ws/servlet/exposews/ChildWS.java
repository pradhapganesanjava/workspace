package com.pg.ws.servlet.exposews;

import javax.jws.WebService;

@WebService
public interface ChildWS extends OneLevelSuper{
	public void childM1(); 
}


interface OneLevelSuper extends TwoLevelSuper{
	public void oneLevel();
}

@WebService
interface TwoLevelSuper{
	public void twoLevel();
}