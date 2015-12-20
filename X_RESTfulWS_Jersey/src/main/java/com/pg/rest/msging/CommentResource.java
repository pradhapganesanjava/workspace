package com.pg.rest.msging;

import java.net.URI;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import com.pg.rest.msging.bo.CommentBo;
import com.pg.rest.msging.bo.ErrorMessage;
import com.pg.rest.msging.bo.MessageBo;
import com.pg.rest.msging.exception.InvalidURLException;
import com.pg.rest.msging.service.CommentService;
import com.pg.rest.msging.service.MessageService;

@Path("/")
public class CommentResource {

	CommentService commentServ = null;
	MessageService msgServ = null; 
	
	public CommentResource() {
	}
	
	public CommentResource(MessageService msgService) {
		this.msgServ = msgService;
		commentServ = new CommentService(msgService);
	}

	@GET
	@Produces({MediaType.TEXT_XML})
	public List<CommentBo> getComment(@PathParam("msgId") long msgId){
		System.out.println(" msgId "+msgId);
		MessageBo msgBo = msgServ.getMessage(msgId);
		System.out.println(" msgBo "+msgBo);
		List<CommentBo> commentBoLst = msgBo.getCommentBo();
		//return Response.ok(commentBoLst).build();
		return commentBoLst;
	}
	
	

	//can access parent resource parameter as well...
	@GET
	@Path("{commentId}")
	public String getComment(@PathParam("msgId") String msgId, @PathParam("commentId") long commentId){

		System.out.println(" comment Id "+commentId);
		if(commentId==0){
			/*Generic Way*/
			//throw new InvalidURLException("Your URL contains inappropirate commentId "+commentId+" -its not a valid URI");
	
			/*Status Code needs to be set in response and throw from root exception*/
			/*ErrorMessage errMsg = new ErrorMessage(Status.INTERNAL_SERVER_ERROR.getStatusCode(),
					commentId + " -its not a valid", "http://google.com");
			Response resp= Response.status(Status.INTERNAL_SERVER_ERROR).entity(errMsg).build();
			throw new WebApplicationException(resp);*/
			
			/*Status code no need to be set and throw specific exception*/
			ErrorMessage errMsg = new ErrorMessage(Status.INTERNAL_SERVER_ERROR.getStatusCode(),
					commentId + " -its not a valid", "http://google.com");
			//Response resp= ResponseBuilder.;
			throw new NotFoundException(commentId + " -its not a valid");
			
		}
		
		return "for messageId "+msgId+ ", your comment id is "+commentId;
	}
	
	@POST
	@Path("{comment}")
	public Response addComment(@PathParam("msgId") long msgId,@PathParam("comment") String comment, @Context UriInfo uriInfo){
		MessageBo msgBo = msgServ.getMessage(msgId);
		List<CommentBo> commentBoLst = msgBo.getCommentBo();
		CommentBo commentBo = commentServ.addComment(new CommentBo(comment));
		URI absUri = uriInfo.getAbsolutePathBuilder().build(commentBo.getId());
		commentBoLst.add(commentBo);
		
		return Response.created(absUri).entity(commentBoLst).build();
	}
}
