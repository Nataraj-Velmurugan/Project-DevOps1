package day5;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[])  
	
	{    
	    int n1=1,n2=2,n3;
	    
	    
	    
		Scanner obj = new Scanner(System.in);
	    
	   int num = obj.nextInt();
	       
	 
	       //System.out.print(n1+" "+n2);  
	    
	    for(int i=2;i<num;i++)   
	 {
	    	

	  	  n3=n1+n2;  
	  	  
	  	  n1=n2;    
		  
		  n2=n3;   
	  	  
	  
	  System.out.print(" "+n3);    
	  
	  
	 }    
	  
	}

}
