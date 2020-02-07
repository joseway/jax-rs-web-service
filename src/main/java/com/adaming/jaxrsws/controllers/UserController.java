package com.adaming.jaxrsws.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.adaming.jaxrsws.models.User;
import com.adaming.jaxrsws.repositories.UserRepository;
import com.adaming.jaxrsws.repositories.UserRepositoryImpl;

@Path("/users")
public class UserController {
	
	private UserRepository userRepository = new UserRepositoryImpl();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers() {		
		return userRepository.findAll();
	}
	@GET
	@Path("{id}")
	public User findById(@PathParam("id")Integer id) {
		return userRepository.findById(id);
	}
	@DELETE
	@Path("{id}")
	public User deleteById(@PathParam("id")Integer id) {
		return userRepository.deleleById(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public User save(User user) {
		return userRepository.save(user);
	}
}
