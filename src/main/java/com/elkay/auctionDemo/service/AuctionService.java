package com.elkay.auctionDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkay.auctionDemo.model.Auction;
import com.elkay.auctionDemo.repository.AuctionRepository;

@Service
public class AuctionService {
	@Autowired
	private AuctionRepository auctionRepository;
	
	public List<Auction> getAllAuctions(){
		List<Auction> auctionList = new ArrayList<>();
		auctionRepository.findAll().forEach(auctionList::add);
		
		return auctionList;
	}
	
	public Auction getAuction(long id) {
		return auctionRepository.findById(id).orElse(null);
	}
	
	public void createAuction(Auction auction) {
		auctionRepository.save(auction);
	}
	
	public void updateAuction(long id, Auction auction) {
		auctionRepository.save(auction);
	}
	
	public void deleteAuction(long id) {
		auctionRepository.deleteById(id);
	}
}
