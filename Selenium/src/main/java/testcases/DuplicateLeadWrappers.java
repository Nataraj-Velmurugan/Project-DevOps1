package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapLogin;


public class DuplicateLeadWrappers extends LeafTapLogin

{
	@Test(dependsOnMethods="testcases.CreateLeadWrappers.createlead", groups={"regression"})
	
	public void duplicatelead(String Email ) throws Exception 
	
	
	{
		
		
		clickByLinkText("CRM/SFA");

		clickByLinkText("Leads");

		clickByLinkText("Find Leads");

		clickByXpath("//span[text()[contains(.,'Email')]]");

		enterByName("emailAddress", Email);

		clickByXpath("//button[contains(text(),'Find Leads')]");

		Thread.sleep(3000);

		String myleadname =  getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");

		System.out.println(myleadname);

		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");

		clickByClassName("subMenuButton");

		verifyTitle("Duplicate Lead");

		clickByClassName("smallSubmit");

		verifyTextById("viewLead_firstName_sp", myleadname);


		}

	    @DataProvider(name="abc")
	    
	    public Object[][] datautils()
	    
	    {
	    	Object[][] data = new Object[1][2];
	    	data[0][0]= "abc@abc.com";
	    	return data;
	    	
	    	
	    }


		}
















