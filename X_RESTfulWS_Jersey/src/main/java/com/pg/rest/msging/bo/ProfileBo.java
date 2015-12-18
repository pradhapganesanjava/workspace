package com.pg.rest.msging.bo;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ProfileBo {
	
	private long Id;
	private String profName;
	private String fullName;
	
	public ProfileBo() {
	}
	
	public ProfileBo(long Id, String profName) {
		this.Id = Id;
		this.profName = profName;
	}

	public ProfileBo(long Id, String profName, String fullName) {
		this.Id = Id;
		this.profName = profName;
		this.fullName = fullName;
	}

	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}

	public String getProfName() {
		return profName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
