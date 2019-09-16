package excel;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium\\src\\test\\java\\data\\TestData.xlsx");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for (int i=2;i<=reader.getRowCount("RegTestData");i++)
		{
			
			String first = reader.getCellData("RegTestData", "FirstName", i);
			String LastName = reader.getCellData("RegTestData", "LastName", i);
			String MobileNumber = reader.getCellData("RegTestData", "MobileNumber", i);
			String Password = reader.getCellData("RegTestData", "Password", i);
			
			Object ob[] = {first,LastName,MobileNumber,Password};
			
			myData.add(ob);
			
			
			
		}
		
		return myData;
	}
	
}
