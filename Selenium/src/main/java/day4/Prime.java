package day4;

import java.util.Scanner;

public class Prime 

    {
	
	 public static void main(String[] args)
	 
	 {
		 
		 int count = 0;
		 
		 Scanner obj = new Scanner(System.in);
		 
		 int i = obj.nextInt(); 
		 
 
	       for (int j=2; j<i; j++)
	  {
	     
	       if (i % j == 0) 
	       {
	       count++;
	       break;
	     }
	 
	  }
	   	if (count == 0)
	   	{
	   		System.out.println("This is a prime number");
	    }
	   	
	   	else
	   	{
	   		System.out.println("This is not a prime number ");
	   	}
   }
 }



