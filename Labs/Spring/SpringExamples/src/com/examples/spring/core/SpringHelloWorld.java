package com.examples.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorld {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//step 1: create IoC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        
        //step 2:Access greetings bean
        Greetings grt = (Greetings) context.getBean("greetings");
        
        //print message
        System.out.println(grt.getMessage());
        
        //Greetings grt1 = (Greetings) context.getBean("greetings");
        //System.out.println(grt1.getMessage());

        
        System.out.println(context.getBeanDefinitionCount());
	}

}
