package StepDefinations;

import BaseLayer.BaseClass;
import PageLAyer.RegisterPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class RegisterPageStepDef extends BaseClass
{
		
	private static RegisterPage regPage;
	@Given("user is on guru99 register page")
	public void user_is_on_guru99_register_page() {
		BaseClass.Initialization();
		regPage=new RegisterPage();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
	}

	@Then("user enter contact info as firstname lastname phone and emailId")
	public void user_enter_contact_info_as_firstname_lastname_phone_and_email_id() {
		
		regPage.contactInfo("Sachin", "Gaikwad", "1234567890", "sachG@gmail.com"); 
	}
	@Then("user enter address and city and state and postal code and country")
	public void user_enter_address_and_city_and_state_and_postal_code_and_country() {
	   regPage.mailingInfo("pune", "pune", "Maharahstra", "123546", "INDIA");
	}

}
