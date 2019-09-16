package datadrivenbymukesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RealExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("C:\\Users\\i B M\\Desktop\\Excel\\Login Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb =  new XSSFWorkbook(fis);
		
		XSSFSheet sheet =wb.getSheetAt(0);
		
		//To get the number of rows 
		int row =sheet.getLastRowNum();
			
		System.out.println("Total rows is " + row);	
		
		for(int i=0;i<row;i++)
		{
			String data =sheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from row " + data);
		}
		
		
		wb.close();
	
	}

}
