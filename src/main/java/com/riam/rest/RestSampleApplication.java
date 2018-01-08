package com.riam.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/*")
public class RestSampleApplication extends ResourceConfig {

	public RestSampleApplication() {
		packages("com.ritam.rest");
	}
}
