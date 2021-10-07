package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exel {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book1.xlsx");
 FileInputStream steam = new FileInputStream(file);
 
 Workbook book = new XSSFWorkbook(steam);
 Sheet sheet = book.getSheet("Data");
 
 Row row = sheet.getRow(0);
 Cell cell = row.getCell(0);
 System.out.println(cell);
 int k = sheet.getPhysicalNumberOfRows();
for (int i = 0; i < sheet.getPhysicalNumberOfRows();i++) {
	Row row1 = sheet.getRow(i);
	int l = row1.getPhysicalNumberOfCells();
	for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
		Cell cell1 = row1.getCell(j);
		int type = cell1.getCellType();
		if(type==1) {
			String value = cell1.getStringCellValue();
			System.out.print(value+"				"	);
		}System.out.println();
		if (type==0) {
			double cellValue = cell1.getNumericCellValue();
			System.out.println(cellValue);
		long c = (long)cellValue;
		String valueOf = String.valueOf(l);
		System.out.print(valueOf+"				"	);
		
		}	System.out.println();
		System.out.println("0987654");
		System.out.println("0987654");
			
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
}}}}

