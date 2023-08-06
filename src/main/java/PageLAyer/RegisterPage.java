package PageLAyer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass {
	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(name = "phone")
	private WebElement phoneNo;

	@FindBy(name = "userName")
	private WebElement emailId;

	@FindBy(name = "address1")
	private WebElement Address;

	@FindBy(name = "city")
	private WebElement City;

	@FindBy(name = "state")
	private WebElement State;

	@FindBy(name = "postalCode")
	private WebElement Postalcode;

	@FindBy(name = "country")
	private WebElement Country;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void contactInfo(String firstname, String lastname, String phoneno, String emailid) {
		UtilsClass.sendKeys(firstName, firstname);
		UtilsClass.sendKeys(lastName, lastname);
		UtilsClass.sendKeys(phoneNo, phoneno);
		UtilsClass.sendKeys(emailId, emailid);
	}

	public void mailingInfo(String address, String city, String state, String postal,String country) {
		UtilsClass.sendKeys(Address, address);
		UtilsClass.sendKeys(City, city);
		UtilsClass.sendKeys(State, state);
		UtilsClass.sendKeys(Postalcode, postal);
		UtilsClass.selectvisible(Country, country);
		
		
	}
}
