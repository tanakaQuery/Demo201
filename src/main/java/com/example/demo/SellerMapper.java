package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SellerMapper implements RowMapper<SellerData> {

	@Override
	public SellerData mapRow(ResultSet rs, int rowNum) throws SQLException {
		SellerData seller = new SellerData();

		seller.setName(rs.getString("name"));
		seller.setHouseID(rs.getInt("houseID"));

		return seller;
	}

}
