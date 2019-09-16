package testcases_maven;

import java.io.*;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestProperties {
	
	public static  WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		// we can manage all the locator values in .properties file
		// We can manage all the global values in .properties fie
		
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium"
		+ "\\src\\test\\resources\\properties\\Config.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
			String s = prop.getProperty("browser");
			
			if(s.equals("chorme"))
			{
				driver = new ChromeDriver();
			}
			else if (s.equals("FF"))
			{
				driver = new FirefoxDriver();
			}
		
			else 
			{
				System.out.println("None of the browser is found");
			}
	
			driver.get(prop.getProperty("url"));
			
			
	
	
	
	
	
	
	
	
	}

}


