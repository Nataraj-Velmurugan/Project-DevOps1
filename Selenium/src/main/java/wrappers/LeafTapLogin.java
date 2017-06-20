package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcases.CreateLeadWrappers;

	public class LeafTapLogin extends GenericWrappers
{
		@BeforeSuite
		
			public void beforeSuite()
		{
			System.out.println(" --00-- BeforeSuite");
		}
		
		@BeforeTest
		
			public void beforeTest()
		{
			System.out.println("--00-- BeforeTest");
		}
		
		@BeforeClass
		
			public void beforeClass()
		{
			System.out.println("--00-- BeforeClass");
		}

		 
			
			@BeforeMethod(groups ={"common"})
			public void login() throws Exception
			{
				System.out.println("--00--  BeforeMethod");
				invokeApp("chrome", "http://leaftaps.com");
				enterById("username", "DemoSalesManager");
				enterById("password", "crmsfa");
				clickByClassName("decorativeSubmit");
				clickByLinkText("CRM/SFA");		
			}
			
			
			/*@Parameters({"browser","url","username","password"}) 
					
	
			public void login(String browser,String url, String username, String password)
	
		{		
				invokeApp("browser","url");
				enterById("username",username);
				enterById("password",password); 
				clickByClassName("decorativeSubmit");
				System.out.println("BeforeMethod");
				
					
		}*/
			
			
			
			
			@AfterMethod(groups="common")
			
			public void afterMethod()
		{
				System.out.println("--00-- AfterMethod");
		}
			
			@AfterClass
			
			public void afterClass()
			{
				System.out.println("--00-- AfterClass");
			}
			
			@AfterTest
			
			public void afterTest()
			{
				System.out.println("--00-- AfterTest");
			}
			
			@AfterSuite(alwaysRun=true)
			
			//groups="common",
		
			public void afterSuite()
			{
				System.out.println("--00-- AfterSuite");
				System.out.println("--00-- Browser QUIT");
				//driver.quit();
			}
}

