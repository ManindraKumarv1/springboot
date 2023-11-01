 package com.manindra.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manindra.entity.book;

public interface bookrepo extends JpaRepository<book, Serializable> {

	
	
}
