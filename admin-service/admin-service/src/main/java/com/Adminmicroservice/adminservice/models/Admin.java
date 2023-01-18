package com.Adminmicroservice.adminservice.models;

public class Admin {
	  private String name; 
	  private int number; 
	  private String email; 
	  private int password;
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [name=" + name + ", number=" + number + ", email=" + email + ", password=" + password + "]";
	}
	  
	  

}
