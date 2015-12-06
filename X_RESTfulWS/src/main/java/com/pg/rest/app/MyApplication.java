package com.pg.rest.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.pg.rest.university.UniversityRestWS;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig{

	public MyApplication() {
		super(MultiPartFeature.class,UniversityRestWS.class, LoggingFilter.class);
	}
}
