package datadrivenbymukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		WebElement ele =driver.findElement(By.xpath("//button[@onclick='myFunction()'"));
		
		Thread.sleep(12000);
		ele.sendKeys(Keys.SPACE);

	}

}
