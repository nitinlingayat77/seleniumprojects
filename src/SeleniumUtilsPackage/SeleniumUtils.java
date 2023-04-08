package SeleniumUtilsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtils {
	public WebDriver driver;
	public Actions action;
    public void setup(String pageUrl) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
    	driver= new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(pageUrl);
    }
	public void mouseoverActions(WebElement element) {
		action = new Actions(driver);
		 action.moveToElement(element).perform();	
	}
	public void mouseRightclick(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
		
	}
	public void dragNdrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).build().perform();
		
	}
	public void doubleClick(WebElement element) {
		action.doubleClick(element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
