package test1;

public class StringMethods
{

	// Around 50 Pre-defined methods are available in String 
	
	public void stringchar()
	{
		System.out.println("the method name is stringchar() ");
		String s1 ="Google";
		
		String e1="Google";
		
		char[] c1= s1.toCharArray();
		
		for(int i=0; i<s1.length(); i++)
		{
			System.out.print(c1[i]);
		}
		
		char s2 = s1.charAt(3);
		boolean s3 = s1.endsWith(e1);
		System.out.println();
	    System.out.println(" " + s2+ "  is a Char at particular index");
	    System.out.println(s3);
	    
	    String s4 =s1.replace('o', 'a');
	    System.out.println(s4);
	    
	    //String s5 = c1.toString();
	    
	    //String s6= s1.concat(s5);
	    //System.out.println(s6);
	    
	     s1.getChars(1, 2, c1,4);
	     
	     for(char temp : c1)
	     {
	    	 System.out.print(temp);
	     }
	     System.out.println();
	    
	}
	
	 public void getchars()
	    {
		 System.out.println();
		 System.out.println("the method name is getchars()");
	     String str = new String("This is a String1 Handling Tutorial");
	        char[] array = new char[6];
	        str.getChars(10, 16, array, 0);
	        System.out.println("Array Content - 1 ");
	        for(char temp: array)
	        {
	            System.out.print(temp);
	        }

	        char[] array2 = {'a','b','c','d','e','f','g','h'};
	        str.getChars(10, 16, array2, 1);
	        System.out.println("");
	        System.out.println("Second Array Content - 2 ");
	        for(char temp: array2)
	        {
	     	   System.out.print(temp);
	        }
	        
	        /*
	         The method getChars() is used for copying String characters to an Array of chars.

             public void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)
         Parameters description:
         srcBegin – index of the first character in the string to copy.
         srcEnd – index after the last character in the string to copy.
         dest – Destination array of characters in which the characters from String gets copied.
         destBegin – The index in Array starting from where the chars will be pushed into the Array.

         It throws IndexOutOfBoundsException – If any of the following conditions occurs:
         (srcBegin<0) srcBegin is less than zero. (srcBegin>srcEnd) srcBegin is greater than srcEnd.
         (srcEnd > length of string) srcEnd is greater than the length of this string.
         (destBegin<0) destBegin is negative.
         dstBegin+(srcEnd-srcBegin) is larger than dest.length.
         
	         */
	        
	        System.out.println();
	        
	    }
	 
	 public void booleanequals()
	 {
		 String s1="alpha";
		 String s2="gama";
		 String s3="beta";
		 String s4="alPha";
		 System.out.println();
		 System.out.println("the method name is booleanequals()");
		 System.out.println(s1.equals(s2));
		 System.out.println(s2.equals(s3));
		 System.out.println(s2.equals("alpha"));
		 System.out.println(s1.endsWith(s2));
		 System.out.println(s1.equalsIgnoreCase(s4));
		 System.out.println(s1.contentEquals(s2));
		 
	 }
	
	 public void intcompare()
	 {
		 String s1="google is a good company";
		 String s2="all is well";
		 String s3="miracles and mystery will happen";
		 System.out.println();
		 
		 System.out.println("the method name is intcompare()");
		 
		 int i1=s1.compareTo(s2);
		 System.out.println("the int compare functions "+i1);
		 
		 int i2=s1.compareToIgnoreCase(s2);
		 System.out.println("the int compare to ignore case" +"***"+ i2 +"***");
		 
		 int i3=s1.compareToIgnoreCase(s3);
		 System.out.println("the int compare to ignore case" +"***"+ i3 +"***");
	 }
	 
	 public void startandendwith()
	 {
		 String s1="google is a good company";
		 String s2="all is well";
		 String s3="miracles and mystery will happen";
		 
		 System.out.println();
		 
		 System.out.println("the method name is startandendwith()");
		 
		 boolean b1=s1.startsWith("google");
		 System.out.println(b1);
		 boolean b2=s2.startsWith("all", 5);
		 System.out.println(b2);
		 boolean b3=s3.endsWith("happen");
		 System.out.println(b3);
		 
	 }
	 
	 public void stringint()
	 {
		 System.out.println();
		 System.out.println("the method name is StringInt()");
		 String s1="google";
		 int i1=s1.indexOf('l');
		 System.out.println(i1);
		 int i2=s1.indexOf(3);
		 System.out.println(i2);
		 
	 }
	 
	public static void main(String[] args) 
	{
		
		StringMethods obj1 = new StringMethods();
		obj1.stringchar();
		StringMethods obj2 = new StringMethods();
		obj2.getchars();
		StringMethods obj3 = new StringMethods();
		obj3.booleanequals();
		StringMethods obj4= new StringMethods();
		obj4.intcompare();
		StringMethods obj5 = new StringMethods();
		obj5.startandendwith();
		StringMethods obj6= new StringMethods();
		obj6.stringint();
		
		
	}

}
