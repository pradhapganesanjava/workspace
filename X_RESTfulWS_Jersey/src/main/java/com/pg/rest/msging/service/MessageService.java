package com.pg.rest.msging.service;

import java.util.List;

import com.pg.rest.msging.bo.MessageBo;
import com.pg.rest.msging.dao.MessageDao;

public class MessageService {

	private List<MessageBo> msgList = MessageDao.getMessages();

	public MessageService() {
		
	}

	public List<MessageBo> getMessages() {
		return msgList;
	}

	public MessageBo getMessage(long Id) {
		for(MessageBo msgBo : msgList){
			if(msgBo.getId() == Id){
				return msgBo;
			}
		}
		return null;
	}

	public List<MessageBo> addMessage(MessageBo msgBo) {
		if(null != msgBo){
			msgBo.setId(msgList.size()+1);
			msgList.add(msgBo);
			return msgList;
		}
		return msgList;
	}

	public List<MessageBo> updateMessage(MessageBo msgBo) {
		if(null != msgBo){
			for(MessageBo msgBoLocal : msgList){
				if(msgBoLocal.getId() == msgBo.getId()){
					msgBoLocal.setMessage(msgBo.getMessage());
					msgBoLocal.setCreatedBy(msgBo.getCreatedBy());
					msgBoLocal.setCreatedDt(msgBo.getCreatedDt());
					break;
				}
			}
		}
		return msgList;
	}

	public List<MessageBo> removeMessage(long Id) {
		for(MessageBo msgBoLocal : msgList){
			if(msgBoLocal.getId() == Id){
				msgList.remove(msgBoLocal);
				break;
			}
		}
		return msgList;
	}
}
