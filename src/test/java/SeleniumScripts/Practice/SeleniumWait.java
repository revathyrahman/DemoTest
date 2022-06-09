package SeleniumScripts.Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWait {

	
		protected static WebDriver driver;
		
		
		

		public static void main(String[] args)  {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://omayo.blogspot.com");
			WebDriverWait waitforElement = new WebDriverWait(driver,30);
			
			
			driver.findElement(By.className("dropbtn")).click();
		//	driver.findElement(By.xpath("//a[text()='Gmail']")).click();
			
			
								
				//waitforElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Gmail']")));
				waitforElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Gmail']")));				
				driver.findElement(By.xpath("//a[text()='Gmail']")).click();
			
			
			

	}

}
