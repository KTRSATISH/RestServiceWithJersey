package com.rest.services.message.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.services.message.model.UserDetails;
import com.rest.services.message.service.LoginService;

@Path("/login")
public class LoginResource {

	private LoginService loginService = new LoginService();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String loginService(UserDetails userDetails) {
		return loginService.authenticateUser(userDetails);
	}
}
