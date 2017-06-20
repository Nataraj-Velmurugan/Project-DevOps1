package test;



import java.util.Random;



	public final class RandomNumGen
	{
	  
		  public static final void main(String[] aArgs)
		{
		    
		    
		    Random randomGenerator = new Random();
		
		    for (int i = 1; i <= 10; i++)
		    {
		      int randomInt = randomGenerator.nextInt(100);
		
		      System.out.println(randomInt);
		
		    }
		    
		    System.out.println("Done.");
		  }
		}
		
	
	
	
	