package com.Adminmicroservice.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.Adminmicroservice.adminservice.models.Admin;
import com.Adminmicroservice.adminservice.models.Drugs;
import com.Adminmicroservice.adminservice.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/admin/addDrugs")
	String addDrugs(@RequestBody Admin admin) {
		return adminService.addDrugs(admin);
	}
	
	@GetMapping("/admin/viewDrugs")
	List<Drugs> viewDrugs(){
		return adminService.viewDrugs();
	}
	
	@GetMapping("/admin/getDrugs")
	Drugs getDrugs(@RequestParam int drugsId) {
		return adminService.addDrugs(drugsId);
	}
	
	@PutMapping("/admin/editDrugs/{DrugsId}")
	String editDrugs(@PathVariable int drugsId, @RequestBody Drugs drugs) throws NotFound {
		return adminService.editDrugs(drugsId,drugs);
	}
	
	@DeleteMapping("/admin/deleteDrugs")
	String deleteDrugs(@RequestParam int drugsId) throws NotFound {
		return adminService.deleteDrugs(drugsId);
	}
	

}
