package naveenTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	//1 // 4 // 7
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();   // Launch Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
	}
		//2
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{
		String Tilte =driver.getTitle();
		System.out.println(Tilte);

	}
	
	// 5
	@Test(priority=3,groups="Logo")
	public void googleLogotest()
	{
		boolean b= driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	
	// 8
	@Test(priority=2,groups="Link Test")
	public void mailLink()
	{
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	}
	
	
	@Test(priority=4,groups="Test")
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println("test 3");
	}
	
	// 3 // 6 //9
	@AfterMethod
	public void tearDownMthod()
	{
	driver.quit();	
	}
	
	
}
