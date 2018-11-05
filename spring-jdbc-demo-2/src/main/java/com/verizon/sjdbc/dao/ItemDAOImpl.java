package com.verizon.sjdbc.dao;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.verizon.sjdbc.model.Item;

@Repository
public class ItemDAOImpl implements ItemDAO {

	private NamedParameterJdbcTemplate jmtp;
	@Autowired
	private ItemRowMapper rowMapper;
	
	@Autowired
	public ItemDAOImpl(DataSource ds) {
		this.jmtp=new NamedParameterJdbcTemplate(ds);
	}

	@Override
	public void addItem(Item item) {
		jmtp.update(IQueryMapper.INS_ITEM_QRY,
				new BeanPropertySqlParameterSource(item));

	}

	@Override
	public void removeItem(int iCode) {
		// TODO Auto-generated method stub
		jmtp.update(IQueryMapper.DEL_ITEM_QRY,Collections.singletonMap("iCode", iCode));


	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		jmtp.update(IQueryMapper.UPD_ITEM_QRY,
				new BeanPropertySqlParameterSource(item));


	}

	@Override
	public Item getItem(int iCode) {
	
		// TODO Auto-generated method stub
		List<Item> items=jmtp.query(IQueryMapper.GET_ITEM_QRY,
				Collections.singletonMap("iCode", iCode),
				rowMapper);
				
		return items!=null && items.size()>0?items.get(0):null;
	}

	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return jmtp.query(IQueryMapper.GET_ALL_INS_ITEM_QRY,
				rowMapper);
				
	}

}
