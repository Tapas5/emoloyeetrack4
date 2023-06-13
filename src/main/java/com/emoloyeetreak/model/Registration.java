package com.emoloyeetreak.model;

public class Registration {
	private int id;
	private String fullname;
	private String employeeid;
	private String mobile;
	private String designation;
	private String email;
	private String password;
	public Registration() {
		super();
	}
	public Registration(int id, String fullname, String employeeid, String mobile, String designation, String email,
			String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.employeeid = employeeid;
		this.mobile = mobile;
		this.designation = designation;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
