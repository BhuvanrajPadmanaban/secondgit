package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TaskBasecase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement Username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement Login;
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return Login;
	}



}
