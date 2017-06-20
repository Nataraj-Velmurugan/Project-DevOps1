package testcasescontact;

import org.testng.annotations.Test;

import wrappers.LeafTapLogin;

public class CreateContact extends LeafTapLogin {

	@Test(groups = {"smoke"})
	public void  createContact() throws Exception {
				
		clickByLinkText("Contacts");
		clickByLinkText("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");
	}	
}