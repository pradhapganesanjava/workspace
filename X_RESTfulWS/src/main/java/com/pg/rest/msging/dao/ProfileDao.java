package com.pg.rest.msging.dao;

import java.util.ArrayList;
import java.util.List;

import com.pg.rest.msging.bo.ProfileBo;

public class ProfileDao {

	private static List<ProfileBo> profList = null;

	static{
		profList = new ArrayList<ProfileBo>(0);
		profList.add(new ProfileBo(1, "pradhap", "pradhap ganesan"));
		profList.add(new ProfileBo(2, "ganesan", "ganesan laxman"));
	}

	public static List<ProfileBo> getProfiles() {
		return profList;
	}

}
