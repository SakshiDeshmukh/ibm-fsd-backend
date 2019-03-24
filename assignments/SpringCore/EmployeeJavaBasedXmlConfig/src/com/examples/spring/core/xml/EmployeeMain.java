package com.examples.spring.core.xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);	
	    
		Employee obj = (Employee) context.getBean("employee");
	    
		obj.printDetails();
}
}