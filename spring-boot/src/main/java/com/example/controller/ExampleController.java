package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Photographer;
import com.example.service.ExampleService;

@RestController
@RequestMapping("/api")
public class ExampleController {
	
	@Autowired
	private ExampleService exampleService;
	
	@GetMapping("/platfor-ncsr-report")
	public String getDetails() {
		String response = exampleService.getDetails();
		return response;
	}
	
	@GetMapping("/photographers")
	public List<Photographer> getAllPhotographers() {
		List<Photographer> photographersList = exampleService.getAllPhotographers();
		 
		return photographersList;
	}
	
	@PostMapping("/photographers")
	public String createAllPhotographers(@RequestBody Photographer photographer, HttpServletRequest request) {
		// TODO Auto-generated method stub
		String response = exampleService.create(photographer);
		
		return response;
	}

}
