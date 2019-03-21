package inputOutput;

import java.util.Scanner;

public class inputOutput {

	public static void main(String[] args) {
     System.out.println("enter your details");
     Scanner in = new Scanner(System.in);
     System.out.println("Enter Name\n");
     String name = in.next();
     System.out.println("Name::"+name);
     System.out.println("Enter Age\n");
     int Age = in.nextInt();
     System.out.println("Age::"+Age);
     System.out.println("Enter Designation\n");
     String designation = in.next();
     System.out.println("Designation::\n"+designation);

     System.out.format("\n Name \t Age \t Designation \n");
     System.out.format("%s \t %d \t %s \n\n",name,Age,designation);
     in.close();

	}

}
