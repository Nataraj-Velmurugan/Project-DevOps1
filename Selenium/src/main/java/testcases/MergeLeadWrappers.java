package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapLogin;

public class MergeLeadWrappers extends LeafTapLogin

{
	@Test(enabled=false, groups={"regression"})
	
	public void mergeLeadWrappers(String leadID, String leadID1) throws Exception
	
	
	{
		
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Merge Leads");
		clickByXpath("//span[text()='From Lead']/following::img");
		switchToLastWindow();
		enterByXpath("//input[@name='id']", leadID);
		clickByXpath("//button[text()='Find Leads']");
		clickByXpathNoSnap("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::a[@class='linktext']");
		switchToParentWindow();
		clickByXpath("//span[text()='To Lead']/following::img");
		switchToLastWindow();
		enterByXpath("//input[@name='id']",leadID1);
		clickByXpath("//button[text()='Find Leads']");
		clickByXpathNoSnap("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::a[@class='linktext']");
		switchToParentWindow();
		clickByXpathNoSnap("//a[text()='Merge']");
		acceptAlert();
		clickByXpath("//a[text()='Find Leads']");
		enterByXpath("//input[@name='id']",leadID);
		clickByXpath("//button[text()='Find Leads']");
		verifyTextByXpath("//div[@class='x-paging-info']","No records to display");
				
	}
	
	
	
	@DataProvider(name="abc")
	
	public Object[][] datautils()
	{
		
		Object[][] data= new Object[1][3];
		data[0][0]="11462";
		data[0][1]="11464";
		data[1][0]="11462";
		return data;
	}

}
