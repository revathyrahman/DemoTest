package TestNGPack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {
	

	@BeforeMethod
	public void setUp()
	{
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@Test(groups={"Smoke"})
	public void classOneTestMethod()
	{
		System.out.println("Inside classOneTestMethod");
	}

	@Test
	
	public void classOneTestMethod1() {
		System.out.println("Inside classOneTestMethod1");
	}
}
