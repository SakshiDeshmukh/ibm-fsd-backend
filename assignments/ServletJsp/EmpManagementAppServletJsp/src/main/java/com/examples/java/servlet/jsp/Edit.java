package com.examples.java.servlet.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Edit")
public class Edit extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String contractor=request.getParameter("contractor");
		String skills=request.getParameter("skills");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String address=request.getParameter("address");
		
		Employee emp=new Employee(id,name,password,age,gender,contractor,skills,designation,department,address);
		
		
		emp.setId(id);
		EmployeeService service = new EmployeeService();
		
		int status = service.update(emp);
		if(status>=1) {
			response.sendRedirect("Edit");
		}

	}

}