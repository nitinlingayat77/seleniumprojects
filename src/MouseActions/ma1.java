package MouseActions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class ma1 {
	public static WebDriver driver;
	public static Actions action;
    public static void setup(String pageUrl) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\SM_ProjectDetails\\drivers\\chromedriver.exe");
    	driver= new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(pageUrl);
    }
	public static void mouseoverActions(WebElement element) {
		action = new Actions(driver);
		 action.moveToElement(element).perform();	
	}
	public static void mouseRightclick(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
		
		
	}
	public static void dragNdrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).build().perform();
		
	}
	public static void doubleClick(WebElement element) {
		action.doubleClick(element);
	}
    
	public static void main(String[] args) throws InterruptedException {
        setup("https://www.globalsqa.com/demo-site/");
        WebElement books=driver.findElement(By.xpath("//a[@class='no_border']"));
        mouseoverActions(books);
        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
        Thread.sleep(2000);
        WebElement image=driver.findElement(By.xpath("//ul[@id='gallery']/li/img"));
        WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
        dragNdrop(image,trash);
        
	}

}
