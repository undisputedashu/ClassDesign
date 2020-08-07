package com.library.management.service;

import com.library.management.service.impl.NameSearch;
import com.library.management.service.impl.AuthorSearch;
import com.library.management.service.impl.PublicationSearch;

public enum Criteria {

	//Make sure Search implementations are stateless
	NAME("name", new NameSearch()),
	AUTHOR("author", new AuthorSearch()),
	PUBLICATION("publication", new PublicationSearch());
	
	private String criteriaName;
	private Search searchService;
	Criteria(String criteriaName, Search searchService) {
		this.criteriaName = criteriaName;
		this.searchService = searchService;
	}
	public String getCriteriaName() {
		return criteriaName;
	}
	public Search getSearchService() {
		return searchService;
	}
	
	public static Criteria getCriteria(String str) {
		for (Criteria criteria : Criteria.values()) {
			if (criteria.getCriteriaName().equalsIgnoreCase(str)) {
				return criteria;
			}
		}
		throw new RuntimeException("Invalid criteria!");
	}

}