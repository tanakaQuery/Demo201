package com.example.demo;

public class HouseData {

	private int id;
	private String houseName;
	private String housePrice;
	private String houseImage;
	private String ownerName;

	public HouseData() {
		super();
	}

	public HouseData(int id, String houseName, String housePrice, String houseImage, String ownerName) {
		this.id = id;
		this.houseName = houseName;
		this.housePrice = housePrice;
		this.houseImage = houseImage;
		this.ownerName = ownerName;

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(String housePrice) {
		this.housePrice = housePrice;
	}
	public String getHouseImage() {
		return houseImage;
	}
	public void setHouseImage(String houseImage) {
		this.houseImage = houseImage;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


}
