package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.hsmf.MAPIMessage;

public class GetCountOfEachCharacter 

{

	public static void main(String[] args)
	{

		// Lets write Psuedocode first
		// Goal ?? Count of every character in a String

		String data = "amazon";
		
		char[] allChars= data.toCharArray();
		
		Map< Character, Integer > map = new LinkedHashMap<Character, Integer>();
		
		for (char c : allChars) 
		{

			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);	
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
	
	}


	// Class room Session.. [Psuedo Code] 
	// In a given String, find the most number of repeating character
	
	
					/* public static void main(String args[])
				     {
				         String s;
				         int max=0;
				         Scanner sc=new Scanner(System.in);
				         System.out.println("Enter String:");
				         s=sc.next();
				         String s1=" ";  
				             
				         for(int i=0;i<s.length();i++)
				         {
				              int count=0;
				              
				                 for(int j=i+1;j<s.length();j++)
				                 {
				                     if(s.charAt(i)==s.charAt(j))
				                       count++;
				                 } 
				             if(count>max)
				             {
				                 s1=Character.toString(s.charAt(i));
				                 max=count;
				         }
				             else if(count==max)
				             
				             s1=s1+" "+Character.toString(s.charAt(i));
				         }
				
				         System.out.println("the most repeated word in the given string i:" +"''"+ s1 +"''");
				
				
				     }
				*/


}