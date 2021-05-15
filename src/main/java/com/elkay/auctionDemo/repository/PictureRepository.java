package com.elkay.auctionDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elkay.auctionDemo.model.Picture;

@Repository
public interface PictureRepository extends CrudRepository<Picture, Long> {

}
