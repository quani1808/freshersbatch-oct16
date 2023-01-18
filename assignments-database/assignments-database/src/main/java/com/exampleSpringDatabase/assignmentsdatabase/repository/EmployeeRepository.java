package com.exampleSpringDatabase.assignmentsdatabase.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.exampleSpringDatabase.assignmentsdatabase.exam.EmployeeDetails;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDetails,Integer>{

}
