package com.elkay.auctionDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elkay.auctionDemo.model.Auction;

@Repository
public interface AuctionRepository extends CrudRepository<Auction, Long> {
}
