package com.elkay.auctionDemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "picture")
public class Picture {
	@Id
	@GeneratedValue
	private long id;
	
	@CreatedDate
	private Date pictureDate;
	
	private String pictureName;

	public Picture() {
	}

	public Picture(long id, Date pictureDate, String pictureName) {
		super();
		this.id = id;
		this.pictureDate = pictureDate;
		this.pictureName = pictureName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPictureDate() {
		return pictureDate;
	}

	public void setPictureDate(Date pictureDate) {
		this.pictureDate = pictureDate;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	
}
