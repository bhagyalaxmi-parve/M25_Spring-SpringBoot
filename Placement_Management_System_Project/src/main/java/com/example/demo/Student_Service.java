package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
@Transactional

public class Student_Service {

	
	@Autowired
	private Student_Repository repo;
	
	
	
	public List<Student> ListAll()
	{
		return repo.findAll();
	}
	
	
	public void create(Student s)
	{
		 repo.save(s);
	}

	
	
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	
    public void delete(Integer id)
    {
    	repo.deleteById(id);
    }
}
