package string;

import java.util.Scanner;

public class Swap {
	
		public static void main(String[] args) 
		
		{
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Input required to swap the given string:  ");
			
			String obj1 = scan.nextLine();
			
			String[] obj2 = obj1.split(" ");
			
			String obj3="";
			
			for(int i = obj2.length-1; i>=0; i--)
			{
				obj3 += obj2[i]+" ";
				
				// obj3 = obj3 + obj2[i] + " ";
	
			}
			
			System.out.println(obj3);
			
		}

}



					/*x += y is x = x + y
							
					x -= y is x = x - y
					
					x *= y is x = x * y
					
					x /= y is x = x / y
					
					x %= y is x = x % y
					
					x ^= y is x = x ^ y
					
					x &= y is x = x & y
					
					x |= y is x = x | y
*/