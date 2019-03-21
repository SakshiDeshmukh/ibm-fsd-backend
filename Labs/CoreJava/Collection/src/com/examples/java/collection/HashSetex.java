package com.examples.java.collection;

//import java.util.Comparator;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetex {

	public static void main(String[] args) {
		
	Employees<Integer> obj = new Employees<Integer>();
	System.out.println(obj);
		
	///obj.avgSal(a);

// Employees<Integer> emp = new Employees<>();
 Set<Employees<Integer>> empHash = new TreeSet<>();
	
	
	empHash.add(new Employees<Integer>(100,"ram",40000));
	empHash.add(new Employees<Integer>(101,"shyam",50000));
	empHash.add(new Employees<Integer>(102,"sita",80000));
	empHash.add(new Employees<Integer>(103,"gita",10000));
	
	for(Object emp1:empHash) {
		System.out.println(emp1+ " "+ "hashcode is::"+""+emp1.hashCode());
	}
	
	

	}
}
