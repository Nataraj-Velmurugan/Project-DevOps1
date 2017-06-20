package day6;

import java.util.Scanner;

public class Factorial 
{
	  
		 public static void main(String args[])
		 
		 {  
		  
			 int fact=1;  
			 
			 Scanner obj = new Scanner(System.in);
			 
			int num = obj.nextInt();
			 
		 
			 for(int i=1;i<=num;i++)
		  
		  {   
				 
		     fact=fact*i;    
		     
		  } 
		  
		 
		  System.out.println("Factorial of "+ num +" is: "+fact);    
		 
		 }
	
		 
		}



