package com.elkay.auctionDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.elkay.auctionDemo.model.Address;
import com.elkay.auctionDemo.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> getAllAddresses(){
		List<Address> addressList = new ArrayList<>();
		addressRepository.findAll()
		.forEach(addressList::add);
		return addressList;
	}
	
	public Address getAddress(long id) {
		return addressRepository.findById(id).orElse(null);
	}
	
	public void createAddress(Address address) {
		addressRepository.save(address);
	}
	
	public void updateAddress(long id, Address address) {
		addressRepository.save(address);
	}

	public void deleteAddress(long id) {
		addressRepository.deleteById(id);
	}
}
