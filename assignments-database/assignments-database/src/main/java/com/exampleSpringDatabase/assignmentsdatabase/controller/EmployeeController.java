package com.exampleSpringDatabase.assignmentsdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleSpringDatabase.assignmentsdatabase.exam.EmployeeDetails;
import com.exampleSpringDatabase.assignmentsdatabase.service.EmployeeService;

@RestController
public class EmployeeController {
   @Autowired
	EmployeeService service;
   @GetMapping("/employee")
   public List<EmployeeDetails> getEmps()
   {
	   return service.getAll();
   }
}
