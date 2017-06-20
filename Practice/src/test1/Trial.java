package test1;

public class Trial 
{

	public static void main(String[] args) 
	{
		
		String s1="Google";
		
		
		String[] s2=s1.split("");
		
		String s3="";
		
		for(int i=0; i< s2.length; i++)
		{
			s3 += s2[i];
			
			if(i!= -1 && i!= s2.length-1)
			{
				s3 += "-";
			}	
		}
		
		System.out.println(s3);

	}

}
