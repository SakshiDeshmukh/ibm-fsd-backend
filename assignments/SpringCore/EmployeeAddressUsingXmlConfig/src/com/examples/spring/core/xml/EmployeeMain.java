package com.examples.spring.core.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		
		Employee empref = (Employee) context.getBean("employee");
		empref.getDesignation();
		empref.getDob();
		empref.getFulltime();
		empref.getSalary();
		empref.getSkills();
		empref.printDetails();
		
	}

}