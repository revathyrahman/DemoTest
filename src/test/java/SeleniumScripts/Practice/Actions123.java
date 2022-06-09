package SeleniumScripts.Practice;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions123 {
	protected static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scrollBy(0,2000)"); Thread.sleep(5000);
		 */

		WebElement userid = driver.findElement(By.name("userid"));
		js.executeScript("arguments[0].scrollIntoView();", userid);
		Thread.sleep(5000);
		/*
		 * driver.get("http://omayo.blogspot.com");
		 * 
		 * Actions action = new Actions(driver);
		 * 
		 * WebElement ele = driver.findElement(By.id("blogsmenu"));
		 * 
		 * action.moveToElement(ele).perform();
		 * 
		 * 
		 * WebElement ele1 =
		 * driver.findElement(By.xpath("//span[text()='Selenium143']"));
		 * action.moveToElement(ele1).click().perform();
		 * 
		 * 
		 * 
		 * Actions action = new Actions(driver);
		 * driver.get("http://omayo.blogspot.com/p/page3.html"); WebElement slider =
		 * driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		 * Thread.sleep(3000); action.dragAndDropBy(slider,100,0).perform();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * action.dragAndDropBy(slider,-200,0 ).perform();
		 * 
		 */
		Actions action = new Actions(driver);
		WebElement ele3 = driver.findElement(By.xpath("//div[@class='widget-content']/img"));

		action.contextClick(ele3).build().perform();
		Robot robot = new Robot();
//robot.keyPress(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		/*
		 * 
		 * 
		 * Actions action = new Actions(driver);
		 * driver.get("http://omayo.blogspot.com"); WebElement ele4 =
		 * driver.findElement(By.linkText("compendiumdev"));
		 * action.keyDown(Keys.CONTROL).click(ele4).keyUp(Keys.CONTROL).build().perform(
		 * ); Thread.sleep(5000);
		 * 
		 * 
		 * Actions action = new Actions(driver);
		 * driver.get("http://omayo.blogspot.com"); WebElement userid=
		 * driver.findElement(By.name("userid")); WebElement pwd =
		 * driver.findElement(By.name("pswrd")); userid.sendKeys("Revathy");
		 * action.sendKeys(Keys.TAB).perform(); pwd.sendKeys("Password123!");
		 * action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform(); Thread.sleep(2000);
		 */

		driver.quit();

	}

}
