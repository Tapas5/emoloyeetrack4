package com.emoloyeetreak.model;

public class Leave {
	private int id;
	private String name;
	private String from_date;
	private String to_date;
	private String empreason;
	public Leave() {
		super();
		
	}
	public Leave(int id, String name, String from_date, String to_date, String empreason) {
		super();
		this.id = id;
		this.name = name;
		this.from_date = from_date;
		this.to_date = to_date;
		this.empreason = empreason;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getEmpreason() {
		return empreason;
	}
	public void setEmpreason(String empreason) {
		this.empreason = empreason;
	}
	
	
	
	
	

}
