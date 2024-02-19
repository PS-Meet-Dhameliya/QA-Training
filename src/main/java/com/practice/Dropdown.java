package com.practice;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		List<WebElement> aelements = driver.findElements(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 ps-4 ps-lg-2']"));
		
		for (WebElement m : aelements) {
			System.out.println(m.getText());
			if(m.getText().equalsIgnoreCase("About")){
				m.click();
				
		}
				
			}
		
		ScreenShot myobj=new ScreenShot();
		myobj.takeScreenShot(driver, "file2");
		
		
		
		}
	
	
}

