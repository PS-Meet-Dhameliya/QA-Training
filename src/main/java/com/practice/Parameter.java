package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Parameter {
	public WebDriver driver;
	
	@Test
	@Parameters(value = "browser")
	public void seleniumMethod(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://selenium.dev");
		String MyTest = driver.findElement(By.xpath("//p[@class='d-1 fs-1 fw-normal mb-0']")).getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(MyTest,"What you do with that power is entirely up ");
		softassert.assertAll();
	}

}
