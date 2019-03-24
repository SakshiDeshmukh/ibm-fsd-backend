package com.examples.spring.core.xml;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	@Value("1")
	private int id;
	@Value("Sakshi")
	private String name;
	//@Value("1996-02-24")
	private LocalDate dob;
	@Value("Developer")
	private String designation;
	@Value("25000")
	private double salary;
	@Value("java")
	private List skills;
	//private Address address;
	@Value("true")
	private Boolean fulltime;
	@Autowired
	Address address;
	
	public Employee() {
		
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(Address address) {
		
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	@SuppressWarnings("rawtypes")
	public List getSkills() {
		return skills;
	}
	public void setSkills(@SuppressWarnings("rawtypes") List skills) {
		this.skills = skills;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Boolean getFulltime() {
		return fulltime;
	}
	public void setFulltime(Boolean fulltime) {
		this.fulltime = fulltime;
	}
	
	public void printDetails() {
		
		
		System.out.println("1]Employee ID::"+id+ "\n2]Employee Name:: " +name+ "\n3]Employee Salary::"+
		salary+"\n4]Employee Skills::"+skills+"\n5]Employee Designation::"+designation+
		"\n6]Is Job Fulltime::"+fulltime+"\n7]Employees Full Address::"+address+"8]Employee DOB::"+dob);
	}
	
	
}
