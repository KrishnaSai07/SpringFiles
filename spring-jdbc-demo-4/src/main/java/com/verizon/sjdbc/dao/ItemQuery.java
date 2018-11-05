package com.verizon.sjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

import com.verizon.sjdbc.model.Item;


public class ItemQuery extends MappingSqlQuery<Item>{

	
	
	
	public ItemQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemQuery(DataSource ds, String sql) {
		super(ds, sql);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Item item = new Item();
		item.setiCode(rs.getInt(1));
		item.setiName(rs.getString(2));
		item.setiPrice(rs.getDouble(3));
		return item;
		
	}

}
