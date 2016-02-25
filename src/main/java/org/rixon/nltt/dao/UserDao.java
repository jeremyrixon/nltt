package org.rixon.nltt.dao;

import java.util.List;

import org.rixon.nltt.model.User;

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}