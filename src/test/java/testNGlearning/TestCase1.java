package testNGlearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void createDBconnection()
	{
		System.out.println("Creating DB Connection ");
	}
	
	@AfterTest
	public void closingDBconnection()
	{
		System.out.println("Closing DB Connection ");
	}
	
	@BeforeMethod
	public void launchBroswer()
	{
		System.out.println("launching Broswer");
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing Browser");
	}
	
	@Test(priority=2)
	public void doLogin()
	{
		System.out.println("Execueting login Test");
	}
	
	@Test(priority=1)
	public void doUserReg()
	{
		System.out.println("Execueting User Reg test");
	}
	
}
