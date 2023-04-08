package Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
		WebElement add = driver.findElement(By.id("btnAdd"));
		add.click();
		
		driver.close();

	}

}
