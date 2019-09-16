package datadrivenbymukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {

	
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
	public Object[][] passData()
	{
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Admin";
		data[0][1] = "Demo 1";
		
		data[1][0] = "Admin";
		data[1][1] = "Demo111";
		
		data[2][0] = "Admin";
		data[2][1] = "Demo123";
		
		
		return data;
		
	}
	
}
