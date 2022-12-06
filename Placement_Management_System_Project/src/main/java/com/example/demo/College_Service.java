package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class College_Service {
	
	
	@Autowired
	private College_Repository repo;
	
	//to retrieve all the data of college class
	public List<College> listAll()
	{
		return repo.findAll();
	}
	//insert/create/update a data
	public void create(College o)
	{
		
		repo.save(o);
		
	}
	//to retrieve a single record
	public College retrieve(Integer college_id)
	{
		return repo.findById(college_id).get();
	}
	//to delete a data
	public void delete(Integer college_id)
	{
		repo.deleteById(college_id);
	}

}
