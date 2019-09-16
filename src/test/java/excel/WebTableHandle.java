package excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		//*[@id="customers"]/tbody/tr[3]/td[1]
	
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//*[@id="customers"]/tbody/tr[5]/td[1]
		
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		
		
		String brforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterpath = "]/td[1]";
				
		
		String brforeXpath_Company = "//*[@id=\"customers\"]/tbody/tr[";
		String afterpath_company = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers'])//tr"));
		int rowCount = (rows.size()-1);
		System.out.println(rowCount);
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.l"
				+ "earautomation.selenium\\src\\test\\java\\data\\TestData.xlsx");
		reader.addSheet("TableData");
		
		reader.addColumn("TableData", "CompanyName");
		reader.addColumn("TableData", "contactName");
		
		
		
		for (int i=2;i<=rowCount;i++)
		{
			String actualXpath = brforeXpath +i+afterpath;
			String companyName = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(companyName);
			
			reader.setCellData("TableData", "Company", i, companyName);
			
			
			String actualXpath1 = brforeXpath_Company +i+afterpath_company;
			String contact = driver.findElement(By.xpath(actualXpath1)).getText();
			System.out.println(contact);
			reader.addColumn("TableData", "contactName");
			reader.setCellData("TableData", "contact", i, contact);
			
		}
		
		
		
		
		
	
		
	}

}
