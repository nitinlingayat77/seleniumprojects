package Multiple_elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickinfo_me {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actTitle =driver.getTitle();
		System.out.println(actTitle);
		String expTitle = "Live cricket scores, match schedules, latest cricket news, cricket videos";
		if(actTitle.equalsIgnoreCase(expTitle)) {
			System.out.println("Title Verified");
		}else {
			System.out.println("Title incorrect");
		}
		List<WebElement>crickList =driver.findElements(By.xpath("//ul[@class='nav nav-tabs league-tabs']/li/div/span"));
		int crickListCount=crickList.size();
		System.out.println(crickListCount);
		for(int i=0; i<crickListCount;i++) {
			System.out.println(crickList.get(i).getText());
		}System.out.println("----------");
		driver.close();
		

	}

}
