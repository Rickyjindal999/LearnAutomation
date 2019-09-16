package excel;

public class ExcelOperations {

	public static void main(String[] args) {
		
		
		
		
	Xls_Reader reader = new Xls_Reader("C:\\Users\\i B M\\eclipse-workspace\\com.learautomation.selenium\\src\\test\\java\\data\\TestData.xlsx");
	
	
	
	// To create new Sheet
	reader.addSheet("Home Page");
	
	
	
	if(reader.isSheetExist("Home Page"));  // If sheet exists it will print true 
	{
		
	}
	
	if(!reader.isSheetExist("Home Page"));  // If sheet doesn't exists it will print false 
	{
		reader.addSheet("Home Page");; // And create new sheet
	}
	
	//reader.addHyperLink(sheetName, screenShotColName, testCaseName, index, url, message)
	
	    int colCount = reader.getColumnCount("RegTestData");
	    System.out.println("Toatal Cols present in RegTestData :" + colCount);
	    reader.getCellRowNum("RegTestData", "FirstName", "Sahil");
	}

}
