package com.pg.rest.msging.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.pg.rest.msging.bo.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	private static final long serialVersionUID = 1L;

	
	
	@Override
	public Response toResponse(DataNotFoundException exception) {
		ErrorMessage errMsg = new ErrorMessage(500,exception.getMessage(),"http://google.com");
		System.out.println("DataNotfoundExcep Mapper is called ..111.");
		return Response.status(Status.NOT_FOUND).entity(errMsg).build();
	}
}
