package test;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {
	
	public static void main(String [] args)
	{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	List <WebElement > links = driver.findElementsByLinkText("Get-a-Quote");
	System.out.println(links.size());
	links.get(5).click();
	
	
	
	
	}
	
}
