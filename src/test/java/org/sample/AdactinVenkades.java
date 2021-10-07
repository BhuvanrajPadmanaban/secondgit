package org.sample;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinVenkades extends TaskBasecase {
public static void main(String[] args) throws IOException {
	urlname("http://adactinhotelapp.com/");
	WebElement locator1 = locator("id", "username");
	String r0c0 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 0);
	sendKeys(locator1, r0c0);
	WebElement locator2 = locator("id", "password");
	String r0c1 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 1);
	sendKeys(locator2, r0c1);
	WebElement locator3 = locator("id", "login");
	
	click(locator3);
	WebElement locator4 = locator("id", "location");
	WebElement locator5 = locator("id", "hotels");
	WebElement locator6 = locator("id", "room_type");
	WebElement locator7 = locator("id", "room_nos");
	WebElement locator8 = locator("id", "datepick_in");
	WebElement locator9 = locator("id", "datepick_out");
	WebElement locator10 = locator("id", "adult_room");
	WebElement locator11 = locator("id", "child_room");
	WebElement locator12 = locator("id", "Submit");
	
	
	String r0c2 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 2);
	String r0c3 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 3);
	String r0c4 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 4);
	String r0c5 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 5);
	String r0c6 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 6);
	String r0c7 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0,7 );
	String r0c8 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0,8);
	String r0c9 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0,9);

	
	int r0c2I = Integer.parseInt(r0c2);
	int r0c3I = Integer.parseInt(r0c3);
	int r0c4I = Integer.parseInt(r0c4);
	int r0c5I = Integer.parseInt(r0c5);
	int r0c8I = Integer.parseInt(r0c8);
	int r0c9I = Integer.parseInt(r0c9);
	

	setByIndex(locator4, r0c2I);
	setByIndex(locator5, r0c3I);
	setByIndex(locator6, r0c4I);
	setByIndex(locator7, r0c5I);
	setByIndex(locator10, r0c8I);
	setByIndex(locator11, r0c9I);
	
	clear(locator8);
	clear(locator9);
	sendKeys(locator8, r0c6);
	sendKeys(locator9, r0c7);
	
	click(locator12);
	
	WebElement locator13 = locator("id", "radiobutton_0");
	WebElement locator14 = locator("id", "continue");
	
	
	click(locator13);
	click(locator14);
	
	
	WebElement locator15 = locator("id", "first_name");
	WebElement locator16 = locator("id", "last_name");
	WebElement locator17 = locator("id", "address");
	WebElement locator18 = locator("id", "cc_num");
	WebElement locator19 = locator("id", "cc_type");
	WebElement locator20 = locator("id", "cc_exp_month");
	WebElement locator21 = locator("id", "cc_exp_year");
	WebElement locator22 = locator("id", "cc_cvv");
	WebElement locator23 = locator("id", "book_now");
	
	String r0c10 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 10);
	String r0c11 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 11);
	String r0c12= getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 12);
	String r0c13= getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 13);
	String r0c14= getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 14);
	String r0c15= getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 15);
	String r0c16= getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 16);
	String r0c17= getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 17);
	
	
	int r0c14I = Integer.parseInt(r0c14);
	int r0c15I = Integer.parseInt(r0c15);
	int r0c16I = Integer.parseInt(r0c16);
	
	
	sendKeys(locator15, r0c10);
	sendKeys(locator16, r0c11);
	sendKeys(locator17, r0c12);
	sendKeys(locator18, r0c13);
	sendKeys(locator22, r0c16);
	
	setByIndex(locator19, r0c14I);
	setByIndex(locator20, r0c15I);
	setByIndex(locator21, r0c16I);
	
	click(locator23);	
}
}
