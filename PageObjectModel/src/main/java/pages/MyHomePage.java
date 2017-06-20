package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;



	public class MyHomePage extends LeafTapsWrappers 
	
	{
		
		public MyHomePage(RemoteWebDriver driver, ExtentTest test)
		{
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("My Home | opentaps CRM"))
			{
				reportStep("This is not My Home Page", "FAIL");
			}
		}

		
		public MyHomePage clickLeads()
		{
			clickByLinkText("Leads");
			
			return this;
		}
		
		
		public CreateLeadPage clickCreateLead()
		{
			clickByLinkText("Create Lead");
			
			return new CreateLeadPage(driver, test);
		}
		
		
		public MyLeadsPage clickFindLeadsmain()
		{

			clickByLinkText("Find Leads");

			return new MyLeadsPage(driver, test);
		}
		
	
	

		
	}
