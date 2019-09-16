package myTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {

	SoftAssert soft = new SoftAssert();
	
	@Test
	public void test1()
	{
		
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		
		System.out.println("Enter username");
		System.out.println("enter Password");
		System.out.println("click on sign in button");
		
		
		Assert.assertEquals(true, true);
		System.out.println("validate home page");
		
		soft.assertEquals(true, false, "Home page title is missing"); // soft Assertion 
		
		
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		
		soft.assertEquals(true, false,"Not able to create a deal"); // soft Assertion 
		
		System.out.println("go to contacts page");
		System.out.println("create a contacts");
		
		soft.assertEquals(true, false,"not able to create a contact"); // soft Assertion 
		
		// Once all soft assertion is done we can use softassert
		
		soft.assertAll();  // can call assertAll() method and we can check how many test cases are failed
		
		// If we won't use softassertall() we won't get actual result	
	}
	
	@Test
	public void test2()
	{
		System.out.println("logout");
		soft.assertEquals(true, false);
		soft.assertAll();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		soft.assertAll();
	}
	
}
