package com.keys_control;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import SeleniumUtilsPackage.SeleniumUtils;

public class keysControl {
    static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtils util =new SeleniumUtils();
		util.setup("https://demo.actitime.com/login.do");
		driver=util.driver;
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		util.action.keyDown(Keys.CONTROL).sendKeys("R").keyUp(Keys.CONTROL).build().perform();
		
		

	}

}
