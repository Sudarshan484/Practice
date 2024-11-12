package Testdata;

import org.testng.annotations.DataProvider;

public class Logindata {
	
	@DataProvider(name = "logindata")
	public Object [][] logindata() {
		
		Object [][] data = new Object [][] {
		
			{"Sudarshan","123"},
			{"Sudarshan","abc"}
	};
	return data;

}
}
