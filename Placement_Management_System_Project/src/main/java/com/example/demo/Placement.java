package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Placement {
	
	
	@Id
	private Integer placement_id;
	private String name;
	private String date;
	private String qualification;
	private Integer year;
	public Integer getPlacement_id() {
		return placement_id;
	}
	public void setPlacement_id(Integer placement_id) {
		this.placement_id = placement_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Placement [placement_id=" + placement_id + ", name=" + name + ", date=" + date + ", qualification="
				+ qualification + ", year=" + year + "]";
	}
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(Integer placement_id, String name, String date, String qualification, Integer year) {
		super();
		this.placement_id = placement_id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}
	
	
	
	
}
