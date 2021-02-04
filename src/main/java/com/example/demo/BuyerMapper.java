package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BuyerMapper implements RowMapper<String> {

	public String mapRow(ResultSet rs, int rowNum) throws SQLException {

		String buyerName = rs.getString("name");

		return buyerName;
	}
}
