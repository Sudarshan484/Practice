import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.openqa.selenium.*;



public class Practice {
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("9028777484");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.xpath("//*[@id=\"u_0_5_9o\"]")).click();

	}

}
