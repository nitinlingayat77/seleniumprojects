package Multiple_elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena_me2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actTitle =driver.getTitle();
		System.out.println(actTitle);
		String expTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		if(actTitle.equalsIgnoreCase(expTitle)) {
			System.out.println("Title Verified");
		}else {
			System.out.println("Title incorrect");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='realme-phones-118.php']")).click();
		Thread.sleep(2000);
		List<WebElement> Pagination=driver.findElements(By.xpath("//div[@class='nav-pages']/a"));
		int pageLink = Pagination.size();
		if(pageLink>0) {
			System.out.println("Pagination is available");
			for(int i=0;i<pageLink;i++) {
				System.out.println(Pagination.get(i).getText()+"-"+Pagination.get(i).getAttribute("href"));
			}
		}else {
			System.out.println("Pagination is not available");  
			
		} 
		driver.close();

	}

} 
