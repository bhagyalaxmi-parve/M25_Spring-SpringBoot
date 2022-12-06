package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Admin_Service {

	@Autowired
	private Admin_Repository repo;

	//to retrieve all the data of student class
	public List<Admin> listAll() {
		return  repo.findAll();
	}		
	
		//insert/create/update a data
	public void create(Admin a) {
		 repo.save(a);
	}
	
	//to retrieve a single record
	public Admin retrieve(Integer admin_id)
	{
		return repo.findById(admin_id).get();
		
	}
			
		
		//to delete a data
	public void delete(Integer admin_id)
	{
		repo.deleteById(admin_id);
	}


	
	
}
