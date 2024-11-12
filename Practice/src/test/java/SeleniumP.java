import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class SeleniumP {
	@Test
	public void test() {
		 // object of EdgeOptions
	      EdgeOptions opt = new EdgeOptions();

	      // browser in headless mode
	      opt.addArguments("--headless=new");

	      // Initiate the Webdriver
	      WebDriver driver = new EdgeDriver(opt);

	      // adding implicit wait of 10 secs
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      // Opening the webpage with headless mode
	      driver.get("https://www.tutorialspoint.com/");

	      // getting page title
	      System.out.println("Getting the page title: " + driver.getTitle());

	      // Quit browser
	      driver.quit();
	      
	      Actions act = new Actions(driver);
	      act.doubleClick();
	      
	      

		
	}

}
