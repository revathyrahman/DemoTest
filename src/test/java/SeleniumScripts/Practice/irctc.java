package SeleniumScripts.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctc {

	protected static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		
	//	driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.close();
		
		
			

	}

}
