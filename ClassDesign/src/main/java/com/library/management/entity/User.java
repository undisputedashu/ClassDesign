package com.library.management.entity;

public class User {

	private int userId;
	private String name;
	private String address;
	private Eligibility eligibility;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Eligibility getEligibility() {
		return eligibility;
	}
	public void setEligibility(Eligibility eligibility) {
		this.eligibility = eligibility;
	}
	
}