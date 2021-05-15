package com.elkay.auctionDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.elkay.auctionDemo.model.User;
import com.elkay.auctionDemo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(long addressId){
		List<User> userList = new ArrayList<>();
		userRepository.findByAddressId(addressId)
		.forEach(userList::add);
		return userList;
	}
	
	public User getUser(long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public void createUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}

}
