package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@Test(dataProvider = "arrData")
	public void testData(String name, String surname) {
		System.out.println(name + "-" + surname);
	}
	
	
@DataProvider
public String[][] arrData() {
	String arrmeet[][] = {{"meet", "patel"},{"om" , "patel"},{"shalin" , "tilva"}};
	return arrmeet;
}
}
