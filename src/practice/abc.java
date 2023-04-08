package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class abc {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\IB_Data\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
		WebElement SearchBox =driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.clear();
		SearchBox.sendKeys("Bank");
		//driver.findElement(By.xpath("//input[@aria-label='aria-label']")).click();
		List<WebElement> GoogleSuggestionList=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li//div//div[2]//div[1]"));
		int suggList=GoogleSuggestionList.size();
		for(int i=0;i<suggList;i++) {
			if(GoogleSuggestionList.get(i).getText().contains("bankbazaar")) {
				GoogleSuggestionList.get(i).click();
				break;
			}
		}
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[@href='https://www.bankbazaar.com/']")).click();
		
		/*

		try {
		    WebDriverWait wait = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    System.out.println(alert.getText());
		    alert.dismiss();
		    
		} catch (Exception e) {
		    //exception handling
		}*/
		
		WebElement HomeLoanFiled=driver.findElement(By.xpath("//a[@title='Home Loan']"));
		Assert.assertTrue(HomeLoanFiled.isDisplayed());
		Assert.assertTrue(HomeLoanFiled.isEnabled());
		HomeLoanFiled.click();
		List<WebElement>typeOfemploymentFiled=driver.findElements(By.xpath("//div[@class='EmploymentType_container_38si1 container-width-for-4-cols']//label"));
		/*
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=driver.findElement(By.xpath("//div[@class='EmploymentType_container_38si1 container-width-for-4-cols']//div[8]//label"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		for(int i=0;i<=typeOfemploymentFiled.size()-1;i++) {
			//System.out.println(typeOfemploymentFiled.get(i).getText());
			Thread.sleep(5000);
			if(typeOfemploymentFiled.get(i).getText().contains("Salaried")) {
				typeOfemploymentFiled.get(i).click();
			}
		}*/
		WebElement salarizedfield=driver.findElement(By.xpath("//input[@value='SALARIED']"));
		salarizedfield.click();
		Thread.sleep(3000);
		WebElement sliderBar=driver.findElement(By.xpath("//div[@class='rangeslider rangeslider-horizontal']//div[2]//span"));
		driver.findElement(By.xpath("//input[@name='grossMonthlyIncome']")).sendKeys("25000");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='PIN Code']")).sendKeys("411033");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Transfer my existing home loan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("A");
		
		List<WebElement>BanksuggList=driver.findElements(By.xpath("//div[@id='react-select-2--list']//span"));
		for(int i=0;i<=BanksuggList.size()-1;i++) {
			System.out.println(BanksuggList.get(i).getText());
		}
		
		
		
		
		
		
	}
	

}
