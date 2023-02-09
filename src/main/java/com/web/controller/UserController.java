package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.User;
import com.web.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public User save(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.deleteUser(id);
	}
	
}
