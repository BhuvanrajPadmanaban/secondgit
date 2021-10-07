package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskBasecase {
public static WebDriver driver;
	public static void urlname( String url) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver .get(url);
		driver.manage().window().maximize();
	}
	public static WebElement locator(String locator,String data) {
			if(locator.equals("id")) {
			WebElement element = driver.findElement(By.id(data));													
			return element;
			}
			else if(locator.equals("xpath")) {
				WebElement element = driver.findElement(By.xpath(data));													
				return element;	
			}else  {
				WebElement element = driver.findElement(By.name(data));													
				return element;	
			
}}	public static void sendKeys(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);

}	public static WebElement locator1(String locator1,String data) {
	if(locator1.equals("id")) {
	WebElement element = driver.findElement(By.id(data));													
	return element;
	}
	else if(locator1.equals("xpath")) {
		WebElement element = driver.findElement(By.xpath(data));													
		return element;	
	}else  {
		WebElement element = driver.findElement(By.name(data));													
		return element;	
	
}	}public static void click(WebElement element) {
	element.click();

}	public static WebElement location (String location,String data) {
	if(location.equals("id")) {
	WebElement element = driver.findElement(By.id(data));													
	return element;
	}
	else if(location.equals("xpath")) {
		WebElement element = driver.findElement(By.xpath(data));													
		return element;	
	}else  {
		WebElement element = driver.findElement(By.name(data));													
		return element;	
	
}}	public static void locationclick (WebElement element) {
	element.click();

}
public static void setByIndex(WebElement element,int index ) {
	Select select = new Select(element);
	select.selectByIndex(index);
//19
}

public   static String getExcel(String pathname,String Sheetname,int rowno,int cellno) throws IOException {
	String value="";
	File file=new File(pathname);
	FileInputStream stream=new FileInputStream(file);
	
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(Sheetname);
	Row row = sheet.getRow(rowno);
	Cell cell = row.getCell(cellno);
	int cellType = cell.getCellType();
	if (cellType==1) {
		 value = cell.getStringCellValue();	
	}
	else if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY");
		value = dateFormat.format(dateCellValue);
		
		
	}
	else {
		double numericCellValue = cell.getNumericCellValue();
		long l=(long) numericCellValue;
		 value = String.valueOf(l);
		
	}
	return value;
	



}	
	
	
	public static void clear(WebElement element) {
		element.clear();

	}
	
	
	
	
	
	
	
}
