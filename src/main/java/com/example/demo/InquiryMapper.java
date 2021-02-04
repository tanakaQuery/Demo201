package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InquiryMapper implements RowMapper<InquiryData> {
	public InquiryData mapRow(ResultSet rs, int rowNum) throws SQLException {

		InquiryData inquiry = new InquiryData();

		inquiry.setInquiryId(rs.getInt("id"));
		inquiry.setHouseId(rs.getInt("houseID"));
		inquiry.setBuyerName(rs.getString("buyerName"));

		return inquiry;
	}

}
