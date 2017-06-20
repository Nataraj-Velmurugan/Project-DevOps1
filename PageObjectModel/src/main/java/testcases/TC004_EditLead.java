package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

		public class TC004_EditLead  extends LeafTapsWrappers
		
		{
			
			
			@BeforeClass
			
			public void setData()
			{
				
				testCaseName="EditLead";
				testDescription="To edit a existing lead";
				browserName="chrome";
				dataSheetName="TC004";
				category="Sanity";
				authors="Nataraj";
				
			}
			
			@Test(dataProvider= "fetchData")
			
			public void EditLead (String userName, String password, String loggedInName ,
					String LeadId, String Company, String FirstName, String Title)
			{
				new LoginPage(driver, test)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				.verifyLoggedInName(loggedInName)
				.clickCRMSFA()
				.clickLeads()
				.clickFindLeadsmain()
				.enterLeadID(LeadId)
				.clickFindLeads()
				.clickLeadID()
				.clickEdit()
				.entercompanyname(Company)
				.editLeadForm_firstName(FirstName)
				.enterTitle(Title)
				.clickUpdate()
				.CaputreLead();
						
			}
		
		}
