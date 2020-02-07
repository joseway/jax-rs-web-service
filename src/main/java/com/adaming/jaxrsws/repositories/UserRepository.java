package com.adaming.jaxrsws.repositories;

import java.util.List;

import com.adaming.jaxrsws.models.User;

public interface UserRepository {

	public List<User> findAll();
	public User save(User user);
	public User findById(Integer id);
	public User deleleById(Integer id);
}
