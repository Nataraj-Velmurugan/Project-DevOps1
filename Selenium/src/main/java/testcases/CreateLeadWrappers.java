package testcases; 

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapLogin;


	public class CreateLeadWrappers extends LeafTapLogin
	
	{
		
		
		@Test( groups={"smoke"}, dataProvider="abc", dataProviderClass=CreateLeadWrappers.class)
	
		public void createLead(String companyname, String firstname, String lastname)throws Exception
		
		{
			//LeaftapsWrapper wrapper=new LeaftapsWrapper();
			//login();
			//clickByLinkText("CRM/SFA");
			clickByLinkText("Create Lead");
			enterById("createLeadForm_companyName", companyname);
			enterById("createLeadForm_firstName",firstname);
			enterById("createLeadForm_lastName",lastname);
			clickByClassName("smallSubmit");
			
			
	
		}
		
		@DataProvider(name="abc")
		
		public Object[][] datautils()
		
		{
			Object[][] data= new Object[1][3];
			data[0][0]= "Google Inc";
			data[0][1]= "object";
			data[0][2]= "Class";
			
			// to  make the data to enter again increase the size of array [2][3], but it will invoke the browser again
			/*data[1][0]= "Google Inc";
			data[1][1]= "Object";
			data[1][2]= "Class";*/
			
			return data;
		}	
	}
