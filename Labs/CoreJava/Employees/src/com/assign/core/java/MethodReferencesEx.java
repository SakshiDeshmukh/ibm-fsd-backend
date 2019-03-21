package com.assign.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferencesEx {

	public static void main(String[] args) {
		String[] countriesArr = {"india","china","Australia","japan"};
		Collection<String> countries = Arrays.asList(countriesArr);
		
		//1st 
		for(String ctr: countries) {
			System.out.println(ctr);
		}
//		By Static Method
		//forEach
//		System.out.println("forEach mthd");
//		countries.forEach(item->System.out.println(item));
//		
//		
//		//lambda Expression
//		System.out.println("lambda mthd");
//		countries.forEach(item->MethodReferencesEx.displayItem(item));
//		
//		//method reference
//		System.out.println("method reference mthd");
//		countries.forEach(MethodReferencesEx::displayItem);
//
//	}
//		//this method is outside main mthd
//	public static void displayItem(String item) {
//			System.out.println(item);
//		}
		
		
		
		//By Non-static Method
		MethodReferencesEx obj = new MethodReferencesEx();
		
		//forEach
		System.out.println("forEach mthd");
		countries.forEach(item->System.out.println(item));
		
		
		//lambda Expression
		System.out.println("lambda mthd");
		countries.forEach(item->obj.displayItem(item));
		
		//method reference
		System.out.println("method reference mthd");
		countries.forEach(obj::displayItem);
		
		//Supplier<List<String>> createlist = () -> {return new ArrayList<String>();};
		

	}
		
	public void displayItem(String item) {
			System.out.println(item);
		}


}
