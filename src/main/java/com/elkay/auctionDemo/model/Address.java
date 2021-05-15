package com.elkay.auctionDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address{
	
	@Id
	@GeneratedValue
	private Long id;
	private String boxNo;
	private String physicalAddress;
	private String areaCode;
	private String village;
	private String district;
	
	
	public Address() {
	}

	public Address(Long id, String boxNo, String physicalAddress, String areaCode, String village, String district) {
		super();
		this.id = id;
		this.boxNo = boxNo;
		this.physicalAddress = physicalAddress;
		this.areaCode = areaCode;
		this.village = village;
		this.district = district;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
}
