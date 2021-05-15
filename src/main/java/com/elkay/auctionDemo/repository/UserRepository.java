package com.elkay.auctionDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elkay.auctionDemo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public List<User> findByAddressId(Long addressId);
}
