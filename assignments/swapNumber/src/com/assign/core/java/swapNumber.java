package com.assign.core.java;

public class swapNumber {

	public static void main(String[] args) {
		//swapping of two numbers
		 int a= 10;
		 int b = 20;
		 int temp;
		  temp= a;
		  a=b;
		  b=temp;
		  System.out.println("value of a ::"+a);
		  System.out.println("value of b ::"+b);
		  //swapping without using temp variable
		  int x = 40;

		  int y = 60;
		  
		  x = x+y;
		  y = x-y;
		  x = x-y;
		  System.out.println("value of x is"+ x);
		  System.out.println("value of y is"+ y);

	}

}
