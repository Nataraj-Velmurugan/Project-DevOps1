package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;



	public class CreateLead extends LeafTapsWrappers 
	
	{
		
		public CreateLead(RemoteWebDriver driver, ExtentTest test)
		{
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Create Lead | opentaps CRM"))
			{
				reportStep("This is not Login Page", "FAIL");
			}
		}
		
		
		
		
		
		
		/*public MyLeadsPage clickLeads(){

			clickByName("Leads");

			return new MyLeadsPage(driver, test);
		}
		*/
		
		
		
		
	
	}
