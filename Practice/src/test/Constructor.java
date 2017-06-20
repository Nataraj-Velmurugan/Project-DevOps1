package test;



public class Constructor {
	
	
	      private int var;
	      
	      public Constructor()
	      {
	             //code for default one
	             var = 10;
	      }
	      
	      public Constructor  (int num)
	      {
	             //code for parameterized one
	    	      
	    	  var = num;
	              
	    	  
	      }
	      
	      public int getValue()
	      {
	              return var;
	      }
	      
	      public static void main(String args[])
	      {
	    	  Constructor obj2 = new Constructor(100);
	    	  Constructor obj1 = new Constructor();
	          
	    	  System.out.println("Default Constructor       --  var is: "+obj1.getValue());
	    	  System.out.println("Parameterized Constructor --  var is: "+obj2.getValue());
	    	 
	    	  
	      }
	}


