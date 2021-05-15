package com.elkay.auctionDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String surname;
	private String email;
	private String password;
	private String contactNo;
	private int active;
	private int blacklist;
	
	@ManyToOne
	private Address address;
	
	public User() {
		
	}
	
	public User(long id, String firstname, String surname, String email, String password, String contactNo, int active,
			int blacklist, long addressId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.active = active;
		this.blacklist = blacklist;
		this.address = new Address(addressId,"","","","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getBlacklist() {
		return blacklist;
	}

	public void setBlacklist(int blacklist) {
		this.blacklist = blacklist;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
