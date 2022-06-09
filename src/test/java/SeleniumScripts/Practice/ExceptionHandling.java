package SeleniumScripts.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling {
	protected static WebDriver driver;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stubint a=50/0;//ArithmeticException
		/*
		 * try { String s=null; System.out.println(s.length());//NullPointerException
		 * 
		 * int a[]=new int[5]; a[10]=50; //ArrayIndexOutOfBoundsException
		 * 
		 * String str="abc"; int i=Integer.parseInt(str);//NumberFormatException
		 * System.out.println(i);
		 * 
		 * String a1="abc"; int b= Integer.parseInt(a1); System.out.println(b);
		 */

		try {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/");

			// driver.switchTo().alert().accept();

			driver.findElement(By.xpath("//button[text()='abc']")).click();

		}

		catch (NoSuchElementException e) {
			System.out.println("Handling Exception, going to finally to close browser");
		} finally {
			// The finally block always executes.
			driver.close();
		}
		System.out.println("After");
	}

}
