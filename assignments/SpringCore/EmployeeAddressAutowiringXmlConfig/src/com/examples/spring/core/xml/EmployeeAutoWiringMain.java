package com.examples.spring.core.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAutoWiringMain {

	
	public static void main(String[] args) {
		
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		EmployeeAutoWiring empref = (EmployeeAutoWiring) context.getBean("employeeauto");
		
		empref.printDetails();
		context.close();
	
		
	}

}
