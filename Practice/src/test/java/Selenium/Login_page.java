package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	@FindBy(id= "email")
	WebElement username;
	@FindBy (id = "pass")
	WebElement password;
	
	@FindBy(id= "loginbutton")
	WebElement loginButton;
	
	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUername(String str) {
		username.sendKeys(str);
	}
	
	public void enterPassword(String str) {
		password.sendKeys(str);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

}
