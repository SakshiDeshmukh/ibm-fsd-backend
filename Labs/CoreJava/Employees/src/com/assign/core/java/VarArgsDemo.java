package com.assign.core.java;
@SuppressWarnings(value="unchecked")
public class VarArgsDemo {

//	public static int sum(int a, int b) {
//		return a+b;
//	}
	public static int sum(int...args) {//variable argument//when parametr is not defined
		int total=0;
		for(int arg:args) {
			total += arg;
		}
		return total;
	}
	public static void main(String[] args) {
       System.out.println(sum(10,20));
	}

}
