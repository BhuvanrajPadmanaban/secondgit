package org.sample;

import java.io.IOException;

import org.jsoup.safety.Cleaner;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.SendKeysAction;

public class TaskResult extends TaskBasecase {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		urlname("http://adactinhotelapp.com/");
		LoginPage a = new LoginPage();
		WebElement textusername = a.getUsername();
		sendKeys(textusername, "SuguAravind");
		
		WebElement textpassword = a.getPassword();
		sendKeys(textpassword, "sugu@3005");
		
		WebElement clklogin = a.getLogin();
		click(clklogin);
	//page2	
		DetailsPage b = new DetailsPage(); 
		WebElement hlocation = b.getHlocation();
		String loc = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 2);
		int hl = Integer.parseInt(loc);
		setByIndex(hlocation, hl);
		
		WebElement hotels = b.getHotels();
		String lch = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 3);
		int lchotel = Integer.parseInt(lch);
		setByIndex(hotels, lchotel);
		
		WebElement roomtype = b.getRoomstype();
		String room = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 4);
		int hroom = Integer.parseInt(room);
		setByIndex(roomtype, hroom);
		
		WebElement roomNo = b.getRoomNo();
		String room1 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 5);
		int hroom1 = Integer.parseInt(room1);
		setByIndex(roomNo, hroom1);
		WebElement checkIn = b.getCheckIn();
		  clear(checkIn);
		String date = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 6);
	  	sendKeys(checkIn, date);
	  	WebElement checkout = b.getCheckout();
		clear(checkout);
		String dateout = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 7);
		sendKeys(checkout, dateout);
		WebElement adultroom = b.getAdultroom();
		String aroom1 = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 8);
		int aroom2 = Integer.parseInt(aroom1);
		setByIndex(adultroom, aroom2);
		WebElement childroom = b.getChildroom();
		String croom = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 9);
		int croom1 = Integer.parseInt(croom);
		setByIndex(childroom, croom1);
		WebElement submit = b.getSubmit();
		click(submit);
//	page3
		SelectHotel c =new SelectHotel();
		WebElement selectoption = c.getSelectoption();
		click(selectoption);
		WebElement continuecl = c.getContinuecl();
		click(continuecl);
// page4
		BookHotel d = new BookHotel();
		WebElement firstname = d.getFirstname();
		String fname = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 10);
		sendKeys(firstname, fname);
		WebElement lastname = d.getLastname();
		String lname = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 11);
		sendKeys(lastname, lname);
		WebElement addre = d.getAddress();
		String address = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 12);
		sendKeys(addre, address);
        WebElement creditno = d.getCreditno();
		String card = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 13);
		sendKeys(creditno, card);
		WebElement creadittype = d.getCreadittype();
		String ctype = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 14);
		int ct = Integer.parseInt(ctype);
		setByIndex(creadittype, ct);
		WebElement emonth = d.getEmonth();
		String cmonth = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 15);
		int cm = Integer.parseInt(cmonth);
		setByIndex(emonth, cm);
		WebElement eyear = d.getEyear();
		String cyear = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 16);
		int cy = Integer.parseInt(cyear);
		setByIndex(eyear, cy);
		WebElement cvv = d.getCvv();
		String cvvcode = getExcel("C:\\Users\\nisha\\eclipse-workspace\\MVN\\Excel\\Book3.xlsx", "datas", 0, 17);
		sendKeys(cvv, cvvcode);
		WebElement booknow = d.getBooknow();
		click(booknow);
		Thread.sleep(3000);
//		WebElement location18 = location("xpath", "//input[@type='button']");
//		click(location18);
//		
//		WebElement location19 = location("xpath", "//input[@type='checkbox']");
//		click(location19);
//		
//		WebElement location20 = location("id", "search_hotel");
//		click(location20);
		
		
	}

}
