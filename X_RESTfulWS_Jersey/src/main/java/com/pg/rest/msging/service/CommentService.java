package com.pg.rest.msging.service;

import java.util.List;

import com.pg.rest.msging.bo.CommentBo;
import com.pg.rest.msging.bo.MessageBo;
import com.pg.rest.msging.dao.CommentDao;

public class CommentService {

	private List<CommentBo> commentList = CommentDao.getComments();
	private MessageService msgServ = null;
	
	public CommentService() {

	}
	
	public CommentService(MessageService msgService) {
		this.msgServ = msgService; 
		//commentList = msgService.getMessage(msgBo.getId()).getCommentBo();
	}


	public List<CommentBo> getComments() {
		return commentList;
	}

	public CommentBo getComment(long commentId) {
		for(CommentBo commentBo : commentList){
			if(commentId == commentBo.getId()){
				return commentBo;
			}
		}
		return null;
	}

	public CommentBo addComment(CommentBo commentBo) {
		if(null != commentBo){
			commentBo.setId(commentList.size() + 1);
			commentList.add(commentBo);
		}
		return commentBo;
	}

	public List<CommentBo> updateComment(CommentBo commentBo) {
		if(null != commentBo){
			for(CommentBo commentBoLocal : commentList){
				if(commentBoLocal.getId() == commentBo.getId()){
					commentBoLocal.setComment(commentBo.getComment());
					break;
				}
			}
		}
		return commentList;
	}

	public List<CommentBo> removeComment(long commentId) {
		for(CommentBo commentBoLocal : commentList){
			if(commentId == commentBoLocal.getId()){
				commentList.remove(commentBoLocal);
				break;
			}
		}
		return commentList;
	}
}
