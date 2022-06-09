package SeleniumScripts.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNGTests {
	
	

	protected static WebDriver driver = null;
	


	@Test(priority=1)
	public void googleSearch() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.close();

	}
	
	@Test(priority=2)
	public void abcTest()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com");
	driver.close();
	}
	
}

