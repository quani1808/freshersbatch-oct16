package com.exampleSpringDatabase.assignmentsdatabase.exam;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class EmployeeDetails {
	@Id
	private int id;
	private String name;
	public EmployeeDetails()
	{
		
	}
	public EmployeeDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + "]";
	}
	

}
