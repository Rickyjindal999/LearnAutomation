package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriverTest {

	public static void main(String[] args) {
		
		
		// To get the data from excel
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium\\src\\test\\java\\data\\TestData.xlsx");
		String firstname =reader.getCellData("RegTestData", "FirstName", 2);
		System.out.println(firstname);
		
		String LastName =reader.getCellData("RegTestData", "LastName", 2);
		System.out.println(LastName);
		
		String MobileNumber =reader.getCellData("RegTestData", "MobileNumber", 2);
		System.out.println(MobileNumber);
		
		String Password =reader.getCellData("RegTestData", "Password", 2);
		System.out.println(Password);
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.name("reg_email__")).sendKeys(MobileNumber);
		driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
		
		
		
		
		
		
	}

}
