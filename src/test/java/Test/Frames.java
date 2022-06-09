package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	protected static WebDriver driver = null;

	//The above line of code calculates the number of radio buttons whose name is gender.
	//Now, we will handle the radio buttons by using the index of a particular radio button.

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Revathy\\TechTraining\\Automation\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	
	//driver = new ChromeDriver();		
	driver.manage().window().maximize();
	
	
	
	/*
	 * 
	 * WebElement ele= driver.findElement(By.Xpath("");
	driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//body/a/img")).click();

	
	System.out.println("Insidde Frame");
	
	driver.switchTo().parentFrame();
	
	//driver.switchTo().defaultContent();
	System.out.println("Inside Pparent Frame");
	
		
	Thread.sleep(5000);
	
	

	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame("a077aa5e");
	
	driver.findElement(By.xpath("html/body/a/img")).click();

	Thread.sleep(3000);
	

	System.out.println("inside Frame");
	System.out.println("*********We are done***************");

	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	System.out.println("Back to Parent Window");

	driver.findElement(By.linkText("LIVE TESTING")).click();

	System.out.println("Parent Window--Live Testing Link Clicked"); 


	*/
	driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
	
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	
	System.out.println(frames.size());
	
	
	driver.get("http://the-internet.herokuapp.com/iframe");
	
	driver.switchTo().frame(0);
	
	System.out.println("inside Frame");
	System.out.println("*********We are done***************");
	
	
	driver.switchTo().defaultContent();
	System.out.println("Back to Parent Window");
	
	
	
	driver.close();
	
	
	

}
}
