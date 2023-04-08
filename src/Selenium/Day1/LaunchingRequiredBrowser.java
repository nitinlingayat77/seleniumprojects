package Selenium.Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingRequiredBrowser {

	public static void main(String[] args) {
		LaunchingRequiredBrowser.launchingrequiredbrowser("firefox");
		LaunchingRequiredBrowser.launchingrequiredbrowser("chrome");
		LaunchingRequiredBrowser.launchingrequiredbrowser("ie");
		}
	static void launchingrequiredbrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			ChromeDriver CD = new ChromeDriver();
			//CD.close();
		}else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
			InternetExplorerDriver ID = new InternetExplorerDriver();
			//ID.close();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
			FirefoxDriver FD = new FirefoxDriver();
			//FD.close();
		}
		
		

	}

}
