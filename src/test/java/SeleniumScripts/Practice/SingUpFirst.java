package SeleniumScripts.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingUpFirst {

	public static WebDriver driver = null;

	@BeforeSuite

	public void driverInit() {
		// WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Calling BEfore Suite");

	}

	@BeforeTest

	public void loadURL() {
		driver.get("https://courses.letskodeit.com/register");
		System.out.println("Calling BEfore Test");

	}

	@BeforeClass

	public void invokeBrowser() {
		driver.manage().window().maximize();
		System.out.println("Calling Before Class");

	}

	@Test
	public void createAccount() {
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Revathy");
		System.out.println("Calling Test");

	}

	@Test
	public void login() {

	}

}
