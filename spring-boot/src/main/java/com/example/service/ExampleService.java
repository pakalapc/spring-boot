package com.example.service;

import java.util.List;

import com.example.domain.Photographer;

public interface ExampleService {
	
	String getDetails();
	List<Photographer> getAllPhotographers();
	String create(Photographer photographer);

}
