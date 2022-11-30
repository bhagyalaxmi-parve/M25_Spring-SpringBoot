package org.tnsindia.springautowired;

public class Heart {
	
	private String NameofAnimal;
	private String No_ofHeart;
	
	public void pump()
	{
	System.out.println("YOUR HEART IS PUMPING.....");
	
	System.out.println("YOU ARE ALIVE.");
	}

	
	
	//getters and setters
	public String getNameofAnimal() {
		return NameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		NameofAnimal = nameofAnimal;
	}

	public String getNo_ofHeart() {
		return No_ofHeart;
	}

	public void setNo_ofHeart(String no_ofHeart) {
		No_ofHeart = no_ofHeart;
	}
	
	
	

}
