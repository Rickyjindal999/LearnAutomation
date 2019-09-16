package testNGListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	
	public static WebDriver driver;
	
	
	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		
		
	}
	
	public void failed() throws IOException
	{
		File srcFile= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium\\Screenshot"
			+	"Failshot_"+this.getClass().getName()+"_"+".jpg"));
	}
	
	
	
	
}
