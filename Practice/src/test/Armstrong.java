package test;

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) 
     {
        int n,  b,  sum = 0;
        //System.out.print("Armstrong numbers from 1 to 1000:");
        
        Scanner scan = new Scanner(System.in);
        
        int get = scan.nextInt();
        
        for(int i = 1; i <= get; i++)
        {
        
        
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            /*else
            {
            	System.out.println(get+"- This number is not AN");
            	
            	- This number is a Armstrong Number 
            	
            }*/
            sum = 0;
        }
    }
}
