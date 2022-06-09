package SeleniumScripts.Practice;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestGoogleSearch {
	
	
	protected static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		

		//_______________________________________________________________
		driver.manage().window().maximize();
		
	//	Dimension d = new Dimension(300,650);
		//driver.manage().window().setSize(d);
		
		//driver.manage().window().maximize();

		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		if(str.equalsIgnoreCase("https://www.google.com/intl/en-GB/gmail/about/"))
			System.out.println("URL is right");
		else
			System.out.println("URL is Wrong");
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
	//	String spageSource = driver.getPageSource();
	//	System.out.println(spageSource);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		driver.navigate().back();
		
		boolean a = driver.findElement(By.name("q")).isDisplayed();
		boolean b = driver.findElement(By.name("q")).isEnabled();
		    
		System.out.println(a);
		System.out.println(b);
		
		//if(driver.findElement(By.id("but1")).isEnabled())
		//System.out.println("TestCAse failed, button 1 is enabled by default");
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).click();
		
		boolean c = driver.findElement(By.name("q")).isSelected();
		//System.out.println(c);
		
		driver.findElement(By.name("q")).sendKeys("Software Testing");
		
		//		_____________________________________________________________________________________
		// Get Attribute value 
		String strAttributeValue = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("Attribute value is" + strAttributeValue);
		
		//Using CSS Selector/Tagname and Attribute value
		driver.findElement(By.cssSelector("input[value='Google Search']")).click();
				
		//Button click using xpath 
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		//Button click using name 
	    //driver.findElement(By.name("btnK")).click();
		
		//______________________________________________________________________
						
		String actualTitle = driver.getTitle();
		
	    if(	actualTitle.equalsIgnoreCase("software testing - Google Search") )
	    	System.out.println("Titles match - Pass");
	    else
	    	 System.out.println("Titles do not match - Fail");
	    
	    System.out.println("Actual title is" + actualTitle);
		

		driver.findElement(By.linkText("Images")).click();
		String imagesTitle = driver.getTitle();
		
	    if(	actualTitle.equalsIgnoreCase("Google Images") )
	    	System.out.println("Titles match - Pass");
	    else
	    	 System.out.println("Titles do not match - Fail");
	    
	    System.out.println("Actual title is" + imagesTitle);
	    
	    //_________________________________________________________________________________________

	    List<WebElement> listOfElements= driver.findElements(By.tagName("a"));
	    
	   
	    	//100, 99 -> index-0
	    	
	    for(int i=0; i<listOfElements.size()-1; i++)
	    {
	    	System.out.println(listOfElements.get(i).getText());
	    }
	// __________________________________________________   
	    driver.navigate().back();
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("How Search works")).click();
	    String actualHowSearchworksTitle = driver.getTitle();
	    System.out.println(actualHowSearchworksTitle);
	    
	    Thread.sleep(3000);
	    
	    File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(srcScreenshot, new File(System.getProperty("user.dir") + "\\Screenshots\\screenshot.png"));
	 
	    
	 
	    driver.quit();
	  //driver.close();
		
	}

}

