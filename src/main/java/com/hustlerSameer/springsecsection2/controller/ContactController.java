package com.hustlerSameer.springsecsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	
	@GetMapping("/myContact")
	public String getContact() {
		
		
		return "Your Contact from DB!!!";
	}
}
