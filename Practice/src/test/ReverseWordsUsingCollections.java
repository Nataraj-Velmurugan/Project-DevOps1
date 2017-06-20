package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ReverseWordsUsingCollections

{

	public static String reverseWords (String s) 
	{
	    String delimiter = " ";
	    List<String> words = Arrays.asList(s.split(delimiter));
	    Collections.reverse(words);
	    return String.join(delimiter, words);
	}
	

		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Input required to ReverseWordsUsingCollections:  ");
			
			String s1 = scan.nextLine();
		
		    System.out.println(reverseWords(s1));
		}
		
		
}
