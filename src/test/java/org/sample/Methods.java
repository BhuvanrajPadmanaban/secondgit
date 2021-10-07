package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//1
	public class Methods {
		public void getDriver() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
//2
}		public void enteUrl(WebDriver driver, String url) {
		driver .get(url);
//3
}	public void Maximize(WebDriver driver) {
		driver.manage().window().maximize();
//4
}	public void click(WebElement element) {
		element.click();
//5
}	public void type(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
//6
}	public String getAttribute(WebElement element) {
	String data = element.getAttribute("name");
	return data;
//7
}	public String getText(WebElement element) {
	String text = element.getText();
	return text;
//8
}	public String getTitle(WebDriver driver) {
	String title = driver.getTitle();
	return title;
//9
}	public WebElement xpath(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.xpath(data));													
	return element;
//10
}	public WebElement id(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.id(data));
	return element;
//11
}	public WebElement name(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.name(data));
	return element;
//12
}   public WebElement tagname(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.tagName(data));
	return element;
//13
}	public WebElement partialLinkText(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.partialLinkText(data));
	return element;
//14
} 	public WebElement LinkText(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.linkText(data));
	return element;
//15
}	public WebElement classNamet(WebDriver driver , String data) {
	WebElement element = driver.findElement(By.className(data));
	return element;
//16	
}	public void setByVissibletext(WebElement element,String data) {
	Select select = new Select(element);
	select.selectByVisibleText(data);
//17
}	public void desetBytext(WebElement element,String data) {
	Select select = new Select(element);
	select.deselectByVisibleText(data);
//18
}	public void setByIndex(WebElement element,int index) {
	Select select = new Select(element);
	select.selectByIndex(index);
//19
}	public void deselectByIndex(WebElement element,int data) {
	Select select = new Select(element);
	select.deselectByIndex(data);
//20
}	public void selectByvalue(WebElement element,String data) {
	Select select = new Select(element);
	select.selectByValue(data);
//21
}	public void deselectByvalue(WebElement element,String data) {
	Select select = new Select(element);
	select.deselectByValue(data);
//22
}	public WebElement getFirstSelectedOption(WebElement element) {
	Select select = new Select(element);
	WebElement option = select.getFirstSelectedOption();
	return option;
//23
}	public void deselectAll(WebElement element) {
	Select select = new Select(element);
	select.deselectAll();
//24
}	public void size(WebElement element) {
	element.getSize();
//25
}   public void Multiply(WebElement element) {
	Select select = new Select(element);
	select.isMultiple();
//26
}	public void Accept(WebDriver driver) {
	Alert al = driver.switchTo().alert();
	al.accept();
	
//27
}	public void dismiss(WebDriver driver) {
	Alert al = driver.switchTo().alert();
	al.dismiss();
//28
}	public String alerttext(WebDriver driver) {
	Alert al = driver.switchTo().alert();
	String text = al.getText();
	return text;	
//29
}	public void alertSendkey(WebDriver driver, String data) {
	Alert al = driver.switchTo().alert();
	al.sendKeys(data);
//30		

}	public String getWindowHandle(WebDriver driver) {
	String handle = driver.getWindowHandle();
	return handle;
//31
}	public void back(WebDriver driver) {
	driver.navigate().back();
//32
}	public void forward (WebDriver driver) {
	driver.navigate().forward();
//33
}	public void reflesh (WebDriver driver) {
	driver.navigate().refresh();
//34
}	public void to (WebDriver driver,String url) {
	driver.navigate().to(url);
//35
}	public void Rightclick(WebDriver driver ) {
	Actions action = new Actions(driver);
	action.contextClick().perform();
//36
}	public String selectAllOption(WebElement element , int i) {
	Select select = new Select(element); 
	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	WebElement webElement = allSelectedOptions.get(i);
	String text = webElement.getText();
	return text;
//37
}	public String selectFirstOptn(WebElement element) {
	Select select = new Select(element); 
	WebElement firstSelectedOption = select.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	return text;
//38
}	public String currentUrl(WebDriver driver) {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
//39
}	public String getPageSource(WebDriver driver) {
	String pageSource = driver.getPageSource();
	return pageSource;
//40
}	public String windohandle(WebDriver driver) {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;
//41
} 	public Set<String> windowhandles(WebDriver driver) {
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
//42	
}	public void actionclick(WebDriver driver ) {
	Actions action = new Actions(driver);
	action.click().perform();
//43	
}	public void actionDoubleClick(WebDriver driver ) {
	Actions action = new Actions(driver);
	action.doubleClick().perform();
//44	
}public void DragDrop(WebDriver driver ,WebElement source , WebElement target) {
	Actions action = new Actions(driver);
	action.dragAndDrop(source, target).perform();
//45	
}	public void moveElement(WebDriver driver,WebElement data ) {
	Actions action = new Actions(driver);
	action.moveToElement(data).perform();
//46	
}	public void actionsendkey(WebDriver driver,WebElement target,CharSequence[] keys ) {
	Actions action = new Actions(driver);
	action.sendKeys(target, keys).perform();
//47
}	public void quit (WebDriver driver) {
	driver.quit();
//48
}	public void close(WebDriver driver) {
	driver.close();
//49
}	public void defaultcontent (WebDriver driver) {
	driver.switchTo().defaultContent();
//50
}	public void frameindex(WebDriver driver, int index) {
	driver.switchTo().frame(index);
//51	
} 	public void frameid(WebDriver driver, String name) {
	driver.switchTo().frame(name);
//52	
}	public void frameElement(WebDriver driver, WebElement element) {
	driver.switchTo().frame(element);
//53	
}	public void switchtoWindow(WebDriver driver,String name) {
	driver.switchTo().window(name);
//54	
} 	public void keyUp(WebElement element,WebDriver driver) {
	Actions actions=new Actions(driver);
	actions.keyUp(element,Keys.SHIFT).perform();
}//55
	public void keyDown(WebElement element,WebDriver driver) {
	Actions actions=new Actions(driver);
	actions.keyDown(element,Keys.SHIFT).perform();

}public void scrollDown(WebElement element,WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	

}//33
public void scrollUp(WebElement element,WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);

}//34

public void jsSendkeys(WebElement element,String data,WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
}//35
	public void jsClick(WebElement element,WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", element);

}//36
	public void jsgetAttribute(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//return type is object but type casting for String
		String executeScript =(String) js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(executeScript);
	
}//37
	public void getScreenShot(String path,WebDriver driver) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File des=new File(path);
		FileUtils.copyFile(source, des);
		
}//38
	public static  void switchFrameid( WebDriver driver,String locator,String idname) {
		if (locator.equalsIgnoreCase("id")) {
			 driver.switchTo().frame(idname);
		}
		else if (locator.equalsIgnoreCase("name")) {
			driver.switchTo().frame(idname);
		}
		
}		public   static String getExcel(String pathname,String Sheetname,int rowno,int cellno) throws IOException {
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

	
		
}			public static void excelWrite(String pathname, String Sheetno,int rowno,int cellno,String data) throws IOException {
			File file=new File(pathname);
			FileInputStream stream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(stream);
			Sheet createSheet = workbook.createSheet(Sheetno);
			Row createRow = createSheet.createRow(rowno);
			Cell createCell = createRow.createCell(cellno);
			createCell.setCellValue(data);
			
			FileOutputStream stream2=new FileOutputStream(file);
			workbook.write(stream2);
			

}

}
