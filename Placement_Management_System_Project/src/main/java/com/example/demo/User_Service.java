package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class User_Service {
	
	@Autowired
	private User_Repository repo;
	
	
	
	public List<User> ListAll()
	{
		return repo.findAll();
	}
	
	
	public void create(User u)
	{
		 repo.save(u);
	}

	
	
	public User retrieve(Integer user_id)
	{
		return repo.findById(user_id).get();
	}
	
	
    public void delete(Integer user_id)
    {
    	repo.deleteById(user_id);
    }

}
