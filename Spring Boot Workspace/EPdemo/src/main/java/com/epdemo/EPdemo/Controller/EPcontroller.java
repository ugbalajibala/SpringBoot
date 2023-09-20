package com.epdemo.EPdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EPcontroller {
	
	@GetMapping("/EPDemo")
	public String GetData()
	{
		return "Hello";
		
	}
}
