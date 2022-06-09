package SeleniumScripts.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {
	
		protected static WebDriver driver = null;
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			driver.manage().window().maximize();
			/*		
			driver.get("https://www.opera.com/download");
			
			driver.findElement(By.cssSelector("span[class='btn width-100 btn--primary cookie-consent__btn cookie-basic-consent__btn']")).click();
				
			*/
			driver.get("http://tutorialsninja.com/demo");
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			

	
		

	}

}
