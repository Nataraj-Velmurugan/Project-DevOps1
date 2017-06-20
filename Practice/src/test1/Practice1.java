package test1;

import java.util.Map;

public class Practice1


{
	public boolean mapsAreEqual(Map<String, String> mapA, Map<String, String> mapB)
	{

	    try{
	        for (String k : mapB.keySet())
	        {
	            if (!mapA.get(k).equals(mapB.get(k))) 
	            {
	            	System.out.println(mapA);
	                return false;
	            }
	        } 
	        for (String y : mapA.keySet())
	        {
	            if (!mapB.containsKey(y)) 
	            {
	            	System.out.println(mapB);
	                return false;
	            }
	        } 
	    } catch (NullPointerException np) 
	    {
	        return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) 
	{
		

	}

}
