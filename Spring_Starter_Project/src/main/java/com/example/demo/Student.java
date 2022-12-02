package com.example.demo;

import org.springframework.stereotype.Component;

/*@Component==> This  annotation is used to denote that a class is a component
 * it allows spring to automatically detect our custom beans */

@Component
public class Student {
	
	
	//private data members
	private int Roll_No;
	private String Name;
	
	
	//setters and getters
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
	public void print()
	{
		System.out.println("WELCOME TO M25 BATCH");
	}
	
	
	//default constructor 
	public Student() {
		super();
		System.out.println("WELCOME TO TNSINDIA  FOUNDATION......");
	}
	
	
	
	

}
