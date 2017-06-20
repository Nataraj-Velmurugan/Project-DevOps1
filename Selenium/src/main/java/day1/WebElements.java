package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) 
	
	{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
         
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		 //driver.close();

		

	}

}
