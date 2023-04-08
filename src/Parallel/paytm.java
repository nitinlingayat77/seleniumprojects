package Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
class utils1{
	WebDriver driver;
	void setup(String PageUrl) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\SM_ProjectDetails\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(PageUrl);
		Actions action =new Actions(driver);
		}
}
public class paytm {
	public static void main(String[] args) throws InterruptedException {
	utils util =new utils();
	util.setup("https://paytm.com/");
	WebDriver driver = util.driver;
	
	
    
	WebElement SignIn=driver.findElement(By.xpath("//span[text()='Sign In']"));
	System.out.println("Is SignIn field Displayed " +SignIn.isDisplayed());
    System.out.println("Is SignIn field Enabled " +SignIn.isEnabled());
    String ExpSignIn ="Sign In";
    String ActSignIn =SignIn.getText();
    if(ExpSignIn.equalsIgnoreCase(ActSignIn)) {
    	System.out.println("Name Verified");
    }else {
    	System.out.println("Name not verified");
    }
	SignIn.click();
	
	Thread.sleep(2000);
	WebElement iframe =driver.findElement(By.xpath("//iframe[@scrolling='no']"));
	System.out.println(iframe.getAttribute("src"));
	driver.switchTo().frame(iframe);
	WebElement PageText=driver.findElement(By.xpath("//p[@class='heading']"));
	String ActPageText=PageText.getText();
	System.out.println(ActPageText);
	//driver.switchTo().defaultContent();
	}
}
