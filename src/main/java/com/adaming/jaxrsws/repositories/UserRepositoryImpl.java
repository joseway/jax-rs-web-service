package com.adaming.jaxrsws.repositories;

import java.util.ArrayList;
import java.util.List;

import com.adaming.jaxrsws.models.User;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		User u1 = new User(1, "James", "james@james.com");
		User u2 = new User(2, "Audrey", "audrey@james.com"); 
		User u3 = new User(3, "Sarah", "sarah@james.com"); 
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		return users;
	}

	@Override
	public User save(User user) {
		List<User> users = findAll();		
		User last = findAll().get(users.size() - 1);
		user.setId(last.getId() + 1);
		System.out.println("Total avant " + users.size());
		users.add(user);
		System.out.println("Total apres " + users.size());
		return user;
	}

	@Override
	public User findById(Integer id) {
	
		List<User> all = findAll();
		for(User u : all) {
			if(id == u.getId()) {
				return u;
			}
		}
		
		return null;
	}

	@Override
	public User deleleById(Integer id) {
		List<User> all = findAll();
		System.out.println("Total avant " + all.size());
		User temp = findById(id);
		all.remove(temp);
		System.out.println("Total apres " + all.size());
		return temp;
	}

}
