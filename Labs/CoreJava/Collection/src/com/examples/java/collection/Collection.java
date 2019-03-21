package com.examples.java.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;//Vector()::thread safe

public class Collection {

	public static void main(String[] args) {
		
		Set countriesHashSet  = new HashSet();
		countriesHashSet.add("India");
		countriesHashSet.add("China");
		countriesHashSet.add("Uk");
		countriesHashSet.add("Germany");
		countriesHashSet.add("Germany");
		System.out.println("Hastset Output:");
		for(Object item:countriesHashSet)
		{
			
			System.out.println(item);
		}
		
	   SortedSet countriesTreeSet = new TreeSet();//SortedSet is parent of TreeSet
	   countriesTreeSet.add("India");
	   countriesTreeSet.add("China");
	   countriesTreeSet.add("Uk");
	   System.out.println("Treeset Output:");
		for(Object item:countriesTreeSet)
		{
			
			System.out.println(item);
		}
		
		
		 Set countriesLinkedHashSet = new LinkedHashSet();
		   countriesLinkedHashSet.add("India");
		   countriesLinkedHashSet.add("China");
		   countriesLinkedHashSet.add("Uk");
		   System.out.println("LinkedHashSet Output:");
			for(Object item:countriesLinkedHashSet)
			{
				
				System.out.println(item);
			}
		
		
		Vector countries = new Vector();//concurrent features
		countries.add("India");
		countries.add("America");
		countries.add("china");
		 
		Object[] arr = countries.toArray();
		 System.out.println("country array size"+arr.length);
		 
				//for (int i=0;i<50;i++) {
					//countries.add("India"+i);
				//}
		System.out.println(countries.size());
		System.out.println(countries.get(2));
		 
		System.out.println("ALL COUNTRIES VECTOR::");
		for(Object item:countries)
		{
			
			System.out.println(item);
		}
		countries.remove(0);

		for(Object item:countries)
		{
			System.out.println(item);
		}
		

		
		
		List countriesList = new ArrayList();//read more operation
		countriesList.add("Germany");
		countriesList.add("Africa");
		countriesList.add("Noida");
		// displayAll(countriesList);
		 System.out.println("ALL COUNTRIES ARRAYLIST::");
			for(Object item:countriesList)
			{
				
				System.out.println(item);
			}
		 List countiresLinkedList = new LinkedList();
		 countiresLinkedList.add("Germany");
		 countiresLinkedList.add("Africa");
		 countiresLinkedList.add("Noida");
			// displayAll(countriesList);
			 System.out.println("ALL COUNTRIES LINKEDLIST::");
				for(Object item:countiresLinkedList)
				{
					
					System.out.println(item);
				}

		 
		// static void displayAll(Collection col) {
		//	 for(Object ele:col) {
			//	 System.out.println(ele);
			 //}
		 //}
				
				
		 
		 
	}

}
