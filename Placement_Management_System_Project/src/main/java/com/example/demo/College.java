package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	
	
	@Id
	private Integer college_id;
	private String collegeadmin;
	private String collegename;
	private String location;
	
	//GETTERS AND SETTERS
	public Integer getCollege_id() {
		return college_id;
	}
	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}
	public String getCollegeadmin() {
		return collegeadmin;
	}
	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	//TOSTRING METHOD
	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", collegeadmin=" + collegeadmin + ", collegename=" + collegename
				+ ", location=" + location + "]";
	}
	
	//DEFAULT CONSTRUCTOR
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//PARAMETERIZED CONSTRUCTOR
	public College(Integer college_id, String collegeadmin, String collegename, String location) {
		super();
		this.college_id = college_id;
		this.collegeadmin = collegeadmin;
		this.collegename = collegename;
		this.location = location;
	}
	
	
	
	
	
	

}
