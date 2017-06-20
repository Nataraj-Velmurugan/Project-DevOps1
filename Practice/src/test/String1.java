package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class String1 
{
	
	
	public static void main(String[] args) 
	{
			
		Scanner scan = new Scanner(System.in);

		System.out.println("please give the input");

		String s1 = scan.next();

		char[] c1 = s1.toCharArray();
			

		Map<Integer, Character> map = new TreeMap<Integer, Character>();

		map.put(1, 'a'); map.put(2,'b'); map.put(3,'c'); map.put(4,'d'); map.put(5,'e'); map.put(6,'f'); map.put(7,'g');
		map.put(8,'h'); map.put(9,'i'); map.put(10,'j'); map.put(11,'k'); map.put(12,'l'); map.put(13,'m'); map.put(14,'n');
		map.put(15,'o'); map.put(16,'p'); map.put(17,'q'); map.put(18,'r'); map.put(19,'s'); map.put(20,'t'); map.put(21,'u');
		map.put(22,'v'); map.put(23,'w'); map.put(24,'x'); map.put(25,'y'); map.put(26,'z');
		
		
		for(char c : c1)
		{
		
			if(map.containsKey(c))
			{
				map.put(map.get(c)+1, c);	
			}
			else
			{
				map.put(1, c);
			}
			
		}
		
		System.out.println(map);
	
	}
	
		}
		