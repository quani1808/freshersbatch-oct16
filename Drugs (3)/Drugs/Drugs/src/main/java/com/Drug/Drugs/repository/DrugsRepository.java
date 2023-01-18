package com.Drug.Drugs.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Drug.Drugs.models.Drugs;

@Repository
public interface DrugsRepository extends MongoRepository<Drugs, Integer>{
	
	List<Drugs> findByDrugsName(String drugsName);
	
	
	Boolean existsByDrugsId(int drugsId);


	
}
