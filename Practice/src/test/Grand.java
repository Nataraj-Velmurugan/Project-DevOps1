package test;

class Grand implements Interface1, Interface2 
{
	
	public void display(int a)
	{
		System.out.println("Azar1");
	}
	
	public void display(String  b)
	{
		System.out.println("Azar2");
	}
	
	
	public static void main(String[] args) 
	{
		
		Grand obj1 = new Grand();
		obj1.display(10);
		//obj1.display("google");
		
	}
}



