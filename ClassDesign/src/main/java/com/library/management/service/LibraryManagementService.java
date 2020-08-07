package com.library.management.service;

import java.util.List;

import com.library.management.entity.Book;

public class LibraryManagementService {

	public List<Book> search(String searchQuery, String searchCriteria) {
		Criteria criteria = Criteria.getCriteria(searchCriteria);
		return criteria.getSearchService().search(searchCriteria, criteria);
	}
	
}