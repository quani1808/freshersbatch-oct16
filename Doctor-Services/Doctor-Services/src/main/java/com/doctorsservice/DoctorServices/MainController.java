package com.doctorsservice.DoctorServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/doctors")
	public String doctors() {
		return "List of doctors";
	}

}
