package SeleniumScripts.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MultipleWindow {
	
	protected static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		
		String firstWindow = driver.getWindowHandle();
		
		System.out.println(firstWindow);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windows =driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
			 String window = itr.next();
			 driver.switchTo().window(window);
			 System.out.println(window);
			 
			 if(driver.getTitle().equals("Basic Web Page Title"))
			 {
					System.out.println(window);
				 driver.close();
				 
			 }
		}
		
		 driver.switchTo().window(firstWindow);
		
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		