package datadrivenbymukesh;

import java.util.ArrayList;

import exceldec11.Xls_Reader;

public class TestUtil {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\i B M\\Desktop\\Excel\\TestData.xlsx");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for (int i=2;i<=reader.getRowCount("RegTestData");i++)
		{
			
			String FirstName = reader.getCellData("RegTestData", "FirstName", i);
			String LastName = reader.getCellData("RegTestData", "LastName", i);
			String Email = reader.getCellData("RegTestData", "Email", i);
			String ConfirmEmail = reader.getCellData("RegTestData", "ConfirmEmail", i);
			String UserName = reader.getCellData("RegTestData", "UserName", i);
			String Password = reader.getCellData("RegTestData", "Password", i);
			String ConfirmPassword = reader.getCellData("RegTestData", "ConfirmPassword", i);

			Object ob[] = {FirstName,LastName,Email,ConfirmEmail,UserName,Password,ConfirmPassword};
			
			myData.add(ob);
		
		}
		
		return myData;
	}
	
}
