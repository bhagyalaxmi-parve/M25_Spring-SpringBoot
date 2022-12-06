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
public class Admin_Controller {
	
	@Autowired
	private Admin_Service service;
	

	
	//creation
		@PostMapping("/admin")
		public void add(@RequestBody Admin a) {
			service.create(a);
		}
		
		//deletion
		@DeleteMapping("/admin/{admin_id}")
		public void remove(@PathVariable Integer admin_id) {
			
			service.delete(admin_id);
			
		}
		
		
		//retrieve with all the records
		@GetMapping("/admin")
		public List<Admin> list()
		{
			return service.listAll();
		}
		
		//retrieve with specific id
		@GetMapping("/admin/{admin_id}")
		public ResponseEntity<Admin> get(@PathVariable Integer admin_id)
		{
			
			try {
				Admin a= service.retrieve(admin_id);
				return new ResponseEntity<Admin>(a,HttpStatus.OK);
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
			}
		}
		
		
		
		
		
		//update with specific id
		
			@PutMapping("/admin/{admin_id}")
			public ResponseEntity<Admin> update(@RequestBody Admin a, @PathVariable Integer admin_id)
			{
				
				try {
					Admin a1= service.retrieve(admin_id);
					service.create(a);
					return new ResponseEntity<Admin>(a,HttpStatus.OK);
				}
				catch(NoSuchElementException e) 
				{
					return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
				}
			}

}
