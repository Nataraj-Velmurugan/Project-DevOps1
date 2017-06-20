package test1;

public class reverse$_using$_recursive  {

	String reverse = "";
    
    public String reverseString(String str)
	{
         
        if(str.length() == 1)
		{
            return str;
        }
		else 
		{
            reverse += str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
			
            return reverse;
        }
    }
     
    public static void main(String []args)
	{
    	reverse$_using$_recursive obj = new reverse$_using$_recursive();
        System.out.println("Result: "+obj.reverseString("Aluma doluma"));
    }

}
