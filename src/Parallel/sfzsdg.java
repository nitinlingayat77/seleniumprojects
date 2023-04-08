package Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sfzsdg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		String confirmAlert =driver.switchTo().alert().getText();
		System.out.println(confirmAlert);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton"));
		
		//String promptAlert = driver.switchTo().alert().getText();
		//System.out.println(promptAlert);
		driver.switchTo().alert().sendKeys("Testing");
		driver.switchTo().alert().accept();

	}

}
