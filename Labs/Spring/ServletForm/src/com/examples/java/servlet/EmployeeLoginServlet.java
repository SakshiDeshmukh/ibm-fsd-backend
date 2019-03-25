package com.examples.java.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLoginServlet extends HttpServlet {
	//called when getting loaded into container->initialization logic//servlet is initialized only once throut
   public void init() {
	System.out.println("EmployeeLoginServlet  initialized");
   }
   //invoked by container
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	   System.out.println("doGet methd");
	   this.doPost(request, response);
   }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
         
		HttpSession session = request.getSession();
		
		String userName1 = (String) session.getAttribute("userName");
		String password1 = (String) session.getAttribute("password");

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("Hello World");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		//Authentication
		if(userName.equals(userName1) && password.equals(password1)) {
		out.println("<h4>Login Successfull!!<h4>");
		//forwards request to register servlet
		//RequestDispatcher  
		//redirecting to employee home page
		response.sendRedirect("http://localhost:8080/ServletForm/landing.html");
		}
		else{
		out.println("<h4>Invalid credentials</h4>");
		}
	

		out.println("</body>");
		out.println("</html>");
		//out.println("Current Date"+LocalDate.now());
	}
	
	//called when getting unloaded from webcontaniner->cleanup logic
	public void destroy() {
		System.out.println("EmployeeLoginServlet destroyed");
	}
}
