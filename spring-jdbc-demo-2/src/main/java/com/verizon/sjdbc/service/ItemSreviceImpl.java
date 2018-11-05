package com.verizon.sjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.sjdbc.dao.ItemDAO;
import com.verizon.sjdbc.model.Item;

@Service
public class ItemSreviceImpl implements ItemService {

	@Autowired
	private ItemDAO itemDao;
	
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.addItem(item);

	}

	@Override
	public void removeItem(int iCode) {
		// TODO Auto-generated method stub
        itemDao.removeItem(iCode);
	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
         itemDao.updateItem(item);
	}

	@Override
	public Item getItem(int iCode) {
		// TODO Auto-generated method stub
		return itemDao.getItem(iCode);
	}

	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return itemDao.getItems();
	}

	@Override
	public boolean exists(int iCode) {
		// TODO Auto-generated method stub
		return itemDao.getItem(iCode)!=null;
	}

}
