package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

public class BuyerMapper implements RowMapper<ArrayList<String>> {
	public ArrayList<String> mapRow(ResultSet rs, int rowNum) throws SQLException {
		ArrayList<String> buyerList = new ArrayList<String>();

		do {
			buyerList.add(rs.getString("name"));

		} while (rs.next());

		return buyerList;
	}

}
