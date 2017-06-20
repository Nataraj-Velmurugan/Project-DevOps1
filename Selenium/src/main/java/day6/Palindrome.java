package day6;

import java.util.Scanner;

public class Palindrome 
{

 	public static void main(String[] args) 
 	{
		
		
		Scanner obj = new Scanner(System.in);
		int d =obj.nextInt();
		
		int a,b=0, c=d;
			
			while(d>0)
			{
				a = d%10;
				b =(b*10)+a;
				d = d/10;
			}
			
			if(c == b )
			{
				System.out.println("Paindrome");
			}
			
			else
			{
				System.out.println("Not Palindrome");
			}
 	}
}
