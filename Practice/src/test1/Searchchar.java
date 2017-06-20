package test1;

import java.util.Scanner;

public class Searchchar 
{
	public void methoda()
	{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();


		    if(s1.contains("s"))
		    {
		        System.out.println("the character is in the string");
		        
		    }

		    else  
		    {
		        System.out.println("the character is not in the string");
		    }
		}
	
	public void  methodb()
	{
		
		Scanner scan1 = new Scanner(System.in);
		
		String s1 = scan1.nextLine();
		
		char[] c1 = s1.toCharArray();
		
		int count=0;
		
		for(char c2 : c1)
		{
			if(c2 == 'o')
			{
				count++;
			}
		}
		
		if(count >= 1)
		{
			System.out.println("the charcter is in the string");
		}
		
		else
		{
			System.out.println("the charcter is not in the string ");
		}
		
			
	}
	
	public static void main(String[] args)
	{
		Searchchar obj = new Searchchar();
		obj.methodb();
		
	}

}
