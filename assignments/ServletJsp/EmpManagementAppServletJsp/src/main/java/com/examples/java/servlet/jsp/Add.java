

package com.examples.java.servlet.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Add extends HttpServlet {
      
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
		String skills = request.getParameter("skills");
		String contractor = request.getParameter("contractor");
		String designation = request.getParameter("designation");
		String department = request.getParameter("department");
		String address = request.getParameter("address");
		
	
		session.setAttribute("name", name);
		session.setAttribute("gender", gender);
		session.setAttribute("password", password);
		session.setAttribute("age", age);
		session.setAttribute("skills", skills);
		session.setAttribute("contractor", contractor);
		session.setAttribute("designation", designation);
		session.setAttribute("department", department);
		session.setAttribute("address", address);
		
		Employee emp= new Employee(name,age,password,gender,skills,contractor,designation,department,address);
		
		


	EmployeeService service = new EmployeeService();
	  
		  try {
			service.addEmp(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    response.sendRedirect("add.jsp");   
	}
	
}