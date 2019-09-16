package datadrivenbymukesh;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLoginExcel {

	
	WebDriver driver;
	@Test(dataProvider="wordpressData")
	public void loginWordPress(String username,String password) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_pass")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Invalid credentials");
		
		
		System.out.println("Page title verified");
	
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="wordpressData")
	public Object[][] passData() throws IOException
	{
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium\\TestDataMukesh\\InputData.xlsx");
		
		int rows = config.getRowCount(0);
		Object[][] data = new Object[rows][2];
		
		for (int i=0;i<rows;i++)
		{
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
			data[i][2] = config.getData(0, i, 2);
			
		}
		
		return data;
		
	}
	
}
