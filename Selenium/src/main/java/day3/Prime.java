package day3;


 import java.util.Scanner;


 public class Prime 
 {

	
	 public static void main (String[] args)
	 {

		 
		 Scanner obj = new Scanner(System.in);

		 int num = obj.nextInt();

	  for (int i = 1; i <= num; i++)
	  {
		  int count = 0;
	   
	   for (int j = 1; j < i/2; j++) 
	     {
	       if (i % j == 0) 
	       {
	       count++;
	       break;
	       }
	     } 

	   	if (count == 0)
	   	{
	   		System.out.print(i + " ");
	   		
	   		//System.out.println("prime");
	    }
	   	
	   	/*else{
	   		System.out.println("Not Prime");
	   	}*/
    }
	 }
 }










