package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstSalanium {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//driver.get("https://www.makemytrip.com");
	
	

	//driver.findElement(By.xpath("(//a[@href='/models'])[1]")).click();
	//driver.findElement(By.xpath("//a[@class='mr-5 flex flex-none items-center lg:mr-6']")).click();
	//driver.findElement(By.xpath("//li[@data-cy='tertiaryRowItem_Where2Go']")).click();
	//driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']")).click();
	//driver.findElement(By.xpath("//li[@data-cy='myTrips']")).click();
	//driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	//driver.findElement(By.xpath("//a[@class='close']")).click();
	
	//driver.findElement(By.xpath("//span[@data-cy='desktopCard_44']")).click();
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("/a[@id='superOffersTab_BANK_OFFERS']")).click();
	//driver.quit();
	String name="shiva_chaturvedi09" ;
	driver.get("https://www.instagram.com/"+name+"/");
//	driver.findElement(By.xpath("(//a[@title='Login'])[1]")).click();
//	driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9328098355");
//	driver.findElement(By.xpath("//a[@href='/account/login?signup=true']")).click();
//	driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8866176613");
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	WebElement u = driver.findElement(By.xpath("//h2[@dir='auto']"));
	WebElement e = driver.findElement(By.xpath("(//span[@class=\"_ac2a\"])[1]"));
	WebElement m = driver.findElement(By.xpath("(//span[@class=\"_ac2a\"])[2]"));
	WebElement r = driver.findElement(By.xpath("(//span[@class=\"_ac2a\"])[3]"));
	WebElement b = driver.findElement(By.xpath("//h1[@class='_ap3a _aaco _aacu _aacx _aad6 _aade']"));
	
	
	System.out.println(u.getText());
	System.out.println(e.getText());
	System.out.println(m.getText());
	System.out.println(r.getText());
	System.out.println(b.getText());
	
//	System.out.println(e.getAttribute("title"));
//	System.out.println(e.getTagName());
//	System.out.println(e.getCssValue("color"));
//	System.out.println(e.getCssValue("font-size"));
	
//	driver.get("https://the-internet.herokuapp.com/");
//	
//	driver.findElement(By.xpath("//a[@href='/drag_and_drop']")).click();
//	
//	WebElement From = driver.findElement(By.xpath("//div[@id='column-a']"));
//	WebElement To = driver.findElement(By.xpath("//div[@id='column-b']"));
//	
//	Actions act = new Actions(driver);
//	
//	act.dragAndDrop(From, To).build().perform();
	
	
//	driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
//	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//	//wait.until(ExpectedConditions.alertIsPresent());
//	//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	Alert alert = driver.switchTo().alert();
//	Thread.sleep(2000);
//	alert.sendKeys("hey meet");
//	Thread.sleep(5000);
//	alert.accept();
//	System.out.println("accepted succesfully");
//	
	}
}