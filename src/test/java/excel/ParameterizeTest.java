package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		// To get the data form excel
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium\\src\\test\\java\\data\\TestData.xlsx");
		int rowCount = reader.getRowCount("RegTestData");   // This method will return the row count of the particular sheet
		
		reader.addColumn("RegTestData", "status");
		
		
		for(int rowNum = 2;rowNum<=rowCount;rowNum++)
		{
			
			
			String first= reader.getCellData("RegTestData", "FirstName", rowNum);
			System.out.println(first);
			
			
			String LastName =reader.getCellData("RegTestData", "LastName", rowNum);
			System.out.println(LastName);
			
			String MobileNumber =reader.getCellData("RegTestData", "MobileNumber", rowNum);
			System.out.println(MobileNumber);
			
			String Password =reader.getCellData("RegTestData", "Password", rowNum);
			System.out.println(Password);
			
			
			
			// Enter the data
			
		
			driver.findElement(By.name("firstname")).sendKeys(first);
			
			driver.findElement(By.name("firstname")).clear();
			
			driver.findElement(By.name("lastname")).sendKeys(LastName);
			
			driver.findElement(By.name("lastname")).clear();
			driver.findElement(By.name("reg_email__")).sendKeys(MobileNumber);
			
			driver.findElement(By.name("reg_email__")).clear();
			driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
			driver.findElement(By.name("reg_passwd__")).clear();
			
			
			
			reader.setCellData("RegTestData", "status", rowNum, "pass");// Write the data into cell
			
		}
		
	}

}
