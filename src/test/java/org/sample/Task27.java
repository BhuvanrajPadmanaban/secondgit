package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task27 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		element.click();
		
		Select select =new Select(element);
		List<WebElement> c = select.getOptions();
		int size = c.size();
		System.out.println(size);
		
		File file = new File("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Task1.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Task1");
		for (int i = 0; i < size; i++) {
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			WebElement element2 = c.get(i);
			String text = element2.getText();
			cell.setCellValue(text);
		}
	FileOutputStream s = new FileOutputStream(file);
	workbook.write(s);
	System.out.println("************&*************");
		
	
	
	
	
	
	
	
	
	}

}
