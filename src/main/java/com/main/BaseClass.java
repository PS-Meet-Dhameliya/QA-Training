package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeSuite
	public void initDriver() {
		driver = new ChromeDriver();
	}

}
