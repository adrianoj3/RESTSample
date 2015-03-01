package org.prz.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class SampleService {

	@GET
	public Response sampleResponse(){
		
		return Response.status(200).entity("dziala").build();
	}
}
