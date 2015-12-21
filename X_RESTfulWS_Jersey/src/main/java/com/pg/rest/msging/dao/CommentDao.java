package com.pg.rest.msging.dao;

import java.util.ArrayList;
import java.util.List;

import com.pg.rest.msging.bo.CommentBo;

public class CommentDao {

	private static List<CommentBo> commentList = null;

	static{
		commentList = new ArrayList<CommentBo>(0);
		commentList.add(new CommentBo(1, "congrats !"));
		commentList.add(new CommentBo(2, "awesome !!"));
		commentList.add(new CommentBo(3, "good show !!!"));
	}

	public static List<CommentBo> getComments() {
		return commentList;
	}

}
