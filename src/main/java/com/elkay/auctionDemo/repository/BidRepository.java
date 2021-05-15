package com.elkay.auctionDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elkay.auctionDemo.model.Bid;

@Repository
public interface BidRepository extends CrudRepository<Bid, Long> {
	public List<Bid> findByUserId(long userId);
}
