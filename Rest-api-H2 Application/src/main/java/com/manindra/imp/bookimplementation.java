package com.manindra.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manindra.entity.book;
import com.manindra.repo.bookrepo;
import com.manindra.service.bookservice;
@Service
public class bookimplementation implements bookservice {
	
	private bookrepo rep;
	
	public bookimplementation(bookrepo rep) {
		this.rep=rep;
	}

	@Override
	public String upsertbook(book book) {
		Integer bookid=book.getBookid();
		rep.save(book);
	if(bookid==null) {
		return "record inserted";
	}
	else
		return "record updated";
	}

	@Override
	public List<book> getallbooks() {
	 return	rep.findAll();
		
	}
@Override
public String deletebook(Integer bookid) {
		rep.deleteById(bookid);
		return "record deleted";
	}

	
	

}
