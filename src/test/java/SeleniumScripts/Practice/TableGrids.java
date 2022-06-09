package SeleniumScripts.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableGrids {
	
	protected static WebDriver driver = null;
@Test
public void GridDemo()
{

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://omayo.blogspot.com");
	
	driver.findElement(By.id("table1"));
	
	System.out.println(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]//td[2]")).getText());
	
	List<WebElement>tableheadings = driver.findElements(By.xpath("//table[@id='table1']/thead"));
	
	String givenName="Praveen";
	
	List<WebElement>names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
	int rownum=0;
	
	int colnum=0;
	
	
	for(int i=0; i<=names.size();i++)
	
	{
		if(names.get(i).getText().equals("Praveen"))
		{
			rownum = i;
			break;
			
		}
	}
	System.out.println(rownum);
	/*
	
	//Traverse thro the whole table
	List<WebElement> columns= driver.findElements(By.xpath("//table[@id='table1']//th"));
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
	
	int columnsCount  = columns.size();
	
	int rowsCount = rows.size();
	
	
	for(int r=1; r<=rowsCount;r++)
	{
		if(r==1)
		{
				for(int c=1;c<=columnsCount;c++)
				{
					String xPathText = "//table[@id='table1']//th["+ c +"]";
					
					String sheadingText = driver.findElement(By.xpath(xPathText)).getText();
					
					System.out.print(sheadingText + " ");
					
				}
		}
				else
				{
					for(int c=1;c<=columnsCount;c++)
						
					{
						String xPathText = "//table[@id='table1']//tr["+ (r-1) + "]//td["+ c +"]";
						
						String sDataText = driver.findElement(By.xpath(xPathText)).getText();
						
						System.out.print(sDataText + " ");
												
					}
					
		
				}
	System.out.println();
	} 
	
	
	
	    	driver.get("http://demo.guru99.com/test/table.html");
	    	//To locate table.
	    	WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
	    	
	    	//To locate rows of table. 
	    	List < WebElement > rows = mytable.findElements(By.tagName("tr"));
	    	
	    	//To calculate no of rows In table.  	    	
	    	int rows_count = rows.size();
	    	
	    	//Loop will execute till the last row of table.
	    	for (int row = 0; row < rows_count; row++) {
	    		
	    		//To locate columns(cells) of that specific row.
	    	    List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));
	    	    
	    	    //To calculate no of columns (cells). In that specific row.
	    	    int columns_count = Columns_row.size();
	    	    
	    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
	    	    
	    	    //Loop will execute till the last cell of that specific row.
	    	    for (int column = 0; column < columns_count; column++) {
	    	        // To retrieve text from that specific cell.
	    	    	
	    	        String celtext = Columns_row.get(column).getText();
	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	    	    }
	    	    System.out.println("-------------------------------------------------- ");
	    	}
	   	*/
	driver.quit();
	
		}
	}	
	
	


	
		

