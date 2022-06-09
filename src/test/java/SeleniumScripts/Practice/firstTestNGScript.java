package SeleniumScripts.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstTestNGScript {
	
	protected static WebDriver driver = null;
	
	@Test(priority=2)
	public void googlesearch() throws InterruptedException	
	{
		  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		  driver.get("http://google.com");
		  
		  Thread.sleep(2000);
		  Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		
		  driver.findElement(By.name("q")).click();
		  driver.findElement(By.name("q")).sendKeys("Software Testing");
		  driver.findElement(By.name("q")).click();
		  driver.findElement(By.name("btnK")).click();
		   
		
		/*int age = 10;
		if(age<18)
		{
			throw new SkipException("Age below 18 is not accepted");
			
		}
		Assert.fail("Test Case Failed due to age limit");
		*/
	}
	
	@Test(priority=1)
	
	public void omayoTest()
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		  
		
	}
	

}
