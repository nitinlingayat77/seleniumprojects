package Multiple_windows;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mw1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\SM_ProjectDetails\\drivers\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
        driver.get("https://demosite.executeautomation.com/Login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String home=driver.getWindowHandle();
        driver.navigate().to("http://www.google.co.in");
        Set<String> child=driver.getWindowHandles();
        
        
        
	}

}
