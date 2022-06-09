package SeleniumScripts.Practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utility.CommonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testWebelements {
	
	public testWebelements()
	{
		
	}

	protected static WebDriver driver = null;

				//The above line of code calculates the number of radio buttons whose name is gender.
				//Now, we will handle the radio buttons by using the index of a particular radio button.
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		

	    List<WebElement> allElements = driver.findElements(By.tagName("ol"));
	    System.out.println(allElements);

	    for (WebElement element: allElements) {
	        System.out.println(element.getText());
	        element.click();          
	    }
			
		
		/*driver.findElement(By.id("alert1")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);		
			
		WebElement staticDropdown = driver.findElement(By.id("drop1"));	
		
	
	    Select dropdownOption = new Select(staticDropdown);
	    
	
        //Initialize the driver
        dropdownOption.selectByIndex(3);
        Thread.sleep(3000);
        
        dropdownOption.selectByValue("mno");
        Thread.sleep(3000);
        
        dropdownOption.selectByVisibleText("doc 1");
        //___________________
        
        System.out.println("the option is " + dropdownOption.getFirstSelectedOption().getText());
        
        WebElement multiDropdown = driver.findElement(By.id("multiselect1"));	    
	    Select multidropdownOption = new Select(multiDropdown);
        //Initialize the driver
        multidropdownOption.selectByValue("swiftx");
        
        System.out.println("the option is " + multidropdownOption.getFirstSelectedOption().getText());
        
        //____________________________________________________________________________
        
               
        driver.findElement(By.id("checkbox1")).click();
        
        List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@name='color']"));
        
        System.out.println("Number of Check boxes : "+ Integer.toString(AllCheckBoxes.size()));
             
        for(WebElement cb:AllCheckBoxes)
        {
        	
            cb.click();
        }
        System.out.println("All check boxes have been checked");
        
       	//----------------------------------------------------------
        
        
	List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='gender']"));

	//The above line of code calculates the number of radio buttons whose name is gender.
	//Now, we will handle the radio buttons by using the index of a particular radio button.
	
	
		  	
	//radioButtons.get(1).click();
	
	driver.findElement(By.id("table1"));
	
	System.out.println(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]//td[2]")).getText());
	
	List<WebElement>tableheadings = driver.findElements(By.xpath("//table[@id='table1']/thead"));
	
	String givenName="Praveen";
	
	List<WebElement>names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
	
	int rownum=0;
	
	for(int i=0; i<names.size();i++)
	
	{
		if(names.get(i).getText().equals("Praveen"))
		{
			rownum = i;
		}
		
		
	}
	*/
	driver.close();
	
	}  
	}



