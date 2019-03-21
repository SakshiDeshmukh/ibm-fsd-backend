package com.examples.day2;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// String DataType:::::::
		
		String str = "Hello";
		System.out.println(str);
		
		
		//Array:::::::::
		
		int a[] = new int[10];
		a[0]=78;
		System.out.println(a[0]);
		int[] arr;//declare array
		arr = new int[] {1,2,3,4,5};//instance of array initialization
		int nos[] = {4,5,6,7,8};
		System.out.println("first no."+nos[0]);
		System.out.println("last  no."+nos[nos.length-1]);
		
		for(int i =0;i<nos.length;i++) {
			System.out.println("array iteration for loop::"+nos[i]);
		}
		
		 for(int i :arr)
		 {
			 System.out.println("array iteration for-each loop::"+ i);
		 }
		
 //declaring in method==parameter and passing value to object ==argument
		
		
		
		
		
		
		
		
		
		
		
		
		
	////////////////////////////////////////////////////////////////////////////////////////////////////
		 //branching statements::break,continue,return
		   
		  /*
		  for(int i=1;i<=10;i++)
		  {
			  
			  if(i==8) {
				  
				  break;
				  }
			  System.out.println(i);
		  }
		  System.out.println("loop complteted ::break");
		  //
		  for(int i=1;i<=10;i++)
		  {
			  
			  if(i==8) {
				  
				  return;
				  }
			  System.out.println(i);
		  }
		  System.out.println("loop complteted::return");
		  //
		  
		  for(int g=1;g<=10;g++)
		  {
			  
			  if(g==8) {
				  
				  continue;
				  }
			  System.out.println(g);
		  }
		  System.out.println("loop complteted ::continue");
		  //////labels only work with break and continue and does not work with return ??????????????????*/
	}

}
