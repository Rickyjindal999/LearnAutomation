package datadriverbynaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import exceldec11.Xls_Reader;

public class DatadriverTest {

	public static void main(String[] args) {
		
		Xls_Reader xl = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.lea"
				+ "rautomation.selenium\\src\\test\\java\\Data1\\TestData.xlsx");
		
		
		String FirstName =xl.getCellData("RegTestData", "FirstName", 2);
		System.out.println(FirstName);
		
		//	xl.getCellData(sheetName, colNum, rowNum)
		
		String LastName =xl.getCellData("RegTestData", "LastName", 2);
		System.out.println(LastName);
		
		String MobileNumber =xl.getCellData("RegTestData", "MobileNumber", 2);
		System.out.println(MobileNumber);
		
		String Password =xl.getCellData("RegTestData", "Password", 2);
		System.out.println(Password);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.name("reg_email__")).sendKeys(MobileNumber);
		driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		

	}

}
