package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

public class HouseMapper implements RowMapper<ArrayList<HouseData>> {
	public ArrayList<HouseData> mapRow(ResultSet rs, int rowNum) throws SQLException {
		ArrayList<HouseData> houseList = new ArrayList<HouseData>();

		do {
			HouseData house = new HouseData();

			house.setId(rs.getInt("id"));
			house.setHouseName(rs.getString("houseName"));
			house.setHousePrice(rs.getString("housePrice"));
			house.setHouseImage(rs.getString("houseImage"));
			house.setOwnerName(rs.getString("ownerName"));

			houseList.add(house);
		} while (rs.next());


		return houseList;
	}


}
