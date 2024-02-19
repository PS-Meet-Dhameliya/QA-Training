package com.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstNgTest {
	
	
	@Test
	public void firstMethod() {
		System.out.println("this is first");
	}
	@Test(enabled = false)
	public void secondMethod() {
		System.out.println("this is second");
	}
	@BeforeSuite
	public  void thirdMethod() {
		System.out.println("this is third");
	}
	@BeforeMethod
	public  void foueMethod() {
		System.out.println("this is fourth");
	}
	

}