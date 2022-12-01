package org.tnsindia.springbean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		/* //Without bean.xml file
		 * Hard coding
		Student_DAO sd = new Student_DAO();
		sd.selectAllRows();    */
		
		ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml");
		Student_DAO sd= c.getBean("studentdao", Student_DAO.class);
		sd.selectAllRows();
		

	}

}
