package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;



	public class ViewLead extends LeafTapsWrappers 
	
	{
		
		public ViewLead(RemoteWebDriver driver, ExtentTest test)
		{
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("View Lead | opentaps CRM"))
			{
				reportStep("This is not Login Page", "FAIL");
			}
		}
		
		
		
		public ViewLead CaputreLead ()
		{
			String obj = getTextById("viewLead_companyName_sp");
			System.out.println("The Lead is : " + obj);
			return new ViewLead(driver, test);
		}
		
		
		public FindLeadPage clickEdit()
		{
			clickByXpath(prop.getProperty("FindLead.Edit.Xpath"));
			return new FindLeadPage(driver, test);
		}
	
	}
