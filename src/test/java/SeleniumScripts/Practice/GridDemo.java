package SeleniumScripts.Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {

	@Test
	public void Grid() throws MalformedURLException
	{ 	
		
		DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setPlatform(Platform.WINDOWS);
	    dc.setBrowserName("chrome");	
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4444/wd/hub"),dc);
		
		driver.get("http://omayo.blogspot.com");
		driver.findElement(By.name("q")).click();
		
		driver.findElement(By.name("q")).sendKeys("test");
		driver.findElement(By.className("gsc-search-button")).click();
		
		driver.close();

		
	}
	
	@Test
	public void Grid1() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4444/wd/hub"),dc);
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).click();
		
		driver.findElement(By.name("q")).sendKeys("test");
		//driver.findElement(By.className("gsc-search-button")).click();
		
		driver.close();

		
	}

}
