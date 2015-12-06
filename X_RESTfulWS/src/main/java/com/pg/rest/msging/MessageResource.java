package com.pg.rest.msging;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pg.rest.msging.bo.MessageBo;
import com.pg.rest.msging.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService msgService = new MessageService();
	
	@GET
	@Produces(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	public List<MessageBo> getMessages() {
		return msgService.getMessages();
	}
	
	@GET
	@Path("/{msgId}")
	@Produces(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	public MessageBo getMessage(@PathParam("msgId") long Id){
		return msgService.getMessage(Id);
	}
	
	@POST
	@Produces(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	public List<MessageBo> addMessage(MessageBo messageBo){
		return msgService.addMessage(messageBo);
	}
	
	@PUT
	@Path("/{msgId}")
	@Produces(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	public List<MessageBo> updateMessage(@PathParam("msgId") long Id, MessageBo messageBo){
		if(null != messageBo){
			messageBo.setId(Id);
		}
		return msgService.updateMessage(messageBo);
	}

	@DELETE
	@Path("/{msgId}")
	@Produces(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_XML+","+MediaType.APPLICATION_JSON)
	public List<MessageBo> deleteMessage(@PathParam("msgId") long Id){
		return msgService.removeMessage(Id);
	}
}
