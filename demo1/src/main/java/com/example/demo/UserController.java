package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	private void get()
	{
		System.out.println("get");
	}
	
	@PostMapping("/user")
	private void post()
	{
		System.out.println("post");
	}
	
	

}
