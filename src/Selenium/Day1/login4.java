package Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demosite.executeautomation.com/Login.html");
        System.out.println(driver.getTitle());
        int lenght1 = driver.getTitle().length();
        System.out.println(lenght1);
        //System.out.println(driver.getPageSource());
        String exp_url = ("https://demo.actitime.com/login.do");
        String act_url =(driver.getCurrentUrl());
        if (exp_url.equalsIgnoreCase(act_url)) {
        	System.out.println("Correct Page Opened");
        }else {
        	System.out.println("incorrect url opened");
        }
        String page_source=driver.getPageSource();
        int source_lenght = (driver.getPageSource()).length();
        System.out.println(source_lenght);
        WebElement uid = driver.findElement(By.name("username"));
        uid.sendKeys("admin");
        WebElement pwd = driver.findElement(By.name("pwd"));
        pwd.sendKeys("manager");
        WebElement log = driver.findElement(By.cssSelector("body td div a:nth-child(1)"));
        log.click();
        String title = driver.getTitle();
        System.out.println(title);
        WebElement logout = driver.findElement(By.cssSelector("#logoutLink"));
        logout.click();

	}

}
