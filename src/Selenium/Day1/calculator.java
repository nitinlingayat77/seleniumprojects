package Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement age =driver.findElement(By.id("cage"));
        age.clear();
        age.sendKeys("28");
        driver.findElement(By.id("csex2")).click();
        WebElement height = driver.findElement(By.id("cheightmeter"));
        height.clear();
        height.sendKeys("197");
        WebElement weight = driver.findElement(By.id("ckg"));
        weight.clear();
        weight.sendKeys("72");
        driver.findElement(By.cssSelector("input[value='Calculate']")).click();
        driver.findElement(By.cssSelector("img[class='clearbtn']")).click();
        
	}

}
