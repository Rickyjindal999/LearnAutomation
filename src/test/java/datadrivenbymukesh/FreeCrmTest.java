package datadrivenbymukesh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FreeCrmTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	
	@DataProvider
	public Iterator<Object[]> getData()
	{
		ArrayList<Object[]> testdata=TestUtil.getDataFromExcel();
		return testdata.iterator();
	}
	
	@Test(dataProvider="getData")
	public void crmSignUp(String FirstName,String LastName,String Email,String ConfirmEmail,String UserName,String Password,String ConfirmPassword)
	{
		driver.findElement(By.xpath("//font[@color='red']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(ConfirmEmail);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(ConfirmPassword);
		
		driver.findElement(By.xpath("//input[@value='false']")).click();
		
		driver.findElement(By.xpath("//div[@class='myButton']")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
