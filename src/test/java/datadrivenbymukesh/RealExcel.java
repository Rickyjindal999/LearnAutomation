package datadrivenbymukesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RealExcel {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("C:\\Users\\i B M\\Desktop\\Excel\\Login Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb =  new XSSFWorkbook(fis);
		
		XSSFSheet sheet =wb.getSheetAt(0);
		
		String data = sheet.getRow(2).getCell(1).getStringCellValue();
		
		System.out.println("Data From Excel is " + data);
	
		// We Should always close the resource when there is no use.To save from memory leakage
		wb.close();
	
	}

}
