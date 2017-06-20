package test;

public class Over

{
	int a;
	String b;

	  Over ( int x,String y)
	{
		a=x;
		b=y;
	}
	
	  void display()
	  {
		  System.out.println(a+" "+b);
	  }
	  
	public static void main(String [] args)
	{
		
		
		Over obj = new Over(10,"abc");
		obj.display();
	}
}
