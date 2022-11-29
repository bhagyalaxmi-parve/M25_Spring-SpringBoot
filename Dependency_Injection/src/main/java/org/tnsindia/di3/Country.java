package org.tnsindia.di3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country {
	
	
	private List<String> Fruits;
	private Set<String> Cricketers;
	private Map<String, String> Country_Capital;
	
	
	
	
	public void output()
	{
		System.out.println("Fruits : "+Fruits);
		System.out.println("Cricketers : "+Cricketers);
		System.out.println("Country and capital : "+Country_Capital);

	}
	
	

	//setters method

	public void setFruits(List<String> fruits) {
		Fruits = fruits;
	}

	public void setCricketers(Set<String> cricketers) {
		Cricketers = cricketers;
	}




	public void setCountry_Capital(Map<String, String> country_Capital) {
		Country_Capital = country_Capital;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
