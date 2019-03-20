package com.assign.core.java;


import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaExpression lamExp = new LambdaExpression();
		
	      //with type declaration
	      //MathOperation addition = (int a, int b) -> a + b;
	      //BiFunction<Integer, Integer, Integer> addition = (Integer a, Integer b) -> a + b;
			
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
		
	      //sysout
	      System.out.println("10 + 5 = " + lamExp.operates(10, 5, (a,b)->a+b));
	      System.out.println("10 - 5 = " + lamExp.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + lamExp.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + lamExp.operate(10, 5, division));
	      
	  
	      //without parenthesis and using Consumer functional interface
	      Consumer<String> greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis and using custom functional interface
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.accept("Mahesh");
	      greetService2.sayMessage("Suresh");      
	      
	}
	
	      interface MathOperation {
		      int operation(int a, int b);
		   }

			
		   interface GreetingService {
		      void sayMessage(String message);
		   }

		
		   private int operate(int a, int b, MathOperation mathOperation) {
		      return mathOperation.operation(a, b);
		   }
		   
		   
		   private int operates(Integer a, Integer b, BiFunction<Integer, Integer, Integer> mathOperation) {
			      return mathOperation.apply(a, b);
			   }

	}
