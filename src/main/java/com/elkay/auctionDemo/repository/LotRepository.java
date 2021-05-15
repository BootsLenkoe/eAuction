package com.elkay.auctionDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elkay.auctionDemo.model.Lot;

@Repository
public interface LotRepository extends CrudRepository<Lot, Long> {

	public List<Lot> findByBidId(long bidId);
}
