package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.RemoteWebDriver;


public class MethodAlert implements Alt

{
	
	 RemoteWebDriver driver;
	
	public  void alertaccept()
	{
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	}
	


}
