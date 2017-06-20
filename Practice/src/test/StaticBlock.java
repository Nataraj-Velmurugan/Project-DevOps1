package test;

public class StaticBlock {
	
	static int i=10;
	
	static
	
	{
		m1();
		
		System.out.println("Base Static class");
	}
	
	public static void main (String[]args)
	
	{
		m1();
		
		System.out.println("Base main");
		
	}
	
	public static void m1()
	
	{
		System.out.println(j);
		
	}
	
	static int j=20;

}

			
	
