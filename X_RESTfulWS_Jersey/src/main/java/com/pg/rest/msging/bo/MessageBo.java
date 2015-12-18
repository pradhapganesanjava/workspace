package com.pg.rest.msging.bo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MessageBo {
	
	private long Id;
	private String message;
	private Date createdDt;
	private String createdBy;
	
	public MessageBo() {
	}
	
	public MessageBo(long Id, String message) {
		this.Id = Id;
		this.message = message;
	}

	public MessageBo(long Id, String message, Date createdDt, String createdBy) {
		this.Id = Id;
		this.message = message;
		this.createdDt = createdDt;
		this.createdBy = createdBy;
	}

	
	public long getId() {
		return Id;
	}
	public String getMessage() {
		return message;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setId(long id) {
		Id = id;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
