package com.library.management.entity;

public class BookItem {

	private int bookItemId;
	private String barcode;
	private int bookId;
	
	public int getBookItemId() {
		return bookItemId;
	}
	public void setBookItemId(int bookItemId) {
		this.bookItemId = bookItemId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
