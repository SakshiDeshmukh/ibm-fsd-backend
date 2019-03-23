package com.examples.spring.core;


public class Employee {
	int id;
	String name;
	int salary;
	String dept;
	int age;

	public Employee() {

	}

	public Employee(int id, String name, int salary, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return   "\t"+id + "\t " + name + "\t " + salary + " \t\t"  + dept +  "\t" + age+"\n" ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
