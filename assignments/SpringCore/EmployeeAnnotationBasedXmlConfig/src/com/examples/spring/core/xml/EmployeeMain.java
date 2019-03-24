package com.examples.spring.core.xml;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);	
	
	    LocalDate dob =LocalDate.of(1996, 02, 24);
	    
	    Employee obj = (Employee) context.getBean("employee");
	    obj.setDob(dob);
	    obj.printDetails();
	   
	    }

}
