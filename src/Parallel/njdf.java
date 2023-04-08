package Parallel;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class njdf {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\IB_Data\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        Map<String,Object> map=new HashMap<String,Object>();
        
    	map=(Map<String,Object>)(jse.executeScript("var performance = window.performance || {};" + 
                "var timings = performance.timing || {};"+
                "return timings;"));
    	
    	//System.out.println(abc);
    	
	
	
	}

}
