package Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Selenium.*;

public class Logintest {
	
	WebDriver driver;
	
	
	
	
	@Test(dataProvider ="logindata", dataProviderClass = Testdata.Logindata.class)
	
	public void login(String username, String pass) {
		driver= new ChromeDriver();
		driver.get("https://facebook.com/login/");
		Login_page lp = new Login_page(driver);
		lp.enterUername(username);
		lp.enterPassword(pass);
		lp.clickOnLoginButton();
		driver.close();
	}
	

}
