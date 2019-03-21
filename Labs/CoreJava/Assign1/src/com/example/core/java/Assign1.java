/**
 * 
 */
/**
 * @author SakshiKDeshmukh
 *
 */
package com.example.core.java;
 
public class Assign1{
	static int t;
	 public static void main(String args[]) {
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
		  //odd-even for a no.
		  int m = 5;
		  if(m % 2 ==0) {
			  System.out.println("m is even");
		  }
		  else {
			  System.out.println("m is odd");
		  }
		  //odd-even range
		  for(int i=1;i<20;i++) {
			  if(i %2==0) {
				  System.out.println(i+ "  ::is even");
			  }
			  else {
				  System.out.println(i+ " :: is odd");
			  }  
			  
		  }
		  
		  //prime of given number
		  int n=23;
		  int count=0;
		  for(int i=2;i<n;i++)
		  {
			  if(n%i==0) {
				  count++;
				  break;}
		  }if(count==0)
		  {
		   System.out.println(n+" is prime number");
		 }
			  else {
				  System.out.println(n+"is not a prime number");
			  }
		  
	    //prime no. in a given range
		  int start=10;
		  int end=30;
		   int cnt=0;
		  int u,v;
		  for(u=start; u<=end; u++)
	        {
	            cnt = 0;
	            for(v=2; v<u; v++)
	            {
	                if(u%v == 0)
	                {
	                    cnt++;
	                    break;
	                }
	            }
	            if(cnt == 0)
	            {
	                System.out.print(u + " \n");
	            }
	        }
		  
		 
	 }
} 
