package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(name="passwd")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement submit_btn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
