package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.main.Const;
import com.main.PropertyReader;
import com.page.LogInPage;

public class TestPage {
	
	public WebDriver driver;
	PropertyReader propreader=new PropertyReader();
	
	@BeforeSuite
	public void initdriver() {
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(propreader.readProperty(Const.URL));
		
		
		}
	
	@Test
	public void testlogin() {
		
		
		
		LogInPage myobj=new LogInPage(driver);
		String Username=propreader.readProperty(Const.EMAIL);
		String Password=propreader.readProperty(Const.PASSWORD);
		myobj.goToLoginPage(Username, Password);
		
		}
	
	@Test
	
	public void GetText() {
		LogInPage getobj=new LogInPage(driver);
		
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(getobj.LoginButton.getText(), "Login");
		sf.assertAll();
		
	}
	
	@Test
	
	public void testResume() {
		LogInPage dashBoardobj = new LogInPage(driver);
		dashBoardobj.dashBoard();	
	}
	
@Test
	
	public void testLogOut() {
		LogInPage logoutobj = new LogInPage(driver);
		logoutobj.logOut();	
	}
	
}
