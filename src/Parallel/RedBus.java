package Parallel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RedBus{
	
	public static void main(String[] args) throws InterruptedException {
		setup s1=new setup();
		s1.browsersetup();
		WebDriver driver=setup.driver;
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		WebElement fromField=driver.findElement(By.id("src"));
		System.out.println("Is fromField field Displayed " +fromField.isDisplayed());
	    System.out.println("Is fromField field Enabled " +fromField.isEnabled());
		fromField.clear();
		fromField.sendKeys("Pune");
		Thread.sleep(2000);
		List<WebElement>fromFieldsugg=driver.findElements(By.xpath("//div//ul[@class='autoFill']/li"));
		for(int i=0;i<fromFieldsugg.size();i++) {
			System.out.println(fromFieldsugg.get(i).getText());
		}
		fromFieldsugg.get(1).click();
		
		WebElement ToField=driver.findElement(By.id("dest"));
		System.out.println("Is ToField field Displayed " +ToField.isDisplayed());
	    System.out.println("Is ToField field Enabled " +ToField.isEnabled());
		ToField.clear();
		ToField.sendKeys("Thane");
		Thread.sleep(2000);
		List<WebElement>ToFieldsugg=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		for(int i=0;i<ToFieldsugg.size();i++) {
			System.out.println(ToFieldsugg.get(i).getText());
		}
		ToFieldsugg.get(1).click();
		
		WebElement Nextbutton =driver.findElement(By.xpath("//td[@class='next']"));
		Nextbutton.click();
		Thread.sleep(2000);
		
		List<WebElement>NextMonthDates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[4]/td"));
		for(int i=0;i<NextMonthDates.size();i++) {
			System.out.println(NextMonthDates.get(i).getText());
		}
		NextMonthDates.get(5).click();
		
		WebElement SearchButton=driver.findElement(By.id("search_btn"));
		System.out.println("Is SearchButton field Displayed " +SearchButton.isDisplayed());
	    System.out.println("Is SearchButton field Enabled " +SearchButton.isEnabled());
	    String ExpSearchButton="Search Buses";
	    String ActSearchButton =SearchButton.getText();
	    if(ExpSearchButton.equalsIgnoreCase(ActSearchButton)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
		SearchButton.click();
		

	}
}