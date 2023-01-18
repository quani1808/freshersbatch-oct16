package com.exampleSpringDatabase.assignmentsdatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleSpringDatabase.assignmentsdatabase.exam.EmployeeDetails;
import com.exampleSpringDatabase.assignmentsdatabase.repository.EmployeeRepository;

@Service
public class EmployeeService{
  
	 @Autowired
	 private EmployeeRepository repo;
	 
	 public List<EmployeeDetails> getAll()
	 {
		 return repo.findAll();
	 }
	 
}
