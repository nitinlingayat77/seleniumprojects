package Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String act_title=(driver.getTitle());
        System.out.println(act_title);
        String exp_tittle ="OrangeHRM";
        if(act_title.equalsIgnoreCase(act_title)) {
        	System.out.println("Page title is correct");
        }else {
        	System.out.println("Page title is not correct");
        }
        WebElement usn = driver.findElement(By.id("txtUsername"));
        System.out.println(usn.getText());
        System.out.println(usn.isDisplayed());
        System.out.println(usn.isEnabled());
        usn.sendKeys("Admin");
        WebElement pwd=driver.findElement(By.id("txtPassword"));
        pwd.sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        String act_title1=(driver.getTitle());
        System.out.println(act_title1);
        String exp_tittle1 ="OrangeHRM";
        if(act_title1.equalsIgnoreCase(act_title1)) {
        	System.out.println("Page title is correct");
        }else {
        	System.out.println("Page title is not correct");
        }
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        String act_title2=(driver.getTitle());
        System.out.println(act_title1);
        String exp_tittle2 ="OrangeHRM";
        if(act_title2.equalsIgnoreCase(act_title2)) {
        	System.out.println("Page title is correct");
        }else {
        	System.out.println("Page title is not correct");
        }
        WebElement fpsw = driver.findElement(By.linkText("Forgot your password?"));
        System.out.println(fpsw.getAttribute("id"));
	}

}
