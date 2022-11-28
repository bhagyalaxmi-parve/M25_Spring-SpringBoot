package org.tnsindia.springioc;

public class Airtel  implements Sim{

	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel");
		
	}

	public void data() {
		// TODO Auto-generated method stub
		
		System.out.println("Internet using Airtel");
		
	}

	public Airtel() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("Airtel class constructor");
	}
	
	//inheriting the properties of sim interface
	
	
	
	

}
