package DropdownList;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_dropdown {

	public static void main(String[] args) throws  IOException, InterruptedException {
		FileInputStream fis=new FileInputStream(".\\TestData\\signupData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String pageurl1=(prop.getProperty("PageUrl"));
		String FirstName1=(prop.getProperty("FirstName"));
		String LastName1=(prop.getProperty("LastName"));
		String Adress1=(prop.getProperty("Adress"));
		String EmailAddress1=(prop.getProperty("EmailAddress"));
		String Phone1=(prop.getProperty("Phone"));
		String Password1=(prop.getProperty("Password"));
		String ConfirmPassword1=(prop.getProperty("ConfirmPassword"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(pageurl1);
        String exp_Title = "Register";
        String act_Title=driver.getTitle();
        System.out.println(act_Title);
        if (exp_Title.equalsIgnoreCase(act_Title)) {
        	System.out.println("Title verified");
        }else {
        	System.out.println("Title incorrect");
        }
        WebElement FirstName =driver.findElement(By.xpath("//input[@placeholder='First Name']")); 
        System.out.println("Is First name field displayed- " + FirstName.isDisplayed());
        System.out.println("Is First name field enabled -" + FirstName.isEnabled());
        FirstName.sendKeys(FirstName1);
        String exp_NameField = "First Name";
        String act_NameField=FirstName.getAttribute("placeholder");
        if (exp_NameField.equalsIgnoreCase(act_NameField)) {
        	System.out.println("Name verified");
        }else {
        	System.out.println("Name incorrect");
        }
        
        WebElement LastName =driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        System.out.println("Is last name field displayed -" + LastName.isDisplayed());
        System.out.println("Is last name field enabled -" +LastName.isEnabled());
        String exp_NameField1 = "Last Name";
        String act_NameField1=LastName.getAttribute("placeholder");
        
        if (exp_NameField1.equalsIgnoreCase(act_NameField1)) {
        	System.out.println("Name verified");
        }else {
        	System.out.println("Name incorrect");
        }
        LastName.sendKeys(LastName1);
        
        WebElement Adress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        System.out.println("Is Adress  field displayed -" +Adress.isDisplayed());
        System.out.println("Is Adress field enabled -" +Adress.isEnabled());
        Adress.sendKeys(Adress1);
        //System.out.println(Adress.getAttribute("class"));
        
        WebElement Email=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        System.out.println("Is Email field displayed -" +Email.isDisplayed());
        System.out.println("Is Email field enabled -" +Email.isEnabled());
        Email.sendKeys(EmailAddress1);
        
        WebElement Phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        System.out.println("Is Phone field displayed -" +Phone.isDisplayed());
        System.out.println("Is Phone field enabled -" +Phone.isEnabled());
        Phone.sendKeys(Phone1);
        
        WebElement Gender=driver.findElement(By.xpath("//input[@value='Male']"));
        System.out.println("Is Gender field displayed -" +Gender.isDisplayed());
        System.out.println("Is Gender field enabled -" +Gender.isEnabled());
        System.out.println("Is Gender field Selected -" +Gender.isSelected());
        Gender.click();
        System.out.println("Is Gender field Selected -" +Gender.isSelected());
        
        WebElement Hobbies=driver.findElement(By.id("checkbox1"));
        System.out.println("Is Hobbies field displayed -" +Hobbies.isDisplayed());
        System.out.println("Is Hobbies field enabled -" +Hobbies.isEnabled());
        System.out.println("Is Hobbies field Selected -" +Hobbies.isSelected());
        Hobbies.click();
        System.out.println("Is Hobbies field Selected -" +Hobbies.isSelected());
        
        WebElement Hobbies1=driver.findElement(By.id("checkbox2"));
        System.out.println("Is Hobbies1 field displayed -" +Hobbies1.isDisplayed());
        System.out.println("Is Hobbies1 field enabled -" +Hobbies1.isEnabled());
        System.out.println("Is Hobbies1 field Selected -" +Hobbies1.isSelected());
        Hobbies1.click();
        System.out.println("Is Hobbies1 field Selected -" +Hobbies1.isSelected());
        
        WebElement Hobbies2=driver.findElement(By.id("checkbox3"));
        System.out.println("Is Hobbies2 field displayed -" +Hobbies2.isDisplayed());
        System.out.println("Is Hobbies2 field enabled -" +Hobbies2.isEnabled());
        System.out.println("Is Hobbies2 field Selected -" +Hobbies2.isSelected());
        Hobbies2.click();
        System.out.println("Is Hobbies2 field Selected -" +Hobbies2.isSelected());
        
        WebElement Languages =driver.findElement(By.id("msdd"));
        Languages.click();
        List<WebElement> Languages1=driver.findElements(By.xpath("//multi-select/div/ul/li"));
        int LangListCount = Languages1.size();
        System.out.println(LangListCount);
        for(int i=0;i<LangListCount;i++) {
        	System.out.println(Languages1.get(i).getText());
        }
        
        driver.findElement(By.xpath("//multi-select/div/ul/li[8]/a")).click();
        driver.findElement(By.xpath("//multi-select/div/ul/li[16]/a")).click();
        
        WebElement skills =driver.findElement(By.id("Skills")); 
        Select s1 = new Select(skills);
        System.out.println("Is skills field multiple dwopdown "+s1.isMultiple());
        System.out.println("Is skills  field displayed -" +skills.isDisplayed());
        System.out.println("Is skills field enabled -" +skills.isEnabled());
        System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByIndex(2);
		s1.selectByVisibleText("SQL");
		System.out.println(s1.getFirstSelectedOption().getText());
		
		WebElement Country =driver.findElement(By.xpath("//select[@id='countries']"));
		Select s2 = new Select(Country);
		System.out.println("Is Country field multiple dwopdown "+s2.isMultiple());
        System.out.println(s2.getFirstSelectedOption().getText());
        System.out.println("Is Country  field displayed -" +Country.isDisplayed());
        System.out.println("Is Country field enabled -" +Country.isEnabled());
        
        WebElement SelectCountry =driver.findElement(By.xpath("//select[@id='country']"));
        System.out.println("Is SelectCountry  field displayed -" +SelectCountry.isDisplayed());
        System.out.println("Is SelectCountry field enabled -" +SelectCountry.isEnabled());
		Select s3 = new Select(SelectCountry);
		System.out.println("Is SelectCountry field multiple dwopdown "+s3.isMultiple());
        s3.selectByIndex(5);
        
        WebElement dofyear =driver.findElement(By.xpath("//select[@id='yearbox']"));
        System.out.println("Is dofyear  field displayed -" +dofyear.isDisplayed());
        System.out.println("Is dofyear field enabled -" +dofyear.isEnabled());
		Select s4 = new Select(dofyear);
        System.out.println(s4.getFirstSelectedOption().getText());
        s4.selectByValue("1995");
        System.out.println("Is dofyear field multiple dwopdown "+s4.isMultiple());
        System.out.println(s4.getFirstSelectedOption().getText());
        
        WebElement dofmonth=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        System.out.println("Is dofmonth  field displayed -" +dofmonth.isDisplayed());
        System.out.println("Is dofmonth field enabled -" +dofmonth.isEnabled());
		Select s5 = new Select(dofmonth);
		System.out.println("Is dofmonth field multiple dwopdown "+s5.isMultiple());
        System.out.println(s5.getFirstSelectedOption().getText());
        s5.selectByVisibleText("July");
        System.out.println(s5.getFirstSelectedOption().getText());
        
        WebElement dofday=driver.findElement(By.xpath("//select[@ng-model='daybox']"));
        System.out.println("Is dofday  field displayed -" +dofday.isDisplayed());
        System.out.println("Is dofday field enabled -" +dofday.isEnabled());
		Select s6 = new Select(dofday);
		System.out.println("Is dofday field multiple dwopdown "+s6.isMultiple());
        System.out.println(s6.getFirstSelectedOption().getText());
        s6.selectByIndex(7);
        System.out.println(s6.getFirstSelectedOption().getText());
        
        WebElement password =driver.findElement(By.xpath("//input[@id='firstpassword']"));
        System.out.println("Is Password field displayed- " + password.isDisplayed());
        System.out.println("Is Password field enabled -" + password.isEnabled());
        password.sendKeys(Password1);
        
        WebElement confirmPassword= driver.findElement(By.xpath("//input[@id='secondpassword']"));
        confirmPassword.sendKeys(ConfirmPassword1);
        WebElement submit= driver.findElement(By.id("submitbtn"));
        System.out.println("Is submit field displayed- " + submit.isDisplayed());
        System.out.println("Is submit field enabled -" + submit.isEnabled());
        submit.click();
        //driver.close();
        
	}

}
