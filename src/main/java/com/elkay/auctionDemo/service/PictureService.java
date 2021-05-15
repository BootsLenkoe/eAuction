package com.elkay.auctionDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkay.auctionDemo.model.Picture;
import com.elkay.auctionDemo.repository.PictureRepository;

@Service
public class PictureService {
	@Autowired
	private PictureRepository pictureRepository;
	
	public List<Picture> getAllPictures(){
		
		List<Picture> pictureList = new ArrayList<>();
		pictureRepository.findAll().forEach(pictureList::add);
		return pictureList;
	}
	
	public Picture getPicture(long id) {
		return pictureRepository.findById(id).orElse(null);
	}
	
	public void createPicture(Picture picture) {
		pictureRepository.save(picture);
	}
	
	public void updatePicture(long id, Picture picture) {
		pictureRepository.save(picture);
	}
	
	public void deletePicture(long id) {
		pictureRepository.deleteById(id);
	}
}
