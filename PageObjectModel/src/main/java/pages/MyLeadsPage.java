package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;



	public class MyLeadsPage extends LeafTapsWrappers 
	
	{
		
		public MyLeadsPage(RemoteWebDriver driver, ExtentTest test)
		{
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Find Leads | opentaps CRM"))
			{
				reportStep("This is not Login Page", "FAIL");
			}
		}
		
		public MyLeadsPage enterLeadID(String data)
		{
			
			enterByXpath(prop.getProperty("MyLead.LeadIDField.Xpath"), data);
			return this;
			
		}
		
		public MyLeadsPage clickFindLeads()
		{
			clickByXpath(prop.getProperty("MyLead.LeadID.Xpath"));
			return this;
		}
		
		public ViewLead clickLeadID()
		{
			clickByXpath(prop.getProperty("MyLead.FindLeads.Xpath"));
			return new ViewLead(driver, test);
		}

		
	
	}
