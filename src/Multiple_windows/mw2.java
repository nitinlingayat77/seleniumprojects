package Multiple_windows;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mw2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //Timeouts tm=driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
        Thread.sleep(3000);
        
        List<WebElement> li = driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div/div/span"));
        
        System.out.println(li.size());
        int suggList = li.size();
        for(int i=0; i<suggList;i++) {
        	System.out.println(li.get(i).getText());
        }

	    Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class='G43f7e']/li[5]/div/div/div/span")).click();

	}
}