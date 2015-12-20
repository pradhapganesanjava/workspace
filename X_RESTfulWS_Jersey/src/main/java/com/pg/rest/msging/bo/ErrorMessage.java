package com.pg.rest.msging.bo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errorMsg;
	private String document;
	private int errorCode;
	
	public ErrorMessage() {
	}
	
	public ErrorMessage(int errorCode, String errorMsg, String document) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.document = document;
	}
	
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public String getDocument() {
		return document;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
