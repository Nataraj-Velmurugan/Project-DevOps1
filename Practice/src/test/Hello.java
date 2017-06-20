package test;

public class Hello {
	
	int a=10,b=2;
	
	public int add()
	{
		
		int c = a+b;
		return c;
		
	}
	
	public static void main(String [] args)
	{
		
		Hello obj = new Hello();
		obj.add();
		System.out.println(obj.add());
		
	}

}
