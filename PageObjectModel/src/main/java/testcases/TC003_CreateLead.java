package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;



		public class TC003_CreateLead extends LeafTapsWrappers
	{
		
		@BeforeClass
		public void setData()
		
		{
			testCaseName="CreateLead";
			testDescription="To Create a new Lead ";
			browserName="chrome";
			dataSheetName="TC003";
			category="Smoke";
			authors="Nataraj";
			
		}
		
		
		@Test(dataProvider= "fetchData")
		
		public void createlead (String userName, String password, String loggedInName, 
				String Company, String FirstName, String LastName, 
				String Source, String Marketing, String phone, String email)
		{
			
			new LoginPage(driver, test)
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
			.verifyLoggedInName(loggedInName)
			.clickCRMSFA()
			.clickLeads()
			.clickCreateLead()
			.entercompanyname(Company)
			.enterfirstname(FirstName)
			.enterlastname(LastName)
			.entersource(Source)
			.enterMarket(Marketing)
			.enterphone(phone)
			.enteremail(email)
			.clickcreatelead()
			.CaputreLead();	
			
		}
		
	}
		
