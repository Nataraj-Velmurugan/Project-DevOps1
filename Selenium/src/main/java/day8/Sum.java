package day8;

	public class Sum 

	{
	
	int d;
	
	int a=10, b=20;
	
	
	public int addNumbers(int a,int b)
	
	{
		
		int c = a+b;
		System.out.println("d :"+d);
		return c;
	}
	
	public int addNumbers(int a,int b,int c)
	
	{
		return a+b+c;
	}
	
	public int addNumbers(String a,String b)
	
	{
		int c = Integer.parseInt(a)+Integer.parseInt(b);
		return c;
	}
	
	
		
}