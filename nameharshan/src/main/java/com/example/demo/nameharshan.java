package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameharshan {
	@GetMapping("/name")
	public String fname() {
		String name="Harshan";
		return "Welcome" +name+"!";
	}

}
