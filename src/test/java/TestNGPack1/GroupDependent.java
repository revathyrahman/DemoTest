package TestNGPack1;

import org.testng.annotations.Test;

public class GroupDependent {
	
	@Test(groups={"Smoke"})
	public void smokeTest1()
	{
		System.out.println("Test1 in Smoke Test Group");
	}

	@Test(groups={"Smoke"})
	public void smokeTest2()
	{
		//int a=10/0;
		System.out.println("Test2 in Smoke TEst Group");
	}
	
	@Test(groups={"Regression"})
	public void RegressionTest1()
	{
		System.out.println("Test1 in Regression Test Group");
	}
	@Test(groups={"Regression"})
	public void RegressionTest2()
	{
		System.out.println("Test1 in Regression Test Group");

	}	
	  @Test (dependsOnGroups = {"Smoke"})	  
	  public void dependsOnSmoke()
	  {
		  System.out.println("Won't execute unless Smoke Test is executed");
	  }

}
