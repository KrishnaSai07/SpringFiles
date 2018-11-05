package com.verizon.sjdbc.dao;

public interface IQueryMapper {

	public static final String INS_ITEM_QRY=
			" INSERT INTO items VALUES(?,?,?)";
	
	public static final String UPD_ITEM_QRY=
			" UPDATE items SET iName=?,iPrice=? WHERE iCode=?";
	public static final String DEL_ITEM_QRY=
			" DELETE from items WHERE iCode=? ";
	public static final String GET_ITEM_QRY=
			" SELECT * FROM items WHERE iCode=?";
	public static final String GET_ALL_INS_ITEM_QRY=
			" SELECT * FROM items";
	
	
}
