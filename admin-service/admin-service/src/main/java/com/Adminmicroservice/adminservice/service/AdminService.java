package com.Adminmicroservice.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Adminmicroservice.adminservice.models.Drugs;

@Service
public class AdminService {
	
	@Autowired
	DrugsRepository drugsRepository;
	
	public String addDrugs(int drugsId) {
		
	}

	public String deleteDrugs(int drugsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
