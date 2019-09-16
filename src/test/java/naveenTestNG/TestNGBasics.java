package naveenTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	

	/*@BeforeSuite-----set up system property for google  -- 1
		@BeforeTest---- Lauching chrome Broswer			  -- 2
		@BeforeClass-----Login to app						-- 3
		
		@BeforeMethod----Enter URL
		@Test---- Google logo test 			-- For Before method and after method pair will be create 
		@AfterMethod---- Logout to app
		
		@BeforeMethod----Enter URL
		@Test ----Google title test       -- For Before method and after method pair will be create 
		@AfterMethod---- Logout to app
		
		@BeforeMethod----Enter URL
		@Test ---- search Test              -- For Before method and after method pair will be create 
		@AfterMethod---- Logout to app
		
		@AfterClass  ---- Close Browser                -- 4 
		@AfterTest--- Delete Cookies                   -- 5
	*/
	
	
	
	// Pre-conditions annotations -- starting with @Before
	@BeforeSuite    // 1
	public void setUp()
	{
		System.out.println("@BeforeSuite-----set up system property for google");
	}
	
	@BeforeTest    //2    
	public void launchBrowser()
	{
		System.out.println("@BeforeTest---- Lauching chrome Broswer");
	}
	
	@BeforeClass    //3
	public void login()
	{
		System.out.println("@BeforeClass-----Login to app");
	}

	
	
	@BeforeMethod    //4
	public void enterURL()
	{
		System.out.println("@BeforeMethod----Enter URL");
	}
	
	
	// test case -- starting with @Test
	@Test(priority=3)    //5
	public void googleTitle()
	{
		System.out.println("@Test ----Google title test");
	}
	
	
	@Test(priority=1)   
	public void searchTest()
	{
		System.out.println("@Test ---- search Test  ");
	}
	
	@Test(priority=2)  
	public void googleLogo()
	{
		System.out.println("@Test---- Google logo test ");
	}
	
	// Post-conditions annotations -- starting with @After
	@AfterMethod   //6
	public void logout()
	{
		System.out.println("@AfterMethod---- Logout to app");
	}
	
	@AfterClass   // 7
	public void closeBrowser()
	{
		System.out.println("@AfterClass  ---- Close Browser");
	}
	
	@AfterTest  // 8
	public void deleteAllCokkie()
	{
		System.out.println("@AfterTest--- Delete Cookies");
	}
	
/*	@AfterSuite  //9 Naveen said that he will discuss it later
	public void generateReport()
	{
		System.out.println("Generate Test Report");
	}
	*/
	
	
	
	
	
	
	
	
	
	
}
