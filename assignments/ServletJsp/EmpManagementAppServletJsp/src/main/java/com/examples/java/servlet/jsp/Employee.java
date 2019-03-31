package com.examples.java.servlet.jsp;
import java.sql.*;
public class Employee {
    int id;
	String name;
	int age;
	String gender;
	String password;
	String contractor;
	String skills;
	String designation;
	String department;
	String address;
	

	
	public Employee(int id,String name,String password, int age, String gender, String contractor, String skills, String designation,
			String department, String address) {
		super();
	    this.id=id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
		this.contractor = contractor;
		this.skills = skills;
		this.designation = designation;
		this.department = department;
		this.address = address;
	
	}



	public Employee(String name2, int age2, String password2, String gender2, String address2) {
		this.name = name2;
		this.age = age2;
		this.gender = gender2;
		this.password = password2;
		this.address= address2;
	}

	


	public Employee(String name2, int age2, String password2, String gender2, String skills2, String contractor2,
			String designation2, String department2, String address2) {
		this.name = name2;
		this.age = age2;
		this.password = password2;
		this.gender = gender2;
		this.skills = skills2;
		this.contractor = contractor2;
		this.designation = designation2;
		this.department = department2;
		this.address = address2;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", contractor=" + contractor
				+ ", skills=" + skills + ", designation=" + designation + ", department=" + department + ", address="
				+ address + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
