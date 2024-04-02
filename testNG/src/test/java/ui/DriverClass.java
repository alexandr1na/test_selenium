package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverClass {
	
	public static WebDriver driverFirefox;
	
	@BeforeTest
	public void LaunchDriver() {
		
		WebDriverManager.firefoxdriver().setup();
		driverFirefox = new FirefoxDriver();
		Reporter.log("Acest text e generat prin log-uri");
		
	}
}