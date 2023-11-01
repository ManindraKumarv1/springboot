package com.manindra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manindra.entity.book;
import com.manindra.service.bookservice;

@RestController
public class bookrestcontroller {
	@Autowired
	private bookservice service;
	
	@PostMapping("/book")
 public ResponseEntity<String> addbook(@RequestBody book book){
	 String msg=service.upsertbook(book);
	 return new ResponseEntity<>(msg,HttpStatus.CREATED);
 }
	@GetMapping("/books")
	public ResponseEntity<List<book>> getallbooks(){
		List<book> allbooks=service.getallbooks();
		return new ResponseEntity<>(allbooks,HttpStatus.OK);
	}
	@PutMapping("/book")
	public ResponseEntity<String> updatebook(@RequestBody book book){
		String msg=service.upsertbook(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@DeleteMapping
	("/book/{bookid}")
	public ResponseEntity<String> deletebook(@PathVariable Integer bookid){
		String msg=service.deletebook(bookid);
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
