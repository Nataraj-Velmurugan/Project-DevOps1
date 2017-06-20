package string;

public class Specialcharacters 
{
	
	public static void main(String[] args)
	{

	String name = "prasad Android Developer";
	
	String[] namearr = name.split("");
	
	String resultstr = "";

	for (int i = 0; i < namearr.length; i++) 
	{

	    resultstr += namearr[i];

	    if (i!= -1 && i != namearr.length-1) 
	    {
	        resultstr += "_";
	    }
	    
	}
	
	System.out.println( resultstr);

	
	
	}
}




/*char[] c1 = s1.toCharArray();

for(int i=0; i<=c1.length-1; i++)
{
	System.out.print(c1[i]);
	
	for(int j=0; i<=c1.length-2; i++)
	{
		System.out.print("-");
		break;
	}

}*/
