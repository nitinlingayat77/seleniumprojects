package Parallel;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flt {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\SM_ProjectDetails\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        JavascriptExecutor ext=(JavascriptExecutor)driver;
        WebElement text=driver.findElement(By.xpath("//h2[text()='Trending deals']"));
        ext.executeScript("arguments[0].scrollIntoView(true);",text);
        System.out.println(text.getText());
        ext.executeScript("document.getElementById('twotabsearchtextbox').value='Oneplus 9pro'");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).click();
	
	}

}
