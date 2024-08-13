package com.devops.devops_automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/hello")
public class DevopsAutomationApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}
	
	@GetMapping
	public String helloWorld() 
	{
		return "APPLICATION UP AND RUNNING";
		
	}

}
