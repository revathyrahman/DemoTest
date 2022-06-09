package TestNGPack2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classFour {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BEfore Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@Test( timeOut = 2000 )
	public void classFourTestMethod()
	{
		System.out.println("Inside classFourTestMethod");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}

}
