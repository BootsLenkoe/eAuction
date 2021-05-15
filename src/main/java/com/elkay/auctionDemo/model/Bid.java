package com.elkay.auctionDemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "bid")
public class Bid {
	@Id
	@GeneratedValue
	private long id;
	
	private double bidAmount;
	
	@CreatedDate
	private Date bidDate;
	
	@ManyToOne
	private User user;
	
	public Bid() {
	}

	public Bid(long id, double bidAmount, Date bidDate, long userId) {
		super();
		this.id = id;
		this.bidAmount = bidAmount;
		this.bidDate = bidDate;
		this.user = new User(userId,"","","","","",0,0,0);
	}

	public Date getBidDate() {
		return bidDate;
	}

	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
}
