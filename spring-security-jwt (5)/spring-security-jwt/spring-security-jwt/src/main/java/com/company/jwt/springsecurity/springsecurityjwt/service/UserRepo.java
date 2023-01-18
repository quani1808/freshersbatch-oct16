package com.company.jwt.springsecurity.springsecurityjwt.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.jwt.springsecurity.springsecurityjwt.jwtutil.User1;

public interface UserRepo extends MongoRepository<User1, String> {

	User1 findByUsername(String username);

}
