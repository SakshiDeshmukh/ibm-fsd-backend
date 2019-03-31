package com.examples.java.servlet.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Register extends HttpServlet {
      
       public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
   		System.out.println("doGet methd");
   		this.doPost(request, response);
   	}
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");	
		String address = request.getParameter("address");
		String country = request.getParameter("country");
		
		session.setAttribute("name", name);
		session.setAttribute("password", password);
		session.setAttribute("age", age);
		session.setAttribute("address", address);


		
		Employee emp= new Employee(name,age,password,gender,address);
		
		

//		session.setAttribute("employees", emp);
	EmployeeService service = new EmployeeService();
	  
		  try {
			service.add(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    response.sendRedirect("registerSuccess.jsp");   
	}
	
}