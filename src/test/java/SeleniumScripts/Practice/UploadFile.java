package SeleniumScripts.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
protected static WebDriver driver = null;

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		  driver.navigate().to("http://demo.guru99.com/selenium/upload/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		     WebElement ele = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		     ele.click();
		     
		     Thread.sleep(2000);
		     
		  //put path to your image in a clipboard
		     StringSelection ss = new StringSelection("D:\\Revathy\\TechTraining\\Automation\\Upload\\File.docx");
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		  //open upload window
		     

		     //imitate mouse events like ENTER, CTRL+C, CTRL+V
		     Robot robot = new Robot();
		     robot.delay(250);
				/*
				 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
				 */
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.delay(90);
		     robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
