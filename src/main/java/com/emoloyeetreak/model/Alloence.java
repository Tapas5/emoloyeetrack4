package com.emoloyeetreak.model;

public class Alloence {
	
	private int id;
	private String amount;
	private String description;
	public Alloence() {
		super();
	}
	public Alloence(int id, String amount, String description) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
