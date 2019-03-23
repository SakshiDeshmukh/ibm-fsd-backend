package com.examples.spring.core.xml;

import java.time.LocalDate;
import java.util.List;

public class EmployeeAutoWiring {
	private int id;
	private String name;
	private LocalDate dob;
	private String designation;
	private double salary;
	private List skills;
	//private Address address;
	private Boolean fulltime;
	AddressAutoWiring address;
	
	public EmployeeAutoWiring() {
		
	}
	public AddressAutoWiring getAddress() {
		return address;
	}
	public void setAddress(AddressAutoWiring address) {
		this.address = address;
	}
	public EmployeeAutoWiring(AddressAutoWiring address) {
		
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
		salary+"\n4]Employee DOB::"+dob+"\n5]Employee Skills::"+skills+"\n6]Employee Designation::"+designation+
		"\n7]Is Job Fulltime::"+fulltime+"\n8]Employees Full Address::"+address);
	}
	
	
}
