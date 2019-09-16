package excel;

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


public class FacebookTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.facebook.com/");
		
	}
	
	
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData=TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	
	
	@Test(dataProvider="getTestData")
	public void facebook(String first,String LastName,String MobileNumber,String Password)
	{
		driver.findElement(By.name("firstname")).sendKeys("first");
		
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(MobileNumber);
		
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
		driver.findElement(By.name("reg_passwd__")).clear();
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
