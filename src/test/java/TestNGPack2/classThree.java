package TestNGPack2;

import org.testng.annotations.Test;

public class classThree {
	@Test
	public void classThreeTestMethod()
	{
		System.out.println("Inside classThreeTestMethod");
	}
	
	@Test(enabled=false)
	public void login()
	{System.out.println("Inside Login");
		
	}


}
