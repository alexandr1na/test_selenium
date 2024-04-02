package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderDemo {
	@Test(dataProvider="login",dataProviderClass=DataProviderText.class)
	public void providerData (String username, String password) throws InterruptedException {
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.saucedemo.com/");
		
		driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		
		driverChrome.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		
		driverChrome.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(5000);
		driverChrome.quit();
	}
//	@DataProvider(name="login")
//	public Object[][] providerDataSet() {
//		
//		return new Object[][] {
//			
//			{"standard_user", "secret_sauce"},
////			{"locked_out_user", "secret_sauce"},
////			{"problem_user", "secret_sauce"},
////			{"performance_glitch_user", "secret_sauce"},
////			{"error_user", "secret_sauce"},
////			{"visual_user", "secret_sauce"}
//			
//		};
//	}
}







