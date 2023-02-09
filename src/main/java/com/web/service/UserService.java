package com.web.service;

import com.web.model.User;

public interface UserService {

	public User saveUser(User u);
	public void deleteUser(Integer id);
}
