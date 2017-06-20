package day4;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Irctc {
	
	public static void main (String [] args) throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
         
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id='demon_content']/div[2]/input").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id='loginFormId']/div[1]/div[4]/div/ul/li[2]/a").click();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("fgh987");
		
		driver.findElementById("userRegistrationForm:password").sendKeys("fgh987");
		
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("fgh987");
		
		WebElement src = driver.findElementByName("userRegistrationForm:securityQ");
		
		Select dropdown = new Select(src);
		
		dropdown.selectByValue("1");
		
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("school");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("abc");
		
		driver.findElementById("userRegistrationForm:lastName").sendKeys("def");
		

		WebElement radioBtn = driver.findElementById("userRegistrationForm:gender:0");
 
		radioBtn.click();
		
		WebElement radioBtn1 = driver.findElementByName("userRegistrationForm:maritalStatus");
		
		radioBtn1.click();
		
         WebElement src1 = driver.findElementById("userRegistrationForm:dobDay");
		
		Select dropdown1 = new Select(src1);
		
		dropdown1.selectByValue("08");
		
		
		 WebElement src2 = driver.findElementById("userRegistrationForm:dobMonth");
			
		 Select dropdown2 = new Select(src2);
			
		 dropdown2.selectByValue("11");
		 
		 
		 WebElement src3 = driver.findElementById("userRegistrationForm:dateOfBirth");
			
		 Select dropdown3 = new Select(src3);
			
		 dropdown3.selectByValue("1991");
		 
		 WebElement src4 = driver.findElementById("userRegistrationForm:occupation");
			
		 Select dropdown4 = new Select(src4);
			
		 dropdown4.selectByValue("0");
		 
		 driver.findElementByXPath("//*[@id='userRegistrationForm:uidno']").sendKeys("987654321");
		 
		 driver.findElementByName("userRegistrationForm:idno").sendKeys("123456789");
		 
		 driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
		 
		 driver.findElementById("userRegistrationForm:mobile").sendKeys("456987321");
		 
		 
		 WebElement src5 = driver.findElementById("userRegistrationForm:nationalityId");
			
		 Select dropdown5 = new Select(src5);
			
		 dropdown5.selectByValue("94");
		 
		 driver.findElementById("userRegistrationForm:address").sendKeys("VPS salai");
		 
		 driver.findElementById("userRegistrationForm:street").sendKeys("OPR plot");
		 
		 driver.findElementById("userRegistrationForm:area").sendKeys("Vadalur");
		 
		 WebElement src6 = driver.findElementById("userRegistrationForm:countries");
			
		 Select dropdown6 = new Select(src6);
			
		 dropdown6.selectByValue("94");
		 
		 driver.findElementById("userRegistrationForm:pincode").sendKeys("607303");
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		 	
		
	}

}
