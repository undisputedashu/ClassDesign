package com.library.management.service;

import java.util.List;

import com.library.management.entity.Book;

public interface Search {

	List<Book> search(String str, Criteria criteria);
	
}