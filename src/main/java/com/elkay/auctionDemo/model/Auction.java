package com.elkay.auctionDemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Auction {
	@Id
	@GeneratedValue
	private long id;
	
	private String auctionType;
	private String location;
	private String description;
	private Date startdate;
	private Date duration;
	private int active;
	
	@ManyToOne
	private Lot lot;
	
	public Auction() {
		super();
	}

	public Auction(long id, String auctionType, String location, String description, Date startdate, Date duration,
			int active, long lotId) {
		this.id = id;
		this.auctionType = auctionType;
		this.location = location;
		this.description = description;
		this.startdate = startdate;
		this.duration = duration;
		this.active = active;
		this.lot = new Lot(lotId,"","",0,1,null,1,1);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuctionType() {
		return auctionType;
	}

	public void setAuctionType(String auctionType) {
		this.auctionType = auctionType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}
	
}
