package Selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        int lenght1 = driver.getTitle().length();
        System.out.println(lenght1);
        System.out.println(driver.getPageSource());
        driver.close();
        

	}

}
