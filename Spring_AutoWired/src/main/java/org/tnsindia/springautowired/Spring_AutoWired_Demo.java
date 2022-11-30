package org.tnsindia.springautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_AutoWired_Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Human human = c.getBean("human", Human.class);
		human.pumping();

	}

}
