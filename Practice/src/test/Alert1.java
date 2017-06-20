package test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.hsmf.MAPIMessage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert1  

{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
	
		driver.get("http://www.moneycontrol.com/");
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		for (String eachWindow : allWindows) 
		{
			driver.switchTo().window(eachWindow);
		}
		
		System.out.println("After Move");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		Set<String> allNewWindows = driver.getWindowHandles();
		
		for (String eachWindow : allNewWindows) 
		
		{
			driver.switchTo().window(eachWindow);
			break;
		}
		
		System.out.println("After Second Move");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	
	

}
	
	
	
	
	
	

	/*public static void main(String[] args)
	{

		// Lets write Psuedocode first
		// Goal ?? Count of every character in a String

		String data = "amazon";
		
		char[] allChars= data.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char c : allChars) 
		{

			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);	
			}
			else
			{
				map.put(c, 1);
			}
		}
		

		System.out.println(map);
		*/
		


