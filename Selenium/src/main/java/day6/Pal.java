package day6;

import java.util.Scanner;

public class Pal

{

	public static void main(String[] args) 
	
	{
    

		Scanner obj = new Scanner(System.in);
		
		int num= obj.nextInt();
		
		    
		    for(int i=100;i<num;i++)
		    {
		    	
		    	int r=0,sum=0,temp=i; 
		    	     
		         
		         while(temp>0)
		         {
		             r=temp%10;
		             
		             temp=temp/10;
		             
		             sum=(sum*10)+r;
		             
		             
		         }
		
		         if(i==sum)
		         {
		             System.out.print(i+ " ");
		         }
		    
}
}
}
