package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Certificate_Service {
	
	@Autowired
	private Certificate_Repository repo;

	//to retrieve all the data of student class
	public List<Certificate> listAll() {
		return  repo.findAll();
	}		
	
		//insert/create/update a data
	public void create(Certificate c) {
		 repo.save(c);
	}
	
	//to retrieve a single record
	public Certificate retrieve(Integer certificate_id)
	{
		return repo.findById(certificate_id).get();
		
	}
			
		
		//to delete a data
	public void delete(Integer certificate_id)
	{
		repo.deleteById(certificate_id);
	}





	

}
