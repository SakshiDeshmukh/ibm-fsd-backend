package com.assign.core.java;

public class PrimeNumber {

	public static void main(String[] args) {
		  
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
