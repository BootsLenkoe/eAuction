package com.elkay.auctionDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elkay.auctionDemo.model.Address;
import com.elkay.auctionDemo.model.User;
import com.elkay.auctionDemo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/addresses/{id}/users")
	public List<User> getAllUsers(@PathVariable long id){
		return userService.getAllUsers(id);
	}
	
	@RequestMapping("/addresses/{addressId}/users/{id}")
	public User getUser(@PathVariable("id") long id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addresses/{addressId}/users")
	public void addUser(@RequestBody User user, @PathVariable long addressId) {
		user.setAddress(new Address(addressId,"","","","",""));
		userService.createUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/addresses/{addressId}/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable ("addressId") long addressId, 
			@PathVariable("id") long id) {
		
		user.setAddress(new Address(addressId,"","","","",""));
		userService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/addresses/{addressId}/users/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		userService.deleteUser(id);
	}
}
