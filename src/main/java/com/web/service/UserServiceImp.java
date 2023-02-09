package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.User;
import com.web.repo.UserRepo;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public User saveUser(User u) {
		return repo.save(u);
	}

	@Override
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}

}
