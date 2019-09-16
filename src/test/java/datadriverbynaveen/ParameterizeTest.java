package datadriverbynaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import exceldec11.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		Xls_Reader xl1 = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.lea"
				+ "rautomation.selenium\\src\\test\\java\\Data1\\TestData.xlsx");
		
		int rowcount =xl1.getRowCount("RegTestData");
		
		
		
		
		xl1.addColumn("RegTestData", "Status");
		
		
		
		
		//Parameterization:-
		// eg :- xl1.getCellData(sheetName, colNum, rowNum)
		for (int rowNum = 2;rowNum<=rowcount;rowNum++)
		{
		String FirstName =	xl1.getCellData("RegTestData", "FirstName", rowNum);
		System.out.println(FirstName);
		
		
		String LastName =xl1.getCellData("RegTestData", "LastName", rowNum);
		System.out.println(LastName);
		
		String MobileNumber =xl1.getCellData("RegTestData", "MobileNumber", rowNum);
		System.out.println(MobileNumber);
		
		String Password =xl1.getCellData("RegTestData", "Password", rowNum);
		System.out.println(Password);
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(MobileNumber);
		driver.findElement(By.name("reg_passwd__")).clear();

		
		
		driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		xl1.setCellData("RegTestData", "status", rowNum, "pass");
		
		}
		
	}

}
