package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;



	public class CreateLeadPage extends LeafTapsWrappers 
	
	{
		public CreateLeadPage(RemoteWebDriver driver, ExtentTest test)
		{
			this.driver = driver;
			this.test = test;

			if(!verifyTitle("Create Lead | opentaps CRM"))
			{
				reportStep("This is CreateLead Page", "FAIL");
			}
		}
		
		
		
		public CreateLeadPage entercompanyname (String data)
		{
			enterById("createLeadForm_companyName", data);   
			return this;
		}
		
		public CreateLeadPage enterfirstname (String data)
		{
			enterById("createLeadForm_firstName", data);
			return this;
		}
		
		public CreateLeadPage enterlastname (String data)
		{
			enterById("createLeadForm_lastName", data);
			return this;
		}
		
		public CreateLeadPage entersource (String data)
		{
			selectVisibileTextById("createLeadForm_dataSourceId", data);
			return this;
		}
		
		public CreateLeadPage enterMarket (String data)
		{
			selectVisibileTextById("createLeadForm_marketingCampaignId", data);
			return this;
		}
		
		public CreateLeadPage enterphone (String data)
		{
			enterById("createLeadForm_primaryPhoneNumber", data);
			return this;
		}
		
		public CreateLeadPage enteremail (String data)
		{
			enterById("createLeadForm_primaryEmail", data);
			return this;
		}
		
		public ViewLead clickcreatelead ()
		{
			clickByClassName("smallSubmit");
			return new ViewLead(driver, test);
		}
		
		public ViewLead CaputreLead ()
		{
			getTextById("viewLead_companyName_sp");
			return new ViewLead(driver, test);
		}
	
	}
