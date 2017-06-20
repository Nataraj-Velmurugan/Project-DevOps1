package test;

public class NonStaticFlow {
	
	 static int i1=20;

	int i=10;
	
	{
		m1();
		System.out.println("First Instance Block");
	}
	
	static {
		
		m3();
		System.out.println("1st Static block");
		
	}
	
	NonStaticFlow()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		NonStaticFlow nsf=new NonStaticFlow();
		nsf.m1();
		System.out.println("Main");
	}
	
	static void m3()
	{
		System.out.println("static methord");
	}
	public void m1()
	{
		System.out.println(j);
		
	}
	
	{
		System.out.println("Second Instance block");
	}
	
	int j=20;
}
