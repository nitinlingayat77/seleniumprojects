package Parallel;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabs {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\TestData\\signupData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String FirstName1=(prop.getProperty("FirstName"));
		String LastName1=(prop.getProperty("LastName"));
		String postalcode=(prop.getProperty("PostalCode"));
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\JavaClass\\Selenium_Basics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
		//username
	    WebElement users=driver.findElement(By.xpath("//div[@id='login_credentials']"));
	    String Usertext= users.getText();
	    System.out.println(Usertext);
	    String[] splitUsername=Usertext.split("\\n");
	    String getUsername =splitUsername[1];
	    System.out.println(getUsername);
		WebElement userN=driver.findElement(By.id("user-name"));
		System.out.println("Is First name field displayed- " +userN.isDisplayed());
		String exp_uName = "Username";
        String act_uName=userN.getAttribute("placeholder");
        if (exp_uName.equalsIgnoreCase(act_uName)) {
        	System.out.println("Default Name verified");
        }else {
        	System.out.println("Default Name incorrect");
        }
        System.out.println("Is First name field enabled -" + userN.isEnabled());
		userN.sendKeys(getUsername);
		
		//Password
		WebElement pwd1=driver.findElement(By.xpath("//div[@class='login_password']"));
		String pwd2=pwd1.getText();
		String[] pwd3=pwd2.split("\\n");
		String pwd4=pwd3[1];
		WebElement pwd =driver.findElement(By.id("password"));
		System.out.println("Is password field displayed "+pwd.isDisplayed());
		String exp_pwd = "Password";
        String act_pwd=pwd.getAttribute("placeholder");
        if (exp_pwd.equalsIgnoreCase(act_pwd)) {
        	System.out.println("Default Name verified");
        }else {
        	System.out.println("Default Name incorrect");
        }
		System.out.println("Is password field enabled "+pwd.isEnabled());
		System.out.println(pwd4);
		pwd.sendKeys(pwd4);
		
		//Login
        WebElement login=driver.findElement(By.id("login-button"));
        System.out.println("Is Login field displayed "+login.isDisplayed()); 
        String exp_loginN = "Login";
        String act_loginN=userN.getAttribute("value");
        if (exp_loginN.equalsIgnoreCase(act_loginN)) {
        	System.out.println("Default Name verified");
        }else {
        	System.out.println("Default Name incorrect");
        }
		System.out.println("Is Login field enabled "+login.isEnabled());
		login.click();
	
		Thread.sleep(2000);
		
		
		//2nd Page/////////////////////////////////////////////////////////////////////////////////////////////////
		//Product 1
		WebElement prodn1=driver.findElement(By.xpath("//a[@id='item_4_title_link']/div"));
		String productName1 =prodn1.getText();
		WebElement Acart1 =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println("Is Add to cart field displayed "+Acart1.isDisplayed());
		String exp_Acart1 = "ADD TO CART";
	    String act_Acart1=Acart1.getText();
	    if (exp_Acart1.equalsIgnoreCase(act_Acart1)) {
	        System.out.println("Default Name verified");
	    }else {
	        System.out.println("Default Name incorrect");
	    }
	    System.out.println("Is Add to cart field enabled "+Acart1.isEnabled());
	    Acart1.click();
	    String expadtcname="REMOVE";
	    WebElement actadtcname=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	    String Actpadttcname=actadtcname.getText();
	    if(expadtcname.equalsIgnoreCase(Actpadttcname)) {
	    	System.out.println("Name Verified after clicking");
	    }else {
	    	System.out.println("Incorrect name");
	    }
	    
	     //Product 2
	    WebElement prodn2=driver.findElement(By.xpath("//a[@id='item_0_title_link']/div"));
		String productName2 =prodn2.getText();
	    WebElement Acart2 =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
	    System.out.println("Is Add to cart field displayed "+Acart2.isDisplayed());
		String exp_Acart2 = "ADD TO CART";
	    String act_Acart2=Acart2.getText();
	    if (exp_Acart2.equalsIgnoreCase(act_Acart2)) {
	        System.out.println("Default Name verified");
	    }else {
	        System.out.println("Default Name incorrect");
	    }
	    System.out.println("Is Add to cart field enabled "+Acart2.isEnabled());
	    Acart2.click();
	    driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
	    String expadtcname1="REMOVE";
	    WebElement actadtcname1=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	    String Actpadttcname1=actadtcname1.getText();
	    if(expadtcname1.equalsIgnoreCase(Actpadttcname1)) {
	    	System.out.println("Default Name Verified after clicking");
	    }else {
	    	System.out.println("Incorrect Default name");
	    }
	    
	    Thread.sleep(2000);
	    //cart button------------------------
	    WebElement cart =driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[3]/a"));
	    System.out.println("Is Add to cart field displayed "+cart.isDisplayed());
        System.out.println("Is Add to cart field enabled "+cart.isEnabled());
	    cart.click();
	    
	    // 3RD page//////////////////////////////////////////////////////////////////////////////////
	    //Your Cart page
	    WebElement cartprod1=driver.findElement(By.xpath("//a[@id='item_4_title_link']/div"));
		String cartproduct2Name1 =cartprod1.getText();
		WebElement cartprod2=driver.findElement(By.xpath("//a[@id='item_0_title_link']/div"));
		String cartproduct2Name2 =cartprod2.getText();
		if (productName1.equalsIgnoreCase(cartproduct2Name1)) {
			System.out.println("Product 1 verified");
		}else {
			System.out.println("Incorrect Product 1");
		}
		if (productName2.equalsIgnoreCase(cartproduct2Name2)) {
			System.out.println("Product 2 verified");
		}else {
			System.out.println("Incorrect Product 2");
		}
		
        //Checkouts-------------------------------------
	    WebElement check =driver.findElement(By.id("checkout"));
	    System.out.println("Is checkout field displayed "+check.isDisplayed());
        String exp_check = "Checkout";
        String act_check=check.getText();
        if (exp_check.equalsIgnoreCase(act_check)) {
        	System.out.println("Default Name verified");
        }else {
        	System.out.println("Default Name incorrect");
        }
		System.out.println("Is checkout field enabled "+check.isEnabled());
		check.click();
		
		//4th Page/////////////////////////////////////////////////////////////////////////////////////////////////
	    WebElement fn=driver.findElement(By.id("first-name"));
	    System.out.println("Is First Name field Displayed " +fn.isDisplayed());
	    System.out.println("Is First Name field Enabled " +fn.isEnabled());
	    String Expfn="First Name";
	    String Actfn =fn.getAttribute("placeholder");
	    if(Expfn.equalsIgnoreCase(Actfn)) {
	    	System.out.println("Placeholder Verified");
	    }else {
	    	System.out.println("Placeholder not verified");
	    }
	    fn.sendKeys(FirstName1);
	    
	    WebElement ln=driver.findElement(By.id("last-name"));
	    System.out.println("Is Last Name field Displayed " +ln.isDisplayed());
	    System.out.println("Is Last Name field Enabled " +ln.isEnabled());
	    String Expln="Last Name";
	    String Actln =ln.getAttribute("placeholder");
	    if(Expln.equalsIgnoreCase(Actln)) {
	    	System.out.println("Placeholder Verified");
	    }else {
	    	System.out.println("Placeholder not verified");
	    }
	    ln.sendKeys(LastName1);
	    
	    WebElement pc=driver.findElement(By.id("postal-code"));
	    System.out.println("Is Postal code field Displayed " +pc.isDisplayed());
	    System.out.println("Is Postal code field Enabled " +pc.isEnabled());
	    String Exppc="Zip/Postal Code";
	    String Actpc =pc.getAttribute("placeholder");
	    if(Exppc.equalsIgnoreCase(Actpc)) {
	    	System.out.println("Placeholder Verified");
	    }else {
	    	System.out.println("Placeholder not verified");
	    }
	    pc.sendKeys(postalcode);
	    
	    WebElement cn=driver.findElement(By.id("continue"));
	    System.out.println("Is continue button Displayed " +cn.isDisplayed());
	    System.out.println("Is continue button field Enabled " +cn.isEnabled());
	    String ExpcontinueB ="continue";
	    String ActcontinueB=cn.getAttribute("name");
	    if(ExpcontinueB.equalsIgnoreCase(ActcontinueB)) {
	    	System.out.println("Name of continue button verified");
	    }else {
	    	System.out.println("Name of continue button is incorrect");
	    }
	    cn.click();
	    
	    //5th page/////////////////////////////////////////////////////////////////////////////////
	    //Product 1 Price-------------------------
	    WebElement cartprice1 =driver.findElement(By.xpath("//div[@class='cart_item_label']/div/div"));
	    System.out.println("Is Product 1 price field displayed "+cartprice1.isDisplayed());
	    String cartp1=(cartprice1.getText());
	    //System.out.println(cartp2);
	    String[] cartpp1=cartp1.split(Pattern.quote("$"));
	    String getPrice1 =cartpp1[1];
        //System.out.println(getPrice1);
        String s= getPrice1;
        double i=Double.parseDouble(s);
        System.out.println(i);
	    
        //Product 2 Price-------------------------
        WebElement cartprice2 =driver.findElement(By.xpath("//div[@class='summary_info']//preceding::div[1]"));
	    System.out.println("Is Product 2 price field displayed "+cartprice2.isDisplayed());
	    String cartp2=(cartprice2.getText());
	    //System.out.println(cartp3);
	    String[] cartpp2=cartp2.split(Pattern.quote("$"));
	    //System.out.println(cartp3);
	    String getPrice2 =cartpp2[1];
	    String s1= getPrice2;
        double i1=Double.parseDouble(s1);
        System.out.println(i1);
        double expTotal=(i+i1);
        
        //Total -------------------------- 
	    WebElement total= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
	    System.out.println("Is Total field displayed "+total.isDisplayed());
	    String total1=(total.getText());
	    //System.out.println(cartp2);
	    String[] total2=total1.split(Pattern.quote("$"));
	    String getTotal =total2[1];
        //System.out.println(getPrice1);
        String s3= getTotal;
        double i2=Double.parseDouble(s3);
        double actTotal=(i2);
        if(expTotal==actTotal) {
        	System.out.println("Total Verified- "+ actTotal);
        }else{
        	System.out.println("Total Incorrect");
        }
        
        //Logout------------------------
        WebElement log=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        System.out.println("Is Menu button Displayed " +log.isDisplayed());
	    System.out.println("Is Menu button field Enabled " +log.isEnabled());
        log.click();
        
        WebElement log1=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        System.out.println("Is Logout button Displayed " +log1.isDisplayed());
	    System.out.println("Is Logout button field Enabled " +log1.isEnabled());
	    String explogtext="Logout";
	    String actlogtext=log1.getText();
	    //System.out.println(actlogtext);
	    if(explogtext.equalsIgnoreCase(actlogtext)) {
	    	System.out.println("Name of logout field verified");
	    }else {
	    	System.out.println("Name incorrect");
	    }
        log1.click();
        
        
	    
	}
	

}
