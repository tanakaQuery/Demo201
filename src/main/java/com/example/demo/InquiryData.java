package com.example.demo;

public class InquiryData {

	private int inquiryId;
	private int houseId;
	private String buyerName;

    public InquiryData() {
        super();
    }

	public InquiryData(int inquiryId, int houseId, String buyerName) {
		super();
		this.inquiryId = inquiryId;
		this.houseId = houseId;
		this.buyerName = buyerName;
	}


	public int getInquiryId() {
		return inquiryId;
	}


	public void setInquiryId(int inquiryId) {
		this.inquiryId = inquiryId;
	}


	public int getHouseId() {
		return houseId;
	}


	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}


	public String getBuyerName() {
		return buyerName;
	}


	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

}
