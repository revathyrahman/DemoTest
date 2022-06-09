package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Base;
import Utility.CommonMethods;

public class SignUp extends Base{
	
	public SignUp()
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	@FindBy(id="name")
	private WebElement FirstName;
	
	@FindBy(id="lname")
	private WebElement LastName;
	
	
	public void createAccount()
	{
		new CommonMethods().clickElement(FirstName, "FirstName");
		
		new CommonMethods().sendKeys(FirstName, "FirstName");
		
	}
	
	
	
	

}
