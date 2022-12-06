package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Placement_Service {
	
	

	@Autowired
	private Placement_Repository repo;
	
	//To retrieve all the data for Placement Class
	public List<Placement> lisAll()
	{
		return repo.findAll();
	}
	
	//insert or create a data
	public void create(Placement p)
	{
		repo.save(p);
	}
	
	//To retrieve a single record
	public Placement retrieve(Integer placement_id)
	{
		return repo.findById(placement_id).get();
	}

	//To delete data from database
	public void delete(Integer placement_id)
	{
		repo.deleteById(placement_id);
	}

}
