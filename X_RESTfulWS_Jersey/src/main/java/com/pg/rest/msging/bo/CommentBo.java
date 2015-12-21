package com.pg.rest.msging.bo;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class CommentBo {
	
	private long Id;
	private String comment;
	
	public CommentBo() {
	}
	
	public CommentBo(String comment) {
		this.comment = comment;
	}
	
	public CommentBo(long Id, String comment) {
		this.Id = Id;
		this.comment = comment;
	}

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
