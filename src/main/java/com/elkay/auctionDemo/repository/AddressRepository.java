package com.elkay.auctionDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elkay.auctionDemo.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
