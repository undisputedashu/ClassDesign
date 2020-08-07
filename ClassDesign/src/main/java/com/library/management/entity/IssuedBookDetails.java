package com.library.management.entity;

import java.util.Date;

public class IssuedBookDetails {

	private int userId;
	private int bookItemId;
	private Date issueDate;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookItemId() {
		return bookItemId;
	}
	public void setBookItemId(int bookItemId) {
		this.bookItemId = bookItemId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
}
