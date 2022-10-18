package org.newmav;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewMav {
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\Jagadesh kumar R\\Desktop\\New folder\\jaga.xlsx");
				
				FileInputStream stream = new FileInputStream(f);
				
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
