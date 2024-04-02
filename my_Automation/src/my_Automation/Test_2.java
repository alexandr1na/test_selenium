package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) {
		
		//XPath
				ChromeDriver driverChrome = new ChromeDriver();
				driverChrome.get("https://samsung.com/uk/");
				driverChrome.manage().window().maximize();
				driverChrome.findElement(By.xpath("//*[@id=\"truste-consent-button\"]")).click();
		
		
		

		//driverChrome.get("https://www.darwin.md");
				
				
//				driverChrome.get("https://enter.online/");
//				driverChrome.manage().window().maximize();
//				
//				//ID Locator
//				driverChrome.findElement(By.id("search")).click();
//				driverChrome.findElement(By.id("search")).sendKeys("aparat");
//				driverChrome.findElement(By.id("search-icon")).click();
//				
				
				//Class Name Locator
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.amazon.com");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.className("nav-link")).click();
//		
				
				//Name Locator
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https:www.olx.ro/moda-frumusete/ceasuri/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.id("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.name("location-Field")).click();
						
		
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.aliexpress.com");
//		driverChrome.manage().window().maximize();
//		//driverChrome.findElement(By.id("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.name("description")).click();
//						
//	
//		
				//Link Text Locator
//				driverChrome.get("https://selenium.dev/documentation");
//				driverChrome.manage().window().maximize();
//				driverChrome.findElement(By.linkText("W3C WebDriver specification")).click();

				//PartialText Locator
//				driverChrome.get("https://selenium.dev/documentation");
//				driverChrome.manage().window().maximize();
//				driverChrome.findElement(By.partialLinkText("W3C WebDriver")).click();
//				
//				//Tag name Locator
//				driverChrome.get("https://lamborghini.com");
//				driverChrome.manage().window().maximize();
//				driverChrome.findElement(By.id("onetrust-accept-btn-handler")).click();
//				driverChrome.findElement(By.tagName("li")).click();
				
	}

}
