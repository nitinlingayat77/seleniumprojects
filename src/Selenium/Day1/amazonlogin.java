package Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title1 = driver.getTitle(); 
		System.out.println(title1);
		driver.findElement(By.linkText("Amazon Pay")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		String title2 = driver.getTitle();
		if(title1.equalsIgnoreCase(title2)) {
			System.out.println("Title is matching");
		}else {
			System.out.println("Title is not matching");
		}
		driver.close();
		

	}

}
