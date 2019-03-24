package com.examples.spring.core.xml;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Employee {
	
	private int id;
	private String name;
	private LocalDate dob;
	private String designation;
	private double salary;
	private List skills;
	private Boolean fulltime;
	@Autowired
	Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public Employee(int id, String name, LocalDate dob, String designation, double salary, List skills,
			Boolean fulltime) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.designation = designation;
		this.salary = salary;
		this.skills = skills;
		this.fulltime = fulltime;
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
		salary+"\n4]Employee Skills::"+skills+"\n5]Employee Designation::"+designation+
		"\n6]Is Job Fulltime::"+fulltime+"\n7]Employees Full Address::"+address+"\n8]Employee DOB::"+dob);
	}
	
	
}
