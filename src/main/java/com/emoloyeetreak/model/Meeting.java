package com.emoloyeetreak.model;

public class Meeting {
	private String place;
	private String company;
	private String  time;
	private String date;
	public Meeting() {
		super();
	}
	public Meeting(String place, String company, String time, String date) {
		super();
		this.place = place;
		this.company = company;
		this.time = time;
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

}
