package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ExampleDao;
import com.example.domain.Photographer;
import com.example.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService{
	
	@Autowired
	ExampleDao exampleDao;

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		String ans = exampleDao.getExampleDao();
		return ans;
	}

	@Override
	public List<Photographer> getAllPhotographers() {
		// TODO Auto-generated method stub
		List<Photographer> list = exampleDao.getAll();
		
		return list;
	}

	@Override
	public String create(Photographer photographer) {
		int update = exampleDao.create(photographer);
		if(update == 1)
			return "Success";
		return "Failed";
	}

}
