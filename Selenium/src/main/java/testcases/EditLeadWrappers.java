package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapLogin;


	public class EditLeadWrappers extends LeafTapLogin 
	
	{
		//@Test(dependsOnMethods="testcases.CreateLead.createLead")
	
		@Test(groups={"sanity"},dependsOnGroups={"smoke"})
	
		public void editLead(String Name, String companyname) throws Exception 
	
		{
			clickByLinkText("CRM/SFA");
			clickByLinkText("Leads");
			clickByLinkText("Find Leads");
	
			enterByXpath("(//input[@name='firstName'])[3]", Name);
			Thread.sleep(2000);
			clickByXpath("//button[contains(text(),'Find Leads')]");
	
			Thread.sleep(2000);
			clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			verifyTextById("sectionHeaderTitle_leads", "View Lead");
			clickByLinkText("Edit");
	
			enterById("updateLeadForm_companyName", companyname);
			clickByName("submitButton");
			verifyTextById("viewLead_companyName_sp", "RSS");
		}
	
		
		@DataProvider(name="abc")
		
		public Object[][] datautils()
		
		{
			Object[][] data = new Object[1][2];
			data[0][0]= "def";
			data[0][1]= "Google Inc";
			return data;
			
		}
	
	
	}

