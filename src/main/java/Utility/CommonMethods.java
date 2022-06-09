package Utility;

import org.openqa.selenium.WebElement;

import Base.Base;

public class CommonMethods extends Base {
	
	public CommonMethods()
	{
		
	}
	
	
	public void clickElement(WebElement ele, String str)
	{
		try
		{
			ele.click();
			System.out.println(str + "Element is clicked");
		}
		catch(Exception e)
		{
			System.err.println(str + "Element is not clicked");
			throw new Error();
		}
		
	}

	
	public void sendKeys(WebElement ele, String str)
	{
		try
		{
			ele.sendKeys(str);
			System.out.println("textfield is entered with value" + str);
		}
		catch(Exception e)
		{
			System.err.println("textfield is entered with value" + str);
			throw new Error();
		}
		
	}

}
