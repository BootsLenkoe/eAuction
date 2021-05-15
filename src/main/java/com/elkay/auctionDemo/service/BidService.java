package com.elkay.auctionDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkay.auctionDemo.model.Bid;
import com.elkay.auctionDemo.repository.BidRepository;

@Service
public class BidService {
	@Autowired
	private BidRepository bidRepository;
	
	public List<Bid> getAllBids(){
		List<Bid> bidList = new ArrayList<>();
		bidRepository.findAll()
		.forEach(bidList::add);
		return bidList;
	}
	
	public List<Bid> getBidsByUserId(long userId){
		List<Bid> bidList = new ArrayList<>();
		bidRepository.findByUserId(userId)
		.forEach(bidList::add);
		return bidList;
	}
	
	public Bid getBid(long id) {
		return bidRepository.findById(id).orElse(null);
	}
	
	public void createBid(Bid bid) {
		bidRepository.save(bid);
	}
	
	public void updateBid(long id, Bid bid) {
		bidRepository.save(bid);
	}

	public void deleteBid(long id) {
		bidRepository.deleteById(id);
	}
	
}
