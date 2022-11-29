package org.tnsindia.di1_2;

public class Student_2 {
	
	
	private String Name;
	private int Roll_No;
	private int Mobile_No;
	
	
	public void getData()
	{
		System.out.println("Name of student is :"+Name);
		System.out.println("Roll_No of student is :"+Roll_No);
		System.out.println("Mobile_No of student is :"+Mobile_No);
		
	}


	public Student_2(String name, int roll_No, int mobile_No) {
		super();
		Name = name;
		Roll_No = roll_No;
		Mobile_No = mobile_No;
	}


	
	
	

}
