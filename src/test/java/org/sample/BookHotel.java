package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends TaskBasecase {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditno;
	@FindBy(id="cc_type")
	private WebElement creadittype;
	@FindBy(id="cc_exp_month")
	private WebElement Emonth;
	@FindBy(id="cc_exp_year")
	private WebElement Eyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditno() {
		return creditno;
	}
	public WebElement getCreadittype() {
		return creadittype;
	}
	public WebElement getEmonth() {
		return Emonth;
	}
	public WebElement getEyear() {
		return Eyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}

}
