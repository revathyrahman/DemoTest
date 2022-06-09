package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;
import Common.CommonClassElements;

import Utility.Browser;
import Utility.CommonMethods;

public class testElements extends Base{

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
	
		
		new Browser().InvokeBrowser("Chrome");
		
		new Browser().setURL("http://omayo.blogspot.com");
		
		
		WebElement radioButton = driver.findElement(By.id("radio2"));		
		
		new CommonMethods().clickElement(radioButton, "FeMale Radio Button");
		
		new CommonClassElements().selectGenderRadio("Male");
		
		new Browser().closeApp();
		
		
		
	}

}
