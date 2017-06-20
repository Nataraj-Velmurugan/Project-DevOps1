package test;

public class Derived extends StaticBlock{
	
			
				static int x=100;
				
				static 
				
				{
					m2();
					
					System.out.println("Derived static Block");
					
					
				}
	
				
				public static void main(String [] args)
				
				{
					
					m2();
					
					System.out.println("Derived main");
					
				}
	


				public static void m2()
				
				{
					
					System.out.println(y);
				}
	
				static 
				{
					System.out.println("Derived second static ");
				}
	
				static int y=200;

}
