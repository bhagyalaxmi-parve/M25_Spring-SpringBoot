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
public class Certificate_Controller {
	@Autowired
	private Certificate_Service service;
	
	
	
	
		//Retrieve with all the records
	    @GetMapping("/certificate")
	    public List<Certificate>list()
	    {
		     return service.listAll();
		
	    }
	
	    //creation
		@PostMapping("/certificate")
		public void add(@RequestBody Certificate c)
		{
			service.create(c);
		}
		
		//deletion
		@DeleteMapping("/certificate/{certificate_id}")
		public void remove(@PathVariable Integer certificate_id)
		{
			service.delete(certificate_id);
		}
	
		
	    
	  //Retrieve with specific id
		@GetMapping("/certificate/{certificate_id}")
		public ResponseEntity<Certificate> get(@PathVariable Integer certificate_id)
		{
			try {
				Certificate c=service.retrieve(certificate_id);
				return new ResponseEntity<Certificate>(c,HttpStatus.OK);
			
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			}
			
			
		}
		
		//update
		@PutMapping("/certificate/{certificate_id}")
		public ResponseEntity<Certificate> update(@RequestBody Certificate c, @PathVariable Integer certificate_id)
		{
			
			try {
				Certificate c1= service.retrieve(certificate_id);
				service.create(c);
				return new ResponseEntity<Certificate>(c,HttpStatus.OK);
			}
			catch(NoSuchElementException e) 
			{
				return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			}
		}

}
