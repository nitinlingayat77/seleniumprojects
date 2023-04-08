package Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		System.out.println(driver.getTitle());
        int lenght1 = driver.getTitle().length();
        System.out.println(lenght1);
        //System.out.println(driver.getPageSource());
        String exp_url = ("https://demosite.executeautomation.com/Login.html");
        String act_url =(driver.getCurrentUrl());
        if (exp_url.equalsIgnoreCase(act_url)) {
        	System.out.println("Correct Page Opened");
        }else {
        	System.out.println("incorrect url opened");
        }
        String page_source=driver.getPageSource();
        int source_lenght = (driver.getPageSource()).length();
        System.out.println(source_lenght);
		WebElement username = driver.findElement(By.name("UserName"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("manager");
		WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));
		login.click();
		System.out.println(driver.getTitle());
		WebElement logout = driver.findElement(By.linkText("li a:nth-child(1)"));
		//logout.click();
		
		//driver.close();
		

	}

}
