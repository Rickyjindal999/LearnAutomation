package practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapLogin {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//URL
		driver.get("https://www.google.co.in/");
		
		// Navigate to
		driver.navigate().to("https://www.naukri.com/");
		
		
		//Back button
		driver.navigate().back();
		
		// Take screenshot and store as a file format
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Now copy the screenshot to desired loaction
		FileUtils.copyFile(src, new File ("Desktop"));
		
}

}
