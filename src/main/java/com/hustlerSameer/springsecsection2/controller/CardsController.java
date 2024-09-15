package com.hustlerSameer.springsecsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	
	@GetMapping("/myCards")
	public String getCardDetails() {
		
		
		return "Here are Card Details from the DB!!!";
	}
}
