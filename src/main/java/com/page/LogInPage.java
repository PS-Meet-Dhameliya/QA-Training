package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public  LogInPage(WebDriver driver ) {
	
	PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	public static WebElement ClickButton;
	
	@FindBy(id="emailId")
	public static WebElement UserName;
	
	@FindBy(id="passwordId")
	public static WebElement Password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public static WebElement LoginButton;
	
	@FindBy(className="cursor-pointer hover:opacity-80")
	public static WebElement Resume;
	
	@FindBy(xpath="((//button[@type='button'])[2]")
	public static WebElement LogoutButton;
	public void goToLoginPage(String username,String password) {
		ClickButton.click();		
		UserName.clear();
		UserName.sendKeys(username);
		
		Password.clear();
		Password.sendKeys(password);
		
		LoginButton.click();
		
		
		
		
	}
	public void dashBoard() {
		Resume.click();
	}
	
	public void logOut() {
		LogoutButton.click();
		
	}

}