package day7;

public class String_to_Int

	{
	
	
	
	
	public static void main(String [] args)
		
	{
		
		 //google();	
		inc();
		//incy();
	}

	
	public static void google()
	{
		String k = "100";
		String p = "abc";
		
		String q = k.concat(p);
		
		System.out.println(q);
		
		
		StringBuffer k1 = new StringBuffer("Inc");
		
		
		
		 k1.append("google");
		 
		 System.out.println(k1);
		
		//System.out.println(q);
		
		String s = "100";
		int i = Integer.parseInt(s.trim());
		System.out.println("int i = " +i);	
		
	
		
		int a = 100;
		
		String S = Integer.toString(a);
		
		System.out.println("String S = " +S);
		
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(2));
		
		String a1 = "true                 abc          ";
		
		boolean S1 = Boolean.parseBoolean(a1);
		
		System.out.println(S1);
		
		System.out.println(a1.toCharArray().length);
		
		System.out.println(a1.charAt(2));
		
		
	}
	
	public static void inc()
	{
		
		
		char[] next = {'a', 'b','c'};
		
		String next1 = new String(next);
		
		System.out.println(next1);
		
		Integer x = 10;
		
		System.out.println(x.toString());
		
		System.out.println(x.toString()+"abc");
		
		
	}
	
	public static void incy()
	{
		
		String abc = "keelana";
		
		//String[] def = abc.split("");
		
		//System.out.println(def.length);
		
		
		System.out.println(abc.toCharArray().length);
		
	
	}
}
