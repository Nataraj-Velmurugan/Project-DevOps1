package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Training {
	
	public static void main(String[] args)
	{
		 Map<String, ArrayList<Integer>> m= new HashMap<String, ArrayList<Integer>>();
		    ArrayList<Integer> al = new ArrayList<Integer>();
		    ArrayList<Integer> al1 = new ArrayList<Integer>();
		    ArrayList<Integer> al2 = new ArrayList<Integer>();
		    
		    ArrayList<ArrayList<Integer>> all= new ArrayList<ArrayList<Integer>>();
		    ArrayList<String> all1= new ArrayList<String>();
		    
		    al.add(1);al.add(2);al.add(3);al.add(4);
		    
		    al1.add(1);al1.add(2);al1.add(3);
		    
		    al2.add(1);al2.add(2);al2.add(3);al2.add(4);
		    
		    m.put("A", al);m.put("B", al1);m.put("C", al2);
		    
		    
		    System.out.println(m);
		    
		    Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		    
		    Map<String, ArrayList<Integer>> map1 = new HashMap<String, ArrayList<Integer>>();
		    
		    map.putAll(m);
		    
		    for(Entry<String, ArrayList<Integer>> entry : m.entrySet())
		    {   
		        for(Entry<String, ArrayList<Integer>> entry1 : map.entrySet())
		        {
		           if (!entry.getKey().equals(entry1.getKey())) 
		           {
		             if (entry.getValue().equals(entry1.getValue())) 
		             {

		                 map1.put(entry1.getKey(), entry1.getValue());
		                 
		                 System.out.println(map);
		            }
		           }
		           else 
		           {
		               if (map1.isEmpty()) 
		               {
		                       map1.put(entry.getKey(), entry.getValue());
		                       
		                       System.out.println(map1);
		               }
		               
		            else
		                 {
		                     if (map1.containsValue(entry.getValue()))
		                 {
		                       map1.put(entry.getKey(), entry.getValue());
		                       
		                       System.out.println(map1);
		                 }
		                     
		                 }
		               
		             }

		        }
		
	}

	        }

}
