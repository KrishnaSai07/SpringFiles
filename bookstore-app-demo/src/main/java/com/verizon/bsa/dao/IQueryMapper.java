package com.verizon.bsa.dao;

public interface IQueryMapper {
	
	public static final String INS_BOOK_QUERY =
			" INSERT INTO books VALUES(?,?,?,?,?)";
	public static final String DEL_BOOK_QUERY =
			" DELETE FROM books WHERE bcode=?";
	public static final String UPDATE_BOOK_QUERY ="";
	public static final String GET_BOOK_QUERY ="";
	public static final String GET_ALL_BOOK_QUERY ="";
	
	

}
