package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumUtilsPackage.SeleniumUtils;

public class First_Test extends SeleniumUtils {
  @BeforeTest
  public void A_browserlaunchingAndUrl() {
	  setup("https://demo.actitime.com/login.do"); 
  }
  
  @Test(priority=1,timeOut=250)
  public void LoginPage() {
	  WebElement username=driver.findElement(By.name("username"));
		System.out.println("Is username field Displayed " +username.isDisplayed());
	    System.out.println("Is username field Enabled " +username.isEnabled());
	    String Expusername="Username";
	    String Actusername =username.getAttribute("placeholder");
	    if(Expusername.equalsIgnoreCase(Actusername)) {
	    	System.out.println("Placeholder Verified");
	    }else {
	    	System.out.println("Placeholder not verified");
	    }
	    username.sendKeys("admin",Keys.TAB);
	    
	    
	    WebElement pwd=driver.findElement(By.name("pwd"));
	    System.out.println("Is pwd field Displayed " +pwd.isDisplayed());
	    System.out.println("Is pwd field Enabled " +pwd.isEnabled());
	    String Exppwd="Password";
	    String Actpwd =username.getAttribute("placeholder");
	    if(Exppwd.equalsIgnoreCase(Actpwd)) {
	    	System.out.println("Placeholder Verified");
	    }else {
	    	System.out.println("Placeholder not verified");
	    }
	    pwd.sendKeys("manager",Keys.ENTER);
  }
  @Test(priority=2,enabled=false)
  public void CreateTask() throws InterruptedException {
	    WebElement tasks=driver.findElement(By.xpath("//div[@id='container_tasks']"));
		System.out.println("Is tasks field Displayed " +tasks.isDisplayed());
	    System.out.println("Is tasks field Enabled " +tasks.isEnabled());
	    tasks.click();
	    
		Thread.sleep(2000);
		WebElement Addtasks=driver.findElement(By.xpath("//div[@class='title ellipsis']"));
		System.out.println("Is Addtasks field Displayed " +Addtasks.isDisplayed());
	    System.out.println("Is Addtasks field Enabled " +Addtasks.isEnabled());
		String ExpAddtasks="Add New";
	    String ActAddtasks =Addtasks.getText();
	    if(ExpAddtasks.equalsIgnoreCase(ActAddtasks)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    Addtasks.click();
	    
	    WebElement Newtasks=driver.findElement(By.xpath("//div[@class='item createNewTasks']"));
	    System.out.println("Is Newtasks field Displayed " +Newtasks.isDisplayed());
	    System.out.println("Is Newtasks field Enabled " +Newtasks.isEnabled());
		String ExpNewtasks="+ New Tasks";
	    String ActNewtasks =Newtasks.getText();
	    if(ExpNewtasks.equalsIgnoreCase(ActNewtasks)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    Newtasks.click();
	    
		Thread.sleep(2000);
		WebElement Createtasks=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/div[3]"));
		System.out.println("Is Createtasks field Displayed " +Createtasks.isDisplayed());
	    System.out.println("Is Createtasks field Enabled " +Createtasks.isEnabled());
		String ExpCreatetasks="+ New Tasks";
	    String ActCreatetasks =Createtasks.getText();
	    if(ExpCreatetasks.equalsIgnoreCase(ActCreatetasks)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    Createtasks.click();
	    
		Thread.sleep(2000);
		WebElement SelectCustomer=driver.findElement(By.xpath("//div[@class='searchItemList']/div[3]"));
		System.out.println("Is SelectCustomer field Displayed " +SelectCustomer.isDisplayed());
	    System.out.println("Is SelectCustomer field Enabled " +SelectCustomer.isEnabled());
		String ExpSelectCustomer="Big Bang Company";
	    String ActSelectCustomer =SelectCustomer.getText();
	    if(ExpSelectCustomer.equalsIgnoreCase(ActSelectCustomer)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    SelectCustomer.click();
	    
	    WebElement SelectProject=driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/div[1]/div[3]"));
	    System.out.println("Is SelectProject field Displayed " +SelectProject.isDisplayed());
	    System.out.println("Is SelectProject field Enabled " +SelectProject.isEnabled());
	    String ExpSelectProject="- Select Project -";
	    String ActSelectProject =SelectProject.getText();
	    if(ExpSelectProject.equalsIgnoreCase(ActSelectProject)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    SelectProject.click();
	    
	    WebElement ProjectName=driver.findElement(By.xpath("//div[@class='searchItemList']//div[text()='Spaceship testing']"));
	    System.out.println("Is ProjectName field Displayed " +ProjectName.isDisplayed());
	    System.out.println("Is ProjectName field Enabled " +ProjectName.isEnabled());
	    String ExpProjectName="Big Bang Company";
	    String ActProjectName =ProjectName.getText();
	    if(ExpProjectName.equalsIgnoreCase(ActProjectName)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    ProjectName.click();
	    
	    WebElement Entertasks=driver.findElement(By.xpath("//td[@class='nameCell first']/input[1]"));
	    System.out.println("Is Entertasks field Displayed " +Entertasks.isDisplayed());
	    System.out.println("Is Entertasks field Enabled " +Entertasks.isEnabled());
	    String ExpEntertasks="Enter task name";
	    String ActEntertasks =Entertasks.getAttribute("placeholder");
	    if(ExpEntertasks.equalsIgnoreCase(ActEntertasks)) {
	    	System.out.println("Placeholder Verified");
	    }else {
	    	System.out.println("Placeholder not verified");
	    }
	    Entertasks.sendKeys("Testing");
	    
	    Thread.sleep(2000);
	    WebElement Typeofwork=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[2]"));
	    System.out.println("Is Typeofwork field Displayed " +Typeofwork.isDisplayed());
	    System.out.println("Is Typeofwork field Enabled " +Typeofwork.isEnabled());
	    String ExpTypeofwork="engineering";
	    String ActTypeofwork =Typeofwork.getText();
	    if(ExpTypeofwork.equalsIgnoreCase(ActTypeofwork)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    Typeofwork.click();
	    
		Thread.sleep(2000);
		WebElement TypeLabel=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]"));
		System.out.println("Is TypeLabel field Displayed " +TypeLabel.isDisplayed());
	    System.out.println("Is TypeLabel field Enabled " +TypeLabel.isEnabled());
		String ExpTypeLabel="research";
	    String ActTypeLabel =TypeLabel.getText();
	    if(ExpTypeLabel.equalsIgnoreCase(ActTypeLabel)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    TypeLabel.click();
	    
	    WebElement tasksbutton=driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/div[1]"));
	    System.out.println("Is tasksbutton field Displayed " +tasksbutton.isDisplayed());
	    System.out.println("Is tasksbutton field Enabled " +tasksbutton.isEnabled());
	    String Exptasksbutton="Create Tasks";
	    String Acttasksbutton =tasksbutton.getText();
	    if(Exptasksbutton.equalsIgnoreCase(Acttasksbutton)) {
	    	System.out.println("Name Verified");
	    }else {
	    	System.out.println("Name not verified");
	    }
	    tasksbutton.click();
  }
  
  @Test(priority=3,dependsOnMethods="LoginPage")
  public void LogoutClose() throws InterruptedException {
	  WebElement Logout = driver.findElement(By.id("logoutLink"));
	  System.out.println("Is Logout field Displayed " +Logout.isDisplayed());
	  System.out.println("Is Logout field Enabled " +Logout.isEnabled());
	  String ExpLogoutbutton="Logout";
	  String ActLogoutbutton =Logout.getText();
	  if(ExpLogoutbutton.equalsIgnoreCase(ActLogoutbutton)) {
	    System.out.println("Name Verified");
	  }else {
	   	System.out.println("Name not verified");
	  }
	  Logout.click();
	  Thread.sleep(3000);
  }
  @AfterTest
  public void Close() {
	  
	  driver.close();
	  
  }
}

