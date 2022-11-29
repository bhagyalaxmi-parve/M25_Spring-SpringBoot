package org.tnsindia.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Dependency_Using_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		Country c1=  c.getBean("s1", Country.class);
		c1.output();
		

	}

}
