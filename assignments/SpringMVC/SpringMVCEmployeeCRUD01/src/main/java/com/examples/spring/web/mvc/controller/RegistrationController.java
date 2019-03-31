package com.examples.spring.web.mvc.controller;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.model.Login;


/**
 * Handles requests for the application home page.
 */
@Controller

@SessionAttributes("username")
public class RegistrationController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)	
	public ModelAndView showRegisterForm(Model model) {
		return new ModelAndView("register", "command", new Login());
	}
	
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView register(@RequestHeader("Host") String host,@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request,HttpSession session) {

		logger.info("Host:{}",host);
		Login obj=new Login();
		obj.setUsername("username");
		obj.setPassword("password");
		ModelAndView modelView = new ModelAndView("regSuccess");
		//session.setAttribute("username",username);
		session.setAttribute("password",password);
		System.out.println("session id :"+session.getId());
		modelView.addObject("username",username);
		return modelView;
		//return new ModelAndView("regSuccess", "command", new Login());
		
	}	
}
