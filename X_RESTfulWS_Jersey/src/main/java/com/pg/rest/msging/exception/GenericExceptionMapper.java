package com.pg.rest.msging.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.pg.rest.msging.bo.ErrorMessage;

//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage errMsg = new ErrorMessage(500,exception.getMessage(),"http://google.com");
		return Response.status(Status.NOT_FOUND).entity(errMsg).build();	
	}
	
}
