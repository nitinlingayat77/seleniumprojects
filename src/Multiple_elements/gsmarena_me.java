package Multiple_elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena_me {

	public static void main(String[] args) {
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
		List<WebElement> gsList=driver.findElements(By.xpath("//div[@class='brandmenu-v2 light l-box clearfix']/ul/li/a"));
        int gsListCount = gsList.size();
        System.out.println(gsListCount);
        for(int i=0;i<gsListCount;i++) {
        	System.out.println(gsList.get(i).getText());
        }
	}

}
