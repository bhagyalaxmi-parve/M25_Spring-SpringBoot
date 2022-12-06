package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Placement_Controller {
	
	

		
		@Autowired
		private Placement_Service service;
		
		//creation
		@PostMapping("/placement")
		public void add(@RequestBody Placement p)
		{
			service.create(p);
		}
		
		//deletion
		@DeleteMapping("/placement/{placement_id}")
		public void remove (@PathVariable Integer placement_id)
		{
			service.delete(placement_id);
		}
		
		//Retrieve data with all details
		@GetMapping("/placement")
		public List<Placement>list()
		{
			return service.lisAll();
		}
		
		//Retrieve with specific ID
		@GetMapping("/placement/{placement_id}")
		public ResponseEntity<Placement>get(@PathVariable Integer placement_id)
		{
			try 
			{
			Placement p=service.retrieve(placement_id);
			return new ResponseEntity<Placement>(p,HttpStatus.OK);
			}
			
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
		}
		
		//update any data
		@PutMapping("/placement/{placement_id}")
		public ResponseEntity<Placement>update(@RequestBody Placement p, @PathVariable Integer placement_id)
		{
			try 
			{
			@SuppressWarnings("unused")
			Placement p1=service.retrieve(placement_id);
			service.create(p);
			return new ResponseEntity<Placement>(p,HttpStatus.OK);
			}
			
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
		}
		

}
