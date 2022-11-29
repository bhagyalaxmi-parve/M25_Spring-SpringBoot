package org.tnsindia.di2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dependency_Using_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*  Student_3 s1 = new Student_3();
		s1.cheating();    */

		//Using Spring IOC Concept
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student_3 s1 = c.getBean("s1", Student_3.class);
		s1.cheating();
	}

}
