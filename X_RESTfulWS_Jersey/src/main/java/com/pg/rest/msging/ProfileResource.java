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

import com.pg.rest.msging.bo.ProfileBo;
import com.pg.rest.msging.service.ProfileService;

@Path("/profiles")
@Produces(MediaType.TEXT_XML + "," + MediaType.APPLICATION_JSON)
@Consumes(MediaType.TEXT_XML + "," + MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profService = new ProfileService();

	@GET
	public List<ProfileBo> getProfiles() {
		return profService.getProfiles();
	}

	@GET
	@Path("/{profName}")
	public ProfileBo getProfile(@PathParam("profName") String profName) {
		return profService.getProfile(profName);
	}

	@POST
	public List<ProfileBo> addProfile(ProfileBo profileBo) {
		return profService.addProfile(profileBo);
	}

	@PUT
	@Path("/{profName}")
	public List<ProfileBo> updateProfile(@PathParam("profName") String profName, ProfileBo profileBo) {
		if(null != profileBo){
			profileBo.setProfName(profName);
		}
		return profService.updateProfile(profileBo);
	}

	@DELETE
	@Path("/{profName}")
	public List<ProfileBo> deleteProfile(@PathParam("profName") String profName) {
		return profService.removeProfile(profName);
	}
}
