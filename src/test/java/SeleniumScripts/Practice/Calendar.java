package SeleniumScripts.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	protected static WebDriver driver = null;

	/*
	 * public static void main(String[] args) throws InterruptedException { // TODO
	 * Auto-generated method stub
	 */
	@Test
	public void CalendarTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		// Thread.sleep(5000);

		driver.findElement(By.id("travel_date")).click();

		// Thread.sleep(5000);

		while (!(driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText().contains("December"))) {
			driver.findElement(By.xpath("//th[@class = 'next']")).click();

		}
		List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));
		for (int i = 0; i < days.size(); i++) {
			if (days.get(i).getText().equalsIgnoreCase("22")) {
				days.get(i).click();
			}
		}

		/*
		 * while(!(driver.findElement(By.xpath("//th[@class='datepicker-switch']")).
		 * getText().contains("December"))) {
		 * driver.findElement(By.xpath("//th[@class='next'][1]")).click(); }
		 * 
		 * List<WebElement> days = driver.findElements(By.className("Day"));
		 * 
		 * for(int i=0; i<days.size();i++) {
		 * if(days.get(i).getText().equalsIgnoreCase("15")) { days.get(i).click();
		 * System.out.println(get(i).text); break;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }
		 */
		Thread.sleep(3000);
		driver.close();
	}

}
