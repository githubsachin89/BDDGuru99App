package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilsClass 
{
	public static void sendKeys(WebElement wb, String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}

	public static void click(WebElement wb)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static void selectvisible(WebElement wb, String value) {
		
		Select sel =new Select(wb);
		sel.selectByVisibleText(value);
		
		
		
		
	}
	
	
	
}
