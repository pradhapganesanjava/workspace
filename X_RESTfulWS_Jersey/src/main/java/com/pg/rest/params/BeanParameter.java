package com.pg.rest.params;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

public class BeanParameter {
	
	private @PathParam("paramType") String paramType;
	private @QueryParam("all") boolean isAll;
	private @MatrixParam("start") int start;
	private @MatrixParam("count") int count;
	
	private @Context UriInfo uriInfo;
	private @Context HttpHeaders httpHead;
	
	public String getParamType() {
		return paramType;
	}
	public boolean isAll() {
		return isAll;
	}
	public int getStart() {
		return start;
	}
	public int getCount() {
		return count;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public void setAll(boolean isAll) {
		this.isAll = isAll;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public UriInfo getUriInfo() {
		return uriInfo;
	}
	public HttpHeaders getHttpHead() {
		return httpHead;
	}
	public void setUriInfo(UriInfo uriInfo) {
		this.uriInfo = uriInfo;
	}
	public void setHttpHead(HttpHeaders httpHead) {
		this.httpHead = httpHead;
	}
	
	
}
