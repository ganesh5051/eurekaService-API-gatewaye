package com.ganesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {
	
	@GetMapping("/wish")
	public String wishMsg() {
		
		return "Wellcome to spring...";
	}

}
