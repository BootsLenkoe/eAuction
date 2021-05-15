package com.elkay.auctionDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkay.auctionDemo.model.Lot;
import com.elkay.auctionDemo.repository.LotRepository;

@Service
public class LotService {
	@Autowired
	private LotRepository lotRepository;
	
	public List<Lot> getAllLots(long bidId){
		List<Lot> lotList = new ArrayList<>();
		lotRepository.findByBidId(bidId)
		.forEach(lotList::add);
		return lotList;
	}
	
	public Lot getLotById(long id) {
		return lotRepository.findById(id).orElse(null);
	}
	
	public void createLot(Lot lot) {
		lotRepository.save(lot);
	}
	
	public void updateLot(long id, Lot lot) {
		lotRepository.save(lot);
	}
	
	public void deleteLot(long id) {
		lotRepository.deleteById(id);
	}
}
