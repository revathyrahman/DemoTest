package SeleniumScripts.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionDemo {

	protected static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://google.com");
			driver.findElement(By.id("search")).sendKeys("testing");			
			//driver.switchTo().Alert();
		}
					
		catch(NoSuchElementException e)
		{
			System.out.println("Search Element doesnot exist");
			e.printStackTrace();
			
		}
		
		try {
			
		}
		catch(Exception e)
		{
			
		}
	
		finally
		{
			driver.close();
		}
		
		System.out.println("After");
		System.out.println("After");
		Thread.sleep(3000);
		//throw new Exception();
	
		
		
		/*
		 * catch(Exception e) { System.out.println("Exception arised");
		 * //System.out.println(e.printStackTrace()); }
		 */
	}

}
