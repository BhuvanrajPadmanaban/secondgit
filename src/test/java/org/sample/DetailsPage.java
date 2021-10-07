package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends TaskBasecase {
	public DetailsPage() {
		PageFactory.initElements(driver, this);
	}	@FindBy(id="location")
		private WebElement Hlocation;
	@FindBy(id="hotels")
		private WebElement hotels;
	@FindBy(id="room_type")
		private WebElement Roomstype;
	@FindBy(id="room_nos")
		private WebElement RoomNo;
	@FindBy(id="datepick_in")
		private WebElement CheckIn;
	@FindBy(id="datepick_out")
		private WebElement Checkout;
	@FindBy(id="adult_room")
		private WebElement Adultroom;
	@FindBy(id="child_room")
		private WebElement Childroom;
	
	@FindBy(name="Submit")
	private WebElement Submit;

	public WebElement getHlocation() {
		return Hlocation;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomstype() {
		return Roomstype;
	}

	public WebElement getRoomNo() {
		return RoomNo;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
		
	
	
		
		
		
		
		
		
		
		
		
		
	
	
}
