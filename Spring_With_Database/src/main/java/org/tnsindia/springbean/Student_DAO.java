package org.tnsindia.springbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Connection: Spring=>MySQL

public class Student_DAO {

	private String driver;
	private String URL;
	private String username;
	private String password;
	
	
	//Setters method
	
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setURL(String uRL) {
		URL = uRL;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	//UserDefined Method
	public void selectAllRows() throws ClassNotFoundException, SQLException  {
		
		//load the driver
		Class.forName(driver);
		
		
		//connection
		Connection c = DriverManager.getConnection(URL, username, password);
		
		//execute a query
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("SELECT * FROM m25.book");
		
		while(r.next()) {
			int id=r.getInt(1);
			String title=r.getString(2);
			String author = r.getString(3);
			double price = r.getDouble(4);
			System.out.println("THE BELOW TABLE IS FOR BOOK => \n");
			System.out.println("BOOK ID : "+id);
			System.out.println("BOOK TITLE : "+title);
			System.out.println("BOOK AUTHOR : "+author);
			System.out.println("BOOK PRICE : "+price+"\n");
		}
		
		
		
		
		
		
		
	}
	
	
}
