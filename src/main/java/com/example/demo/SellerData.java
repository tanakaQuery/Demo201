package com.example.demo;

public class SellerData {

	private String name;
	private int houseID;

	public SellerData() {
		super();
	}

	public SellerData(String name, int houseID) {
		super();
		this.name = name;
		this.houseID = houseID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHouseID() {
		return houseID;
	}
	public void setHouseID(int houseID) {
		this.houseID = houseID;
	}



}
