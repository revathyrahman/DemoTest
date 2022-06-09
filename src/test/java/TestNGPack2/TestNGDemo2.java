package TestNGPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo2 {
	
		
		protected static WebDriver driver = null;
		
		@Test
		public void googleSearch() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com");
			
			//driver.get("http://omayo.blogspot.com");
			
			Actions action = new Actions(driver);		
			
			WebElement ele = driver.findElement(By.id("blogsmenu"));
			
			action.moveToElement(ele).perform();
			
			
			WebElement ele1 = driver.findElement(By.xpath("//span[text()='Selenium143']"));
			action.moveToElement(ele1).click().perform();	 
			
			Thread.sleep(3000);
			
			driver.close();

}
	}
	
