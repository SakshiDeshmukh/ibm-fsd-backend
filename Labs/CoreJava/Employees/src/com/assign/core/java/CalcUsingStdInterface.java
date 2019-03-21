package com.assign.core.java;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalcUsingStdInterface {

	public static void main(String[] args) {
		CalcUsingStdInterface lamExp = new CalcUsingStdInterface();
			
		     //  BiFunction<Integer,Integer,Integer> addition = ( a,  b) -> a + b;
				
		       BiFunction<Integer,Integer,Integer> subtraction = ( Integer a,Integer b) -> a + b;
				
		      //with return statement along with curly braces
		       BiFunction<Integer,Integer,Integer> multiplication = ( a,  b) -> { return a * b; };
				
		      //without return statement and without curly braces
		       BiFunction<Integer,Integer,Integer> division = ( a,  b) -> a / b;
				
		      System.out.println("10 + 5 = " + lamExp.operate(10, 5, ( a,  b) -> a + b));
		      System.out.println("10 - 5 = " + lamExp.operate(10, 5, subtraction));
		      System.out.println("10 x 5 = " + lamExp.operate(10, 5, multiplication));
		      System.out.println("10 / 5 = " + lamExp.operate(10, 5, division));
		      
		  
		      //without parenthesis and using Consumer functional interface
		      Consumer<String> greetService1 = message ->
		      System.out.println("Hello " + message);
				
		      //with parenthesis and using custom functional interface
//		      GreetingService greetService2 = (message) ->
//		      System.out.println("Hello " + message);
		
		      greetService1.accept("Mahesh");
		      greetService1.accept("Suresh");      
		      
		   }
			
//		   interface MathOperation {
//		      int operation(int a, int b);
//		   }
			
		   
//		   interface GreetingService {
//		      void sayMessage(String message);
//		   }
	
			
		   
		   private int operate(int a, int b, BiFunction<Integer,Integer,Integer> mathOperation) {
		      return mathOperation.apply( a, b);
		   }

}
