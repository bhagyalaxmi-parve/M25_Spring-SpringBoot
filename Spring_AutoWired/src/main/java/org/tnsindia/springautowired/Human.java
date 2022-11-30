package org.tnsindia.springautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	public void pumping()
	{
		
		
		heart.pump();
		System.out.println("Name of the animal : "+heart.getNameofAnimal()+"\n"
				+"No. of heart : " +heart.getNo_ofHeart());
		
		
	}
	
	@Autowired
	@Qualifier("Monkeyheart")
	
	//Achieving dependency using setters
	//setter method
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	
	
	// Achieving dependency using constructor
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}


	public Human() {
		super();
		// TODO Auto-generated constructor stub
		this.heart = heart;
	}   
	
	
	
	
	
	
}
