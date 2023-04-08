package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class newt {
	@DataProvider
	public void TestData() {
		Object[][] obj = new Object[3][3];
		obj[0][0] ="Nitin";
		obj[0][1] ="Shyamrao";
		obj[0][2] ="Lingayat";
		
		obj[1][0] ="Sachin";
		obj[1][2] ="Shyamrao";
		obj[1][3] ="Lingayat";
		
		obj[2][0] ="Sarika";
		obj[2][1] ="Shyamrao";
		obj[2][2] ="Lingayat";
	}
	
	@Test(dataProvider="TestData")
	public void login(String Name,String Fname, String LName) {
		System.out.println(Name);
		System.out.println(Fname);
		System.out.println(LName);
		
	}

}
