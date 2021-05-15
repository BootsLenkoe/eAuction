package com.elkay.auctionDemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "lot")
public class Lot {
	@Id
	@GeneratedValue
	private long id;
	
	private String itemName;
	private String itemDescription;
	private double minBidAmount;
	private int active;
	
	@CreatedDate
	private Date lotDate;
	
	@ManyToOne
	private Bid bid;
	
	@ManyToOne
	private Picture picture;

	public Lot() {
	}

	public Lot(long id, String itemName, String itemDescription, double minBidAmount, int active, Date lotDate, long bidId,
			long pictureId) {
		this.id = id;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.minBidAmount = minBidAmount;
		this.active = active;
		this.lotDate = lotDate;
		this.bid = new Bid(bidId,0,null,0);
		this.picture = new Picture(pictureId, null, "");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getMinBidAmount() {
		return minBidAmount;
	}

	public void setMinBidAmount(double minBidAmount) {
		this.minBidAmount = minBidAmount;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getLotDate() {
		return lotDate;
	}

	public void setLotDate(Date lotDate) {
		this.lotDate = lotDate;
	}

	public Bid getBid() {
		return bid;
	}

	public void setBid(Bid bid) {
		this.bid = bid;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	
}
