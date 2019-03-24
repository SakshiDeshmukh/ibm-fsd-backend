package com.examples.spring.core.xml;

import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {

		    @Bean
		    public Employee employee() {
		    	LocalDate dob = LocalDate.of(1996,02,24);
		    	ArrayList skill = new ArrayList();
		    	skill.add("Java");
		    	skill.add("C");
		    	skill.add("C++");
		        return new Employee(1,"Sakshi",dob,"Developer",35000,skill,true);

		    }    
		    
		    @Bean
		    public Address address() {
		        return new Address("Sangamner","India",422605);
		    }    
	        
	
}
