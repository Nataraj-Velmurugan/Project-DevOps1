package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapLogin;



public class DeleteLeadWrappers extends LeafTapLogin

{

	@Test(invocationTimeOut=6000 , groups={"regression"})
	
	
	public void deletelead(String phonenumber) throws Exception
	
	{
		
		
		//clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByXpath("//span[text()[contains(.,'Phone')]]");
		enterByName("phoneNumber", phonenumber);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		String myleadid = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(myleadid);
		/*clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByClassName("subMenuButtonDangerous");
		clickByLinkText("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", myleadid);
		Thread.sleep(3000);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
        */
		
	}
	
	@DataProvider(name="abc")
	
	public Object[][] DataUils()
	{
		Object[][] data = new Object[1][2];
				data[0][0]= "9876543210";
				
				return data;
	}
	
}
