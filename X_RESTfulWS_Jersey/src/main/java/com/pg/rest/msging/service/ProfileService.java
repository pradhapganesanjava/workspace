package com.pg.rest.msging.service;

import java.util.List;

import com.pg.rest.msging.bo.ProfileBo;
import com.pg.rest.msging.dao.ProfileDao;

public class ProfileService {

	private List<ProfileBo> profList = ProfileDao.getProfiles();

	public ProfileService() {

	}

	public List<ProfileBo> getProfiles() {
		return profList;
	}

	public ProfileBo getProfile(String profName) {
		for(ProfileBo profBo : profList){
			if(null != profName && profName.equalsIgnoreCase(profBo.getProfName())){
				return profBo;
			}
		}
		return null;
	}

	public List<ProfileBo> addProfile(ProfileBo profBo) {
		if(null != profBo){
			profBo.setId(profList.size() + 1);
			profList.add(profBo);
			return profList;
		}
		return profList;
	}

	public List<ProfileBo> updateProfile(ProfileBo profBo) {
		if(null != profBo){
			for(ProfileBo profBoLocal : profList){
				if(profBoLocal.getId() == profBo.getId()
						|| profBoLocal.getProfName().equalsIgnoreCase(profBo.getProfName())){
					profBoLocal.setProfName(profBo.getProfName());
					profBoLocal.setFullName(profBo.getFullName());
					break;
				}
			}
		}
		return profList;
	}

	public List<ProfileBo> removeProfile(String profName) {
		for(ProfileBo profBoLocal : profList){
			if(null != profName && profName.equalsIgnoreCase(profBoLocal.getProfName())){
				profList.remove(profBoLocal);
				break;
			}
		}
		return profList;
	}
}
