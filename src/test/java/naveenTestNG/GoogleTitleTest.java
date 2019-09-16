package naveenTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	
	
WebDriver driver;
	
	
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
		
	@Test()
	public void googleTitleTest()
	{
		String Tilte =driver.getTitle();
		System.out.println(Tilte);
		
		Assert.assertEquals(Tilte, "Google","Title is not matched");
		
	}
	
	
	@Test()
	public void googleLogotest()
	{
		boolean b= driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	

	@AfterMethod
	public void tearDownMthod()
	{
	driver.quit();	
	}

}
