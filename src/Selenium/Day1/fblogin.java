package Selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String act_title= (driver.getTitle());
        System.out.println(act_title);
        
        String exp_title = ("Facebook - ??? ?? ????? ???? ??");
        
        if (exp_title.equalsIgnoreCase(act_title)) {
        	System.out.println("Correct Page Title");
        }else {
        	System.out.println("incorrect Title");
        }
        driver.close();

	}

}
