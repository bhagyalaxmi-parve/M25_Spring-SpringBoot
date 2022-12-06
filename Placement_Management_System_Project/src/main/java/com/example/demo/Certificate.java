package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Certificate {
	
	
	
	@Id
	private Integer certificate_id;
	private Integer year;
	
	
	
	//default constructor
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//parameterized constructor
	public Certificate(Integer certificate_id, Integer year, String college) {
		super();
		this.certificate_id = certificate_id;
		this.year = year;
		
	}

	//setters and getters method
	public Integer getCertificate_id() {
		return certificate_id;
	}


	public void setCertificate_id(Integer certificate_id) {
		this.certificate_id = certificate_id;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}

	
	//toString method

	@Override
	public String toString() {
		return "Certificate [certificate_id=" + certificate_id + ", year=" + year + "]";
	}


	
	
	
	
	
	
	
}




