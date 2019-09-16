package parameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	

public class ParameterTest1 {
	
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailid","password"})
	public void faceBook(String url,String emailid,String password)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		driver.findElement(By.id("email")).sendKeys(emailid);
		driver.findElement(By.className("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']"));
		
	}

}
