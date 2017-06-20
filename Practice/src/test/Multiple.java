package test;

interface X
{
   public void myMethod();
   
   public void myMethodA();
}
interface Y
{
   public void myMethod();
}
class Multiple implements X, Y
{
   public void myMethod()
   {
       System.out.println(" myMethod ");
   }
   public void myMethodA()
   {
       System.out.println(" myMethodA ");
   }
   
   public static void main (String [] args)
   {
	   Multiple obj = new Multiple();
	   obj.myMethod();
	   obj.myMethodA();
	   
   }
}
