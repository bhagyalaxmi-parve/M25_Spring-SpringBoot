package org.tnsindia.di1;


//Dependency in the form of Literals
public class Student_1 {
	
	
	private String Student_Name;
	private int Roll_No;
	
	
	public void display()

	{
		System.out.println("Name of Student is : "+Student_Name);
		System.out.println("Roll_No. of Student is : "+Roll_No);
	}


	
	//setter method
	/*public String getStudent_Name() {
		return Student_Name;
	}*/

	//setters method
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}



	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}

	
	
	
	

}
