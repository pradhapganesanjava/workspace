package com.pg.rest.msging.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String errorMsg) {
		super(errorMsg);
	}
	
}
