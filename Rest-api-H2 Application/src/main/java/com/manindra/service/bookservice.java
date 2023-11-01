package com.manindra.service;

import java.util.List;

import com.manindra.entity.book;

public interface bookservice {

	public String upsertbook(book book);
	
	public  List<book> getallbooks();
	
	public String deletebook(Integer bookid);
}
