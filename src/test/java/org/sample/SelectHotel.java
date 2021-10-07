package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends TaskBasecase{
public SelectHotel() {
	PageFactory.initElements(driver, this);
}	@FindBy(id="radiobutton_0")
	private WebElement selectoption;
	@FindBy(id="continue")
	private WebElement continuecl;
	public WebElement getSelectoption() {
		return selectoption;
	}
	public WebElement getContinuecl() {
		return continuecl;
	}
	





}
