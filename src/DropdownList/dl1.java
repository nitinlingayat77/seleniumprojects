package DropdownList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Predefined_classes.Browser_launching;

public class dl1 {

	public static void main(String[] args) {
		//Browser_launching.browser("chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.findElement(By.name("UserName")).sendKeys("manager");
		driver.findElement(By.name("Password")).sendKeys("executive");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		WebElement dropdownList=driver.findElement(By.id("TitleId"));
		Select s1 = new Select(dropdownList);
		System.out.println(s1.isMultiple());
		
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByValue("1");
		//s1.selectByIndex(2);s1.selectByVisibleText("Mr.");
		
		
		
		
		

	}

}
