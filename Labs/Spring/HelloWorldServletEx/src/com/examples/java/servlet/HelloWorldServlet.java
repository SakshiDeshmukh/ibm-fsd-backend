package com.examples.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	//called when getting loaded into container->initialization logic//servlet is initialized only once throut
   public void init() {
	System.out.println("HelloWorld Servlet initialized");
   }
   //invoked by container
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	   System.out.println("doGet methd");
	   this.doPost(request, response);
   }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		System.out.println("Context:" + request.getRemoteHost());
		Enumeration<String> hrNames = request.getHeaderNames();
		while(hrNames.hasMoreElements()) {
			String hrName = hrNames.nextElement();
					System.out.println(hrName+":"+request.getHeader(hrName));
		}
		response.setContentType("text/html");
		System.out.println("Servlet doPost mthd invoked");
		PrintWriter out = response.getWriter();
		out.println("Hello World");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>HelloWorld<h1>");
		out.println("</body>");
		out.println("</html>");
		out.println("Current Date"+LocalDate.now());
	}
	
	//called when getting unloaded from webcontaniner->cleanup logic
	public void destroy() {
		System.out.println("HelloWorld Servlet destroyed");
	}
}
