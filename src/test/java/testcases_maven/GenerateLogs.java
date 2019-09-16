package testcases_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class GenerateLogs {

	public static void main(String[] args) {
		
		Logger log= Logger.getLogger(GenerateLogs.class);
		
		WebDriver driver = new ChromeDriver();

		log.info("Launching Broswer");
		
		driver.get("https://www.google.co.in/");
		
		log.info("google url have been launched");
		
		String s= driver.getTitle();
	
		System.out.println(s);
		
		
		if(s.equals("Google"))
		{
			System.out.println("Correct title is google");
			log.info("Correct title is google  and test case is pass");
		}
		
		else
		{
			System.out.println("Correct title is not google");
			log.info("Correct title is not  google  and test case is failed");
		}
	}

}
