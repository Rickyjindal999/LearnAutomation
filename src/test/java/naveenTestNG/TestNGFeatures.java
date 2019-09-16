package naveenTestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	// There is no point when login test case not working to execute Home page test.. Other will be skipped force fully  

	@Test
	public void loginTest()
	{
		System.out.println("Login TEst");
		
		int i = 9/0; // Failed
		//int i = 9/0; Need to comment to pass the test case
	}
	
	
	
	@Test(dependsOnMethods="loginTest" )
	public void HomePageTest()
	{
		System.out.println("HomePage TEst");
	}
	
	@Test(dependsOnMethods="loginTest" )
	public void SearchPageTest()
	{
		System.out.println("Search TEst");
	}
	
	
	@Test(dependsOnMethods="loginTest" )
	public void RegPageTest()
	{
		System.out.println("RegPage TEst");
	}
	
	
}
