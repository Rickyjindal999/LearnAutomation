package datadrivenbymukesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	
	public ExcelDataConfig(String excelPath) throws IOException
	{
		File src = new File(excelPath);
		
		FileInputStream fis = new FileInputStream(src);
		
		
		
		wb = new XSSFWorkbook(fis);
	}
	
	public String getData(int SheetNumber,int row,int column)
	{
		 wb.getSheetAt(SheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	
	public int getRowCount(int sheetIndex)
	{
				
		int row =wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row +1;
		return row;
	}
	
}
