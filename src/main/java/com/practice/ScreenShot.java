package com.practice;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public void takeScreenShot(WebDriver driver,String fileName) {
		TakesScreenshot s = (TakesScreenshot)driver;
		File screenShotFile = s.getScreenshotAs(OutputType.FILE);
		
		try {
		
		FileUtils.copyFile(screenShotFile, new File("C:\\Users\\meet.dhameliya\\eclipse-workspace\\trainig1\\ss\\"+fileName+".png"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public void takeSS(WebDriver driver , String nameOfFile) {
//		TakesScreenshot m = (TakesScreenshot)driver;
//		File screenShotFile = m.getScreenshotAs(OutputType.FILE);
//		
//		try {
//			FileUtils.copyFile(screenShotFile, new File("C:\\\\Users\\\\meet.dhameliya\\\\eclipse-workspace\\\\trainig1\\\\ss\\"+nameOfFile+".png"));
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
	
//	public void mySS(WebDriver driver , String name) {
//		TakesScreenshot r = (TakesScreenshot)driver;
//		File ssFile = r.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(ssFile, new File("C:\\Users\\meet.dhameliya\\eclipse-workspace\\trainig1\\ss\\"+name+".png"));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}
