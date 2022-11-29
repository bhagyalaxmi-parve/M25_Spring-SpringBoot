package org.tnsindia.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		//creating the object for Airtel class
		/*Airtel a1=new Airtel();
		a1.calling();
		a1.data();   */
		
	
		/*
		Jio j1=new Jio();
		j1.calling();
		j1.data(); */
		
		
		
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config...loaded");

	/*
		Airtel a = (Airtel)c.getBean("airtel");
		a.calling();
		a.data();
	
		Jio j = (Jio)c.getBean("jio");
		j.calling();
		j.data();   */
		
		

		Sim a1 = c.getBean("sim", Sim.class);
		a1.calling();
		a1.data();
				
	}

	}

