package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Verify {
	
	static RemoteWebDriver driver;
	
//	public static void verifyTextById(String text) 
//	{
//		
//		WebElement obj = driver.findElementById("usernameId");
//		String string = obj.getText();
//		
//		if(string.equals(text))
//			System.out.println("Verified");
//		else
//			System.out.println("Not Verfied");
//
//	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.xpath("//*[@id='demon_content']/div[2]/input")).click();
		
		
		WebElement ASC=driver.findElement(By.xpath("html/body/div[2]/div/div[10]/div/div/div[1]"));
		
		System.out.println(ASC.getText());
		
		WebElement ABC=driver.findElementById("usernameId");
		
		ABC.sendKeys("hi");
		
		driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("FJDN");
		
		System.out.println(ABC.getText());
		
		
		
//		Verify.verifyTextById("hi");
				
		
		
		
		
		
		
		
	}
	
}
