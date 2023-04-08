package Multiple_elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_me {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		List<WebElement> flist = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div[2]"));
		int flist_count = flist.size();
		System.out.println(flist_count);
		for (int  i =0;i<flist_count;i++) {
			System.out.println(flist.get(i).getText());
		}System.out.println("----------");
		driver.close();

	}

}
