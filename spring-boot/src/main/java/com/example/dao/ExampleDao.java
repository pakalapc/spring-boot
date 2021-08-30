package com.example.dao;

import java.util.List;

import com.example.domain.Photographer;

public interface ExampleDao {
	
	String getExampleDao();
	List<Photographer> getAll();
	int create(Photographer photographer);

}
