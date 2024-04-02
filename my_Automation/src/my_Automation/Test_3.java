package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//XPath
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://ff.md/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//span[starts-with(@class,'header__cart-cou')]")).click();
//

		
		//XPATH  text()
		//tagname[text()='actual text']
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://developer.salesforce.com/signup");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//a[text()='Salesforce Program Agreement'")).click();
		
		// XPATH=//tagname[@Attribute=’Value’ or @Attribute=’Value’]
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.darwin.md");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.xpath("//img[@alt='Ceasuri și brățări' or @width='104']")).click();
	}

}
