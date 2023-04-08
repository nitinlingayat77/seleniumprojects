package Selenium.Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\geckodriver.exe");
		FirefoxDriver br1 = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
		InternetExplorerDriver ID = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver CD = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		FirefoxDriver FD =new FirefoxDriver();

	}

}
