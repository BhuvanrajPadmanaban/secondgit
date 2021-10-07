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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Document {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\eclipse-workspace\\Selenium2-1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	driver.manage().window().maximize();
WebElement title = driver.findElement(By.tagName("table"));
WebElement hedline = title.findElement(By.tagName("thead"));
WebElement row = hedline.findElement(By.tagName("tr"));
List<WebElement> head = row.findElements(By.tagName("th"));

File file = new File("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx");
Workbook workbook = new XSSFWorkbook();
Sheet creatsheet = workbook.createSheet("Task6");
Row createRow2 = creatsheet.createRow(0);
for (int i = 0; i < head.size(); i++) { 
	Cell createCell = createRow2.createCell(i);
	WebElement element = head.get(i);
	String text = element.getText();
	createCell.setCellValue(text);
	System.out.print(text+"			   ");
}   System.out.println();
	WebElement body = title.findElement(By.tagName("tbody"));
	List<WebElement> list = body.findElements(By.tagName("tr"));	
	

	for (int i = list.size()-1; i >=  0; i--) {

		WebElement element = list.get(i);
		
		List<WebElement> list2 = element.findElements(By.tagName("td"));
		Row createRow3 = creatsheet.createRow(i+1);
		for (int j =0; j <list2.size(); j++) {
			 
				Cell createCell1 = createRow3.createCell(j);
			WebElement webElement = list2.get(j);
			String string = webElement.getText();
			createCell1.setCellValue(string);
			System.out.print(string+"			");
		}System.out.println();
	}
	
		FileOutputStream s = new FileOutputStream(file);
		workbook.write(s);
		System.out.println("     end        ");

}}
