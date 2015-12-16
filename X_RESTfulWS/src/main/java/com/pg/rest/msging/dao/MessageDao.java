package com.pg.rest.msging.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.pg.rest.msging.bo.MessageBo;

public class MessageDao {

	private static List<MessageBo> msgList = null;

	static{
		msgList = new ArrayList<MessageBo>(0);
		msgList.add(new MessageBo(1, "Hello !!", new Date(Calendar.getInstance()
				.getTimeInMillis()), "pradhap"));
		msgList.add(new MessageBo(2, "Hi !!!",
				new Date(Calendar.getInstance().getTimeInMillis()), "ganesan"));	
			
	}
	
	public static List<MessageBo> getMessages(){
		return msgList;
	}
	
}
