package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

public class InquiryMapper implements RowMapper<ArrayList<InquiryData>> {
	public ArrayList<InquiryData> mapRow(ResultSet rs, int rowNum) throws SQLException {
		ArrayList<InquiryData> inquiryList = new ArrayList<InquiryData>();

		do {
			InquiryData inquiry = new InquiryData();

			inquiry.setInquiryId(rs.getInt("id"));
			inquiry.setHouseId(rs.getInt("houseID"));
			inquiry.setBuyerName(rs.getString("buyerName"));

			inquiryList.add(inquiry);
		} while (rs.next());


		return inquiryList;
	}

}
