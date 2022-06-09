package SeleniumScripts.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicAdvanced {

	protected static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		//The above line of code calculates the number of radio buttons whose name is gender.
		//Now, we will handle the radio buttons by using the index of a particular radio button.


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		/*driver.get("http://makemytrip.com");

		driver.findElement(By.xpath("//*[text()='From']")).click();
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		
		driver.findElement(By.id("fromCity")).click();
		
		driver.findElement(By.xpath("//input[@type='text']"));
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		
		
		WebElement b= driver.findElement(By.xpath("//span[text()='From']"));
		b.click();
	
		
		//driver.findElement(By.id("fromCity")).sendKeys("mum");
	
		//driver.findElement(By.id("fromCity")).sendKeys("mum");
		
		
		//driver.findElement(By.id("fromCity")).;
		driver.findElement(By.xpath("//*[@aria-controls='react-autowhatever-1'][@placeholder='From']")).sendKeys("mum");
		
		//driver.findElement(By.xpath(".sendKeys("mum");
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-autocomplete='list']")).sendKeys(Keys.DOWN);
		
		
		
		
		//driver.findElement(By.id("From")).click();
		//driver.findElement(By.xpath("[@placeholder='From']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("[@placeholder='From']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("[@placeholder='From']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("[@placeholder='From']")).sendKeys(Keys.DOWN);
		
	/*	int i=0;
		
		while(i<4)
		{
			driver.findElement(By.xpath("[@placeholder='From']")).sendKeys(Keys.DOWN);
			i++;
		}
			
	*/
		driver.get("http://omayo.blogspot.com");
		List <WebElement> listOfItems = driver.findElements(By.tagName("ul/"));
		int count = listOfItems.size();
		for(int i=0;i<count-1; i++)
		{
		System.out.println(listOfItems.get(i).getText());
		}
			

	}

}
