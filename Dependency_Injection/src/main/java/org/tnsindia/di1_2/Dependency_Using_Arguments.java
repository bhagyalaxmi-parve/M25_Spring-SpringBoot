package org.tnsindia.di1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Dependency_Using_Arguments {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student_2 s1 = c.getBean("s1", Student_2.class);
		Student_2 s2 = c.getBean("s2", Student_2.class);
		s1.getData();
		s2.getData();

	}

}
