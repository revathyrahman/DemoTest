package SeleniumScripts.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAssertions {
	
	@BeforeMethod
	public void browserInvoke()
	{
		System.out.println("Invoke browser and load URL");
	}
	
	@AfterMethod
	public void browserClose()
	{
		System.out.println("Closing browser");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BEfore class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AFter class");
	}
	@Test 
	public void register()
	{
		System.out.println("Testing Registration");
	}

	@Test
	public void login()
	{
		System.out.println("Testing Login");
	}
	
}
