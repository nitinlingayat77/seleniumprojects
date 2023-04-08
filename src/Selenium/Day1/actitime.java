package Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String act_title =driver.getTitle();
        System.out.println(act_title);
        String exp_title = "actiTIME - Login";
        if(act_title.equalsIgnoreCase(exp_title)) {
        	System.out.println("Page Title is correct");
        }else {
        	System.out.println("page Title is incorrect");
        }
        WebElement usn = driver.findElement(By.id("username"));
        usn.sendKeys("admin");
        WebElement pwd = driver.findElement(By.name("pwd"));
        pwd.sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        String act_title1 =driver.getTitle();
        System.out.println(act_title1);
        String exp_title1 = "actiTIME - Enter Time-Track";
        if(act_title1.equalsIgnoreCase(exp_title1)) {
        	System.out.println("Page Title is correct");
        }else {
        System.out.println("page Title is incorrect");
        }
        driver.findElement(By.id("logoutLink")).click();
        Thread.sleep(2000);
        String act_title2 =driver.getTitle();
        System.out.println(act_title2);
        String exp_title2 = "actiTIME - Login";
        if(act_title2.equalsIgnoreCase(exp_title2)) {
        	System.out.println("Page Title is correct");
        }else {
        System.out.println("page Title is incorrect");
        }
        
        
        
	}

}
