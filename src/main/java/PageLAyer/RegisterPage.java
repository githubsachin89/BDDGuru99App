package PageLAyer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass
{
	@FindBy(name="firstName")
	private WebElement firstName;
	@FindBy(name="lastName")
	private WebElement lastName;
	@FindBy(name="phone")
	private WebElement phoneNo;
	@FindBy(name="userName")
	private WebElement emailId;
	
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void contactInfo(String firstname, String lastname, String phoneno, String emailid)
	{
		UtilsClass.sendKeys(firstName, firstname);
		UtilsClass.sendKeys(lastName, lastname);
		UtilsClass.sendKeys(phoneNo, phoneno);
		UtilsClass.sendKeys(emailId, emailid);
	}
}
