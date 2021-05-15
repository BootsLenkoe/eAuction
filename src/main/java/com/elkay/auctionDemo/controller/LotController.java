package com.elkay.auctionDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elkay.auctionDemo.model.Bid;
import com.elkay.auctionDemo.model.Lot;
import com.elkay.auctionDemo.model.Picture;
import com.elkay.auctionDemo.service.LotService;

@RestController
public class LotController {
	@Autowired
	private LotService lotService;
	
	@RequestMapping(method=RequestMethod.GET, value={"/addresses/{addressId}/users/{userId}/bids/{bidId}/lots",
			"/pictures/{pictureId}/lots"})
	public List<Lot> getAllLots(@PathVariable long bidId, @PathVariable long addressId, @PathVariable long userId){
		return lotService.getAllLots(bidId);
	}
	
	@RequestMapping(method=RequestMethod.GET, value={"/addresses/{addressId}/users/{userId}/bids/{bidId}/lots/{id}", 
			"/pictures/{pictureId}/lots/{id}"})
	public Lot getLotById(@PathVariable long id) {
		return lotService.getLotById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value={"/addresses/{addressId}/users/{userId}/bids/{bidId}/lots",
	"/pictures/{pictureId}/lots"})
	public void createLot(@RequestBody Lot lot) {
		lotService.createLot(lot);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value={"/addresses/{addressId}/users/{userId}/bids/{bidId}/lots/{id}",
			"/pictures/{pictureId}/lots/{id}"})
	public void updateLot(@RequestBody Lot lot, @PathVariable long id, @PathVariable long bidId, 
			@PathVariable long userId, @PathVariable long pictureId) {
		
		if(bidId > 0) {
			lot.setBid(new Bid(bidId, 0, null, userId));
		}
		else if(pictureId > 0) {
			lot.setPicture(new Picture(pictureId, null, ""));
		}
		
		lotService.updateLot(id, lot);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value={"/addresses/{addressId}/users/{userId}/bids/{bidId}/lots/{id}",
			"/pictures/{pictureId}/lots/{id}"})
	public void deleteLot(@PathVariable long id, @PathVariable long bidId, @PathVariable long userId, 
			@PathVariable long pictureId) {
		
		lotService.deleteLot(id);
	}
	
}
