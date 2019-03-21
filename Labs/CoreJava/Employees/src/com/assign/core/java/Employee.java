package com.assign.core.java;
public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 2759479023445589554L;
	
		public String name;
		public String address;
		public transient int SSN;
		public int id;

		public void mailCheck() {
			System.out.println("Mailing a check to " + name + " " + address);
		}
	}

