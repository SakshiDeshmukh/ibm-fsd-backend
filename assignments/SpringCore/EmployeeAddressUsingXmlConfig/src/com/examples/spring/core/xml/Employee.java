package com.examples.spring.core.xml;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private LocalDate dob;
	private String designation;
	private double salary;
	@SuppressWarnings("rawtypes")
	private List skills;
	private Address address;
	private Boolean fulltime;
	
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getDesignation() {
		return designation;
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
		salary+"\n4]Employee DOB::"+dob+"\n5]Employee Skills::"+skills+"\n6]Employee Designation::"+designation+
		"\n7]Is Job Fulltime::"+fulltime+"\n8]Employees Full Address::"+address);
	}
	
	
}
