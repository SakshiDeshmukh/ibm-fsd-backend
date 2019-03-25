package com.examples.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeRegistrationServlet extends HttpServlet {
	//called when getting loaded into container->initialization logic//servlet is initialized only once throut
   public void init() {
	System.out.println("EmployeeServlet  initialized");
   }
   //invoked by container
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	   System.out.println("doGet methd");
	   this.doPost(request, response);
   }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		HttpSession session = request.getSession();
		System.out.println("Session ID:" +session.getId());
		//session.getAttributeNames();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
         
		session.setAttribute("userName", userName);
		session.setAttribute("password", password);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("Hello World");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Registration Successfull!!<h1>");
		out.println("<body>");
		out.println("<p>User Name:" +userName+ "</p> ");
		out.println("<p>Password:" +password+ "</p> " );
		out.println("<a href='index.html'>Home</a>");

		out.println("</body>");
		out.println("</html>");
		//out.println("Current Date"+LocalDate.now());
	}
	
	//called when getting unloaded from webcontaniner->cleanup logic
	public void destroy() {
		System.out.println("HelloWorld Servlet destroyed");
	}
}
