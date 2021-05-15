package com.elkay.auctionDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elkay.auctionDemo.model.Auction;
import com.elkay.auctionDemo.service.AuctionService;

@Controller
public class AuctionController {
	@Autowired
	private AuctionService auctionService;
	
	@RequestMapping("/addresses/{addressId}/users/{userId}/bids/{bidId}/auctions")
	public List<Auction> getAllAuctions(){
		return auctionService.getAllAuctions();
	}
	
	@RequestMapping("/addresses/{addressId}/users/{userId}/bids/{bidId}/auctions/{id}")
	public Auction getAuction(@PathVariable long id) {
		return auctionService.getAuction(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= {"/addresses/{addressId}/users/{userId}/bids/{bidId}/auctions"})
	public void createAuction(@RequestBody Auction auction, @PathVariable long addressId, @PathVariable long userId, 
			@PathVariable long bidId) {
		auctionService.createAuction(auction);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = {"/addresses/{addressId}/users/{userId}/bids/{bidId}/auctions/{id}"})
	public void updateAuction(@RequestBody Auction auction, @PathVariable long id, @PathVariable long bidId, 
			@PathVariable long userId, @PathVariable long AddressId) {
		auctionService.updateAuction(id, auction);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value= {"/addresses/{addressId}/users/{userId}/bids/{bidId}/auctions/id"})
	public void deleteAuction(@PathVariable long id) {
		auctionService.deleteAuction(id);
	}
	
}
