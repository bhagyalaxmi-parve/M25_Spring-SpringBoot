package org.tnsindia.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Dependency_Using_Literals {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HARD CODING
	   /* Student_1 s1= new Student_1();
	    s1.Student_Name="Bhagyalaxmi Kailas Parve";
		s1.display();  */
		
	
		/*
		Student_1 s1= new Student_1();
	    s1.setStudent_Name("bhagyalaxmi");
		s1.display()   */
		
		
		
		//Spring IOC Concept+
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student_1 s1 = c.getBean("s1", Student_1.class);
		Student_1 s2 = c.getBean("s2", Student_1.class);
		s1.display();
		s2.display();
		
	}

}
