package Parallel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import MouseActions.*;
public class oct5Crickinfo {
	public static void main(String[] args) {
		ma1.setup("https://www.espncricinfo.com/");
		WebElement livescore=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[1]/a"));
		System.out.println("Is livescore field displayed -"+livescore.isDisplayed());
		System.out.println("Is livescore field enabled -"+livescore.isEnabled());
		String ExpNameoflivescorefield="Live Scores";
		String ActNameoflivescorefield=livescore.getAttribute("title");
		if (ExpNameoflivescorefield.equalsIgnoreCase(ActNameoflivescorefield)) {
			System.out.println("Name Verified-- "+ActNameoflivescorefield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(livescore);
		ma1.mouseRightclick(livescore);
		
		WebElement series=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[2]/a"));
		System.out.println("Is series field displayed -"+series.isDisplayed());
		System.out.println("Is series field enabled -"+series.isEnabled());
		String ExpNameofseriesfield="Series";
		String ActNameofseriesfield=series.getAttribute("title");
		if (ExpNameofseriesfield.equalsIgnoreCase(ActNameofseriesfield)) {
			System.out.println("Name Verified-- "+ActNameofseriesfield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(series);
		ma1.mouseRightclick(series);
		
		WebElement Teams=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[3]/a"));
		System.out.println("Is Teams field displayed -"+Teams.isDisplayed());
		System.out.println("Is Teams field enabled -"+Teams.isEnabled());
		String ExpNameofTeamsfield="Teams";
		String ActNameofTeamsfield=Teams.getAttribute("title");
		if (ExpNameofTeamsfield.equalsIgnoreCase(ActNameofTeamsfield)) {
			System.out.println("Name Verified-- "+ActNameofTeamsfield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(Teams);
		ma1.mouseRightclick(Teams);
		
		WebElement News=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[4]/a"));
		System.out.println("Is News field displayed -"+News.isDisplayed());
		System.out.println("Is News field enabled -"+News.isEnabled());
		String ExpNameofNewsfield="News";
		String ActNameofNewsfield=News.getAttribute("title");
		if (ExpNameofNewsfield.equalsIgnoreCase(ActNameofNewsfield)) {
			System.out.println("Name Verified-- "+ActNameofNewsfield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(News);
		ma1.mouseRightclick(News);
		
		WebElement Features=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[5]/a"));
		System.out.println("Is Features field displayed -"+Features.isDisplayed());
		System.out.println("Is Features field enabled -"+Features.isEnabled());
		String ExpNameofFeaturesfield="Features";
		String ActNameofFeaturesfield=Features.getAttribute("title");
		if (ExpNameofFeaturesfield.equalsIgnoreCase(ActNameofFeaturesfield)) {
			System.out.println("Name Verified-- "+ActNameofFeaturesfield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(Features);
		ma1.mouseRightclick(Features);
		
		WebElement Videos=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[6]/a"));
		System.out.println("Is Videos field displayed -"+Videos.isDisplayed());
		System.out.println("Is Videos field enabled -"+Videos.isEnabled());
		String ExpNameofVideosfield="Videos";
		String ActNameofVideosfield=Videos.getAttribute("title");
		if (ExpNameofVideosfield.equalsIgnoreCase(ActNameofVideosfield)) {
			System.out.println("Name Verified-- "+ActNameofVideosfield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(Videos);
		ma1.mouseRightclick(Videos);
		
		WebElement Stats=ma1.driver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']/li[7]/a"));
		System.out.println("Is Stats field displayed -"+Stats.isDisplayed());
		System.out.println("Is Stats field enabled -"+Stats.isEnabled());
		String ExpNameofStatsfield="Stats";
		String ActNameofStatsfield=Stats.getAttribute("title");
		if (ExpNameofStatsfield.equalsIgnoreCase(ActNameofStatsfield)) {
			System.out.println("Name Verified-- "+ActNameofStatsfield);
		}else {
			System.out.println("Name Incorrect");
		}
		ma1.mouseoverActions(Stats);
		ma1.mouseRightclick(Stats);
	}

}
