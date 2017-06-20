package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

		public class FindLeadPage extends LeafTapsWrappers
		{
		
			public FindLeadPage(RemoteWebDriver driver, ExtentTest test)
			{
				this.driver = driver;
				this.test = test;
				
				if(!verifyTitle("opentaps CRM"))
				{
					reportStep("This is not FindLead Page", "FAIL");
				}
				
			}
			
			
			
		public FindLeadPage entercompanyname(String data)
		{
			enterById(prop.getProperty("EditLead.Company.Id"), data);
			return this;
			
		}
		public FindLeadPage editLeadForm_firstName(String data)
		{
			enterById(prop.getProperty("EditLead.FirstName.Id"), data);
			return this;
			
		}
		public FindLeadPage enterTitle(String data)
		{
			enterById(prop.getProperty("EditLead.Title.Id"), data);
			return this;
			
		}
		
		public ViewLead clickUpdate ()
		{
			clickByXpath(prop.getProperty("EditLead.Update.Xpath"));
			return new ViewLead(driver, test); 
		}
		
		public ViewLead CaputreLead ()
		{
			getTextById("viewLead_companyName_sp");
			return new ViewLead(driver, test);
		}
		}
