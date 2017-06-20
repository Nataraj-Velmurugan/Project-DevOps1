package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers

{
	RemoteWebDriver driver;
	
	// int i=1 is for "snapshot file save" increment purpose
	
	int i=1;

	public void invokeApp(String browser, String Url) 
	
	{
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else 
			{
				System.out.println("Please enter valid browser name");
				System.exit(0);
			}
			
			driver.get(Url);
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			takeSnap();
			System.out.println("The Browser is Launched");
		} 
		
		
		catch (WebDriverException  e) 
		{
			System.err.println("Browser Exception");
			
		}
		
		catch(Exception e)
		{
			System.err.println("java Exception");
		}
		
		finally
		{
			takeSnap();
		}
	}
	
	public void enterByClassName(String ClassName, String data)
	{
		try
		{
		driver.findElementByClassName(ClassName).clear();
		driver.findElementByClassName(ClassName).sendKeys(data);
		}
		catch(NoSuchElementException e)
		{
			System.err.println("ClassName");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		
	}
	
	public void enterByCssSelector(String Css, String data)
	{
		try
		{
		driver.findElementByCssSelector(Css).clear();
		driver.findElementByCssSelector(Css).sendKeys(data);
	}
	catch(NoSuchElementException e)
	{
		System.err.println("CssSelecto");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}
	
	
	
	
	public void enterById(String idValue, String data) 
	{
		try
		{
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		takeSnap();
		System.out.println("The text Field "+ idValue+ " value " +data+ " is entered");
	}
	catch(NoSuchElementException e)
	{
		System.err.println("Id error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	public void enterByLinkText(String LinkText , String data)
	{
		
		try 
	{
			
		driver.findElementByLinkText(LinkText).clear();
		driver.findElementByLinkText(LinkText).sendKeys(data);
	}
	catch(NoSuchElementException e)
	{
		System.err.println("LinkText");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}
	
	public void enterByName(String nameValue, String data) 
	{
		try
		{
		driver.findElementByName(nameValue).clear();
		driver.findElementByName(nameValue).sendKeys(data);

	}
	catch(NoSuchElementException e)
	{
		System.err.println("Name");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}
	
	
	public void enterByPartialLinkText(String PartialLinkText, String data )
	{
		try
		{
		driver.findElementByPartialLinkText(PartialLinkText).clear();
		driver.findElementByPartialLinkText(PartialLinkText).sendKeys(data);
	}
		catch(NoSuchElementException e)
		{
			System.err.println("PartialLinkText");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}
	
	
	
	public void enterByTagName(String TagName, String data )
	{
		try
		{
		driver.findElementByTagName(TagName).clear();
		driver.findElementByTagName(TagName).sendKeys(data);
	}
		catch(NoSuchElementException e)
		{
			System.err.println("TagName");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}
	
	public void enterByXpath(String xpathValue, String data) 
	{
		try
	{
		driver.findElementByXPath(xpathValue).clear();
		driver.findElementByXPath(xpathValue).sendKeys(data);

	}
		catch(NoSuchElementException e)
		{
			System.err.println("Xpath");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}
	
	public void  alertaccept() 
	
	{
		try
	{
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	}
	catch(NoSuchElementException e)
	{
		System.err.println("PartialLinkText");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}
	
	
	public void verifyTitle(String title) 
	{
		
		try
		{
		if(driver.getTitle().contains(title))
			System.out.println("Title Matching");
		
		else
			
			System.out.println("Title Not Matching");

	}
		catch(NoSuchElementException e)
		{
			System.err.println("PartialLinkText");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}

	
	public void verifyTextById(String id, String text) 
	{
	   try
	 {
		String obj = driver.findElementById(id).getText();
		
      if(obj.contains(text))
      {
			System.out.println("Verified");
		
      }
      else
      {
			System.out.println("Not Verfied");

      }
	}
	catch(NoSuchElementException e)
	{
		System.err.println("TextById error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	
	public void verifyTextByXpath(String xpath, String text) 
	{
		try
	{
	    String obj= driver.findElementByXPath(xpath).getText();
	    
		if(obj.contains(text))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verfied");
		}
	}
		catch (NoSuchElementException e)
		{
			System.err.println("ByXPath error");
		    throw new RuntimeException("Runtime Exception");
		}
		catch (WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
		    throw new RuntimeException("Runtime Exception");
		}
		catch (Exception e)
		{
			System.err.println("Java Exception");
		    throw new RuntimeException("Runtime Exception");
		}
		
	}
	

	
	public void verifyTextContainsByXpath(String xpath, String text) 
	{
		try
	{
		String obj = driver.findElementByXPath(xpath).getText();	
         if(obj.contains(text))
         {
			System.out.println("Verified");
         }
			else
			{
			System.out.println("Not Verfied");
			}
	}
	catch(NoSuchElementException e)
	{
		System.err.println("TextContainsByXpath error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	
	public void clickById(String id) 
	{
		try
	{
		driver.findElementById(id).click();
		System.out.println("Button Clicked ByID");

	}
		catch(NoSuchElementException e)
	{
		System.err.println("clickById error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	
	public void clickByClassName(String classVal) 
	{
		try
		{
		driver.findElementByClassName(classVal).click();
		System.out.println("Button Clicked ByClassName");
	}
		catch(NoSuchElementException e)
		{
			System.err.println("ClickByClassName error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}

	
	public void clickByName(String name) 
	{
		try
		{
		driver.findElementByName(name).click();
		System.out.println("Button Clicked ByName");

	}
	catch(NoSuchElementException e)
	{
		System.err.println("ClickByName error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	
	public void clickByLinkText(String name) 
	{
		try
	{
		driver.findElementByLinkText(name).click();
		System.out.println("Button Clicked ByLinkText");
		
	}
	catch(NoSuchElementException e)
	{
		System.err.println("ClickByLinkText error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	
	public void clickByCssSelector(String Css )
	{
		try
	{
		driver.findElementByCssSelector(Css).click();
		System.out.println("Button Clicked ByCss");
	}
	catch(NoSuchElementException e)
	{
		System.err.println("ClickByCssSelector error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}


	
	public void clickByLinkNoSnap(String name) 
	{
		try
		{
		driver.findElementByLinkText(name).click();
		System.out.println("Button Clicked ByLinkNoSnap");

	}
		catch(NoSuchElementException e)
		{
			System.err.println("clickByLinkNoSnap error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		
		}


	
	public void clickByXpath(String xpathVal) 
	{
		try
	{
		driver.findElementByXPath(xpathVal).click();
		System.out.println("Button Clicked ByXPath");
		
	}
	catch(NoSuchElementException e)
	{
		System.err.println("clickByXpath error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}

	
	
	public void clickByXpathNoSnap(String xpathVal) 
	{
		try
		{
		driver.findElementByXPath(xpathVal).click();
		System.out.println("Button Clicked ByXPathNoSnap");

	}
	catch(NoSuchElementException e)
	{
		System.err.println("clickByXpathNoSnap error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	
	}
	
	

	
	public String getTextById(String idVal) 
	{
		try
	{
		driver.findElementById(idVal).getText();
		System.out.println("The getTextByIdvalue is "+ idVal  );
		return idVal;
	}
		
		catch(NoSuchElementException e)
		{
			System.err.println("getTextById error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}	
	
	
	public String getTextByClassName(String ClassName)
	{
		try
	{
		driver.findElementByClassName(ClassName).getText();
		System.out.println("The ClassName is :" + ClassName);
		return ClassName;
	}
		catch(NoSuchElementException e)
		{
			System.err.println("getTextByClassName error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}

	
	public String getTextByXpath(String xpathVal) 
	{
		try
		{
		driver.findElementByXPath(xpathVal).getText();
		System.out.println("The getTextByXpathVal" + xpathVal);
		return xpathVal;
	}
	catch(NoSuchElementException e)
	{
		System.err.println("getTextByXpath error");
		throw new RuntimeException("Runtime Exception");
	}
	catch(WebDriverException e)
	{
		System.err.println("Unexpected close of browser");
		throw new RuntimeException("Runtime Exception");
	}
	catch(Exception e)
	{
		System.err.println("Java Exception");
		throw new RuntimeException("Runtime Exception");
	}
	finally
	{
		takeSnap();
	}
	}


	
	public void selectIndexById(String id, int value) 
	
	{
		try
		{
        WebElement src = driver.findElementById(id);
		
		Select dropdown = new Select(src);
		
		dropdown.selectByIndex(value);
		
		System.out.println("The dropdown value is " + value);

	}
		catch(NoSuchElementException e)
		{
			System.err.println("selectIndexById error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}
	
	public void selectValueById(String id, String value) throws Exception
	{
		try
	{
		WebElement src = driver.findElementById(id);
		
		Select dropdown = new Select(src);
		
		dropdown.selectByValue(value);
	}
		catch(NoSuchElementException e)
		{
			System.err.println("selectValueById error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
		}
	
	public void selectVisibileTextById(String id, String value) 
	{
		try
		
	{

        WebElement src = driver.findElementById(id);
		
		Select dropdown = new Select(src);
		
		dropdown.selectByVisibleText(value);
		
		System.out.println("The dropdown value is " + value);
        
	}
		catch(NoSuchElementException e)
		{
			System.err.println("selectVisibileTextById error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		finally
		{
			takeSnap();
		}
	}
		

	
	public void switchToParentWindow() 
	
	{
		try
		{
		Set<String> Switchwindows  =driver.getWindowHandles();
		System.out.println(Switchwindows.size());
		for (String windows : Switchwindows) 
		{
			driver.switchTo().window(windows);
			break;
		}

	}
		catch(NoSuchWindowException e)
		{
			System.err.println("switchToParentWindow error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		
	}
		

	
	public void switchToLastWindow() 
	{
		try
	{

		Set<String> Switchwindows  =driver.getWindowHandles();
		System.out.println(Switchwindows.size());
		for (String windows : Switchwindows)
		{
			driver.switchTo().window(windows);

		}
		}
		catch(NoSuchWindowException e)
		{
			System.err.println("switchToLastWindow error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		
	}
		

	
	public void acceptAlert() 
	{
		try
	{
		Alert alt =driver.switchTo().alert();

		alt.accept();
	}
		catch(NoSuchElementException e)
		{
			System.err.println("acceptAlert error");
			throw new RuntimeException("Runtime Exception");
		}
		catch(WebDriverException e)
		{
			System.err.println("Unexpected close of browser");
			throw new RuntimeException("Runtime Exception");
		}
		catch(Exception e)
		{
			System.err.println("Java Exception");
			throw new RuntimeException("Runtime Exception");
		}
		
		finally
		{
			takeSnap();
		}
	
	}

	
	public void takeSnap() 
	    
	    {
			
		    File src1 = driver.getScreenshotAs(OutputType.FILE);
		    File des1 = new File("./snaps/snap"+i+".jpg");
		    try 
		{
			FileUtils.copyFile(src1, des1);
		} 
		
		    catch (IOException e) 
		
		{
			e.printStackTrace();
		}
		    i++;

	    }

	
	public void closeBrowser() 
	{
		driver.close();

	}

	
	public void closeAllBrowsers() 
	{
		driver.quit();

	}

	

}