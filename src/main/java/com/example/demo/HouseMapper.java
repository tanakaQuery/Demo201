package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HouseMapper implements RowMapper<HouseData> {
	public HouseData mapRow(ResultSet rs, int rowNum) throws SQLException {
		HouseData house = new HouseData();

		house.setId(rs.getInt("id"));
		house.setHouseName(rs.getString("houseName"));
		house.setHousePrice(rs.getString("housePrice"));
		house.setHouseImage(rs.getString("houseImage"));
		house.setOwnerName(rs.getString("ownerName"));

		return house;
	}


}
