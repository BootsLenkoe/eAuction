package com.elkay.auctionDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.elkay.auctionDemo.model.Bid;
import com.elkay.auctionDemo.model.User;
import com.elkay.auctionDemo.service.BidService;

@RestController
public class BidController {
	@Autowired
	private BidService bidService;
	
	@RequestMapping("/addresses/{addressId}/users/{userId}/bids")
	public List<Bid> getAllBids(){
		return bidService.getAllBids();
	}
	
	/*@RequestMapping("/addresses/{addressId}/users/{userId}/bids")
	public List<Bid> getBidsByUserId(@PathVariable long userId){
		return bidService.getBidsByUserId(userId);
	}*/
	
	@RequestMapping("/addresses/{addressId}/users/{userId}/bids/{id}")
	public Bid getBid(@PathVariable long id) {
		return bidService.getBid(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addresses/{addressId}/users/{userId}/bids")
	public void addBid(@RequestBody Bid bid, @PathVariable long userId) {
		
		bid.setUser(new User(userId, "","","","","",1,0,0));
		bidService.createBid(bid);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/addresses/{addressId}/users/{userId}/bids/{id}")
	public void updateBid(@RequestBody Bid bid, @PathVariable long addressId, @PathVariable long userId, 
			@PathVariable long id) {
		
		bid.setUser(new User(userId, "","","","","",1,0,addressId));
		bidService.updateBid(id, bid);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/addresses/{addressId}/users/{userId}/bids/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		bidService.deleteBid(id);
	}
}
