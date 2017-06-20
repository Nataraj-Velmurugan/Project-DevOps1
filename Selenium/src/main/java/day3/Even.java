package day3;

import java.util.Arrays;
import java.util.Scanner;


public class Even 
{
	 
	
	public static void main(String [] args)
	{	
		
		
		Scanner inp = new Scanner(System.in);
		
		int c = inp.nextInt();
		
		//System.out.println("List of even numbers between 1 - 100:");
		
		for(int i=0; i<=c ; i++)
		{
		
			if (i % 2 == 0)
			{
				
				System.out.print(i+ " ");		
		}
		
		}
	}
	
}
		