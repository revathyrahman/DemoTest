package TestNGPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNGDemo1 {
	
		
		protected static WebDriver driver = null;
		
		@Test
		public void googleSearch() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("http://google.com");
			

			Boolean trueorfalse1 =driver.findElement(By.name("q")).isDisplayed();
			System.out.println(trueorfalse1);
			
			System.out.println("Printing assert");
			Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
			driver.findElement(By.name("q")).sendKeys("Software Testing");
			Thread.sleep(2000);
			driver.findElement(By.name("q")).click();

			driver.findElement(By.name("btnK")).click();
			Thread.sleep(5000);
						
			String actualText= driver.findElement(By.xpath("//h3[text()='What is Software Testing and How Does it Work? - IBM']")).getText();
			//Assert.assertEquals(actualText,"What is Software Testing and How Does it Work?");
			
			driver.close();
			

}
	}
	
