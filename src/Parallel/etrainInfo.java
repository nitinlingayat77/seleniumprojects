package Parallel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class setup {
	static WebDriver driver;
	static Actions act;
	void browsersetup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\SM_ProjectDetails\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    act=new Actions(driver);
	}
}

public class etrainInfo {
	
	public static void main(String[] args) throws InterruptedException {
		setup s1=new setup();
		s1.browsersetup();
		WebDriver driver=setup.driver;
		driver.get("https://etrain.info/in");
		System.out.println(driver.getTitle());
		
		WebElement ReservationRules =driver.findElement(By.xpath("//a[text()='Reservation Rules']"));
		System.out.println("Is ReservationRules field Displayed " +ReservationRules.isDisplayed());
	    System.out.println("Is ReservationRules field Enabled " +ReservationRules.isEnabled());
	    String ExpReservationRules="Reservation Rules";
	    String ActReservationRules =ReservationRules.getText();
	    if(ExpReservationRules.equalsIgnoreCase(ActReservationRules)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
		ReservationRules.click();
		
		String homeWindowId=driver.getWindowHandle();
		Set<String> allWinIds=driver.getWindowHandles();
		allWinIds.remove(homeWindowId);
		System.out.println(allWinIds);
		Iterator<String> itr = allWinIds.iterator();
		String ChildWinID=itr.next();
		driver.switchTo().window(ChildWinID);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='corover-close-cb-btn']")).click();
		Thread.sleep(2000);
		WebElement Services =driver.findElement(By.xpath("//a[text()='Services']"));
		System.out.println("Is Services field Displayed " +Services.isDisplayed());
	    System.out.println("Is Services field Enabled " +Services.isEnabled());
	    String ExpServices="Services";
	    String ActServices =Services.getText();
	    if(ExpServices.equalsIgnoreCase(ActServices)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    Services.click();
	    
	    WebElement Sugg1 =driver.findElement(By.xpath("//div[@id='corover-close-btn']"));
		System.out.println("Is Sugg1 field Displayed " +Sugg1.isDisplayed());
	    System.out.println("Is Sugg1 field Enabled " +Sugg1.isEnabled());
	    Sugg1.click();
		List<WebElement> Servicessuggestions =driver.findElements(By.xpath("//div[@id='collapse1']/ul/li"));
		System.out.println(Servicessuggestions.size());
		for(int i=0;i<Servicessuggestions.size();i++) {
			System.out.println(Servicessuggestions.get(i).getText());
		}
		
		WebElement MobileTrackservices=driver.findElement(By.xpath("//a[text()='Mobile Ticketing Services']"));
		System.out.println("Is MobileTrackservices field Displayed " +MobileTrackservices.isDisplayed());
	    System.out.println("Is MobileTrackservices field Enabled " +MobileTrackservices.isEnabled());
	    String ExpMobileTrackservices="Mobile Ticketing Services";
	    String ActMobileTrackservices =MobileTrackservices.getText();
	    if(ExpMobileTrackservices.equalsIgnoreCase(ActMobileTrackservices)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    MobileTrackservices.click();
	    
	    driver.navigate().back();
	    driver.navigate().forward();
	    
		WebElement Link1=driver.findElement(By.xpath("//p/a[1]"));
		System.out.println(Link1.getAttribute("href"));
		
		WebElement Link2=driver.findElement(By.xpath("//td[@class='main_body_text']/p[8]/a"));
		System.out.println(Link2.getAttribute("href"));
		
		WebElement Link3=driver.findElement(By.xpath("//td[@class='main_body_text']/p[10]/a"));
		System.out.println(Link3.getAttribute("href"));
		
		WebElement Link4=driver.findElement(By.xpath("//td[@class='main_body_text']/p[11]/a"));
		System.out.println(Link4.getAttribute("href"));
		driver.close();
		driver.switchTo().window(homeWindowId);
		Thread.sleep(2000);
		
		WebElement SourceSt=driver.findElement(By.id("cbafi1"));
		System.out.println("Is SourceSt field Displayed " +SourceSt.isDisplayed());
	    System.out.println("Is SourceSt field Enabled " +SourceSt.isEnabled());
	    String ExpSourceSt="Station Name/Code";
	    String ActSourceSt =SourceSt.getAttribute("placeholder");
	    if(ExpSourceSt.equalsIgnoreCase(ActSourceSt)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
		SourceSt.sendKeys("Pune");
		
		WebElement SourceStsugg=driver.findElement(By.xpath("//div[@id='suggest_row1']"));
		SourceStsugg.click();
		
		WebElement DestinationSt=driver.findElement(By.id("cbafi2"));
		System.out.println("Is DestinationSt field Displayed " +DestinationSt.isDisplayed());
	    System.out.println("Is DestinationSt field Enabled " +DestinationSt.isEnabled());
	    String ExpDestinationSt="Station Name/Code";
	    String ActDestinationSt =SourceSt.getAttribute("placeholder");
	    if(ExpDestinationSt.equalsIgnoreCase(ActDestinationSt)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
		DestinationSt.sendKeys("NAGPUR");
		
		Thread.sleep(2000);
		setup.act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement DestinationStsugg=driver.findElement(By.xpath("//div[@id='suggest_row1']"));
		DestinationStsugg.click();
		Thread.sleep(2000);
		
		WebElement AvailabilityField=driver.findElement(By.id("cbasbmtbtn"));
		System.out.println("Is AvailabilityField field Displayed " +AvailabilityField.isDisplayed());
	    System.out.println("Is AvailabilityField field Enabled " +AvailabilityField.isEnabled());
	    String ExpAvailabilityField="Mobile Ticketing Services";
	    String ActAvailabilityField =AvailabilityField.getText();
	    if(ExpAvailabilityField.equalsIgnoreCase(ActAvailabilityField)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
		AvailabilityField.click();
		
		Thread.sleep(3000);
		setup.act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		
		WebElement Train1 =driver.findElement(By.xpath("//table[@class='nocps fullw bx0s rnd5']/tbody/tr[4]/td/div/table/tbody/tr/td/span"));
		String ActrainTrain1=Train1.getText();
		System.out.println(ActrainTrain1);
		
		WebElement Train2 =driver.findElement(By.xpath("//table[@class='nocps fullw bx0s rnd5']/tbody/tr[5]/td/div/table/tbody/tr/td/span"));
		String ActrainTrain2=Train2.getText();
		System.out.println(ActrainTrain2);
		
		WebElement Train3 =driver.findElement(By.xpath("//table[@class='nocps fullw bx0s rnd5']/tbody/tr[6]/td/div/table/tbody/tr/td/span"));
		String ActrainTrain3=Train3.getText();
		System.out.println(ActrainTrain3);
		driver.quit();
		
	}

}
