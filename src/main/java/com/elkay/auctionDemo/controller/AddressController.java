package com.elkay.auctionDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.elkay.auctionDemo.model.Address;
import com.elkay.auctionDemo.service.AddressService;


@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/addresses")
	public List<Address> getAllAddresses(){
		return addressService.getAllAddresses();
	}
	
	@RequestMapping("/addresses/{id}")
	public Address getAddress(@PathVariable("id") long id) {
		return addressService.getAddress(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addresses")
	public void addAddress(@RequestBody Address address) {
		addressService.createAddress(address);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/addresses/{id}")
	public void updateAddress(@RequestBody Address address, @PathVariable("id") long id) {
		addressService.updateAddress(id, address);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/address/{id}")
	public void deleteAddress(@PathVariable("id") long id) {
		addressService.deleteAddress(id);
	}
}
