package com.elkay.auctionDemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elkay.auctionDemo.model.Picture;
import com.elkay.auctionDemo.service.PictureService;

@RestController
public class PictureContorller {
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pictures")
	public List<Picture> getAllPictures() {
		return pictureService.getAllPictures();
	}
	
	@RequestMapping("/pictures/{id}")
	public Picture getPicture(@PathVariable long id) {
		return pictureService.getPicture(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/pictures")
	public void createPicture(@RequestBody Picture picture) {
		pictureService.createPicture(picture);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/pictures/{id}")
	public void updatePicture(@PathVariable long id, @RequestBody Picture picture) {
		pictureService.updatePicture(id, picture);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/pictures/{id}")
	public void deletePicture(@PathVariable long id) {
		pictureService.deletePicture(id);
	}
}
