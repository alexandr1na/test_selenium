package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home_3 {

	public static void main(String[] args) {
		// Analizati un site preferat si scrieti un script care sa contina: 1 Absolute XPath, 
		// 1 Relative XPATH, 1 starts-with, 1 contains, 1 text(), 1 and, 1 or
		
		
		//Homework 3
				ChromeDriver driverChrome = new ChromeDriver();
				driverChrome.get("https://ebay.com/");
				driverChrome.manage().window().maximize();
				driverChrome.findElement(By.xpath("//a[normalize-space()='register']")).click();
				driverChrome.findElement(By.xpath("//input[@id='firstname']")).sendKeys("ana");
				driverChrome.findElement(By.xpath("//input[@id='lastname']")).sendKeys("busuioc");
				driverChrome.findElement(By.xpath("//input[@id='Email']")).sendKeys("busuioc.ana333@gmail.com");
				driverChrome.findElement(By.xpath("//input[@id='password']")).sendKeys("auto_ANA9");
				driverChrome.findElement(By.xpath("//button[@id='EMAIL_REG_FORM_SUBMIT']")).click();
//				driverChrome.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts");
//				driverChrome.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
//				//XPATH=//tagname[@Attribute=’Value’ or @Attribute=’Value’]
//				driverChrome.findElement(By.xpath("//label[@for='s0-53-13_incl_desc' or @class='checkbox']")).click();
//				//XPATH=//tagname[@Attribute=’Value’ and @Attribute=’Value’]
//				driverChrome.findElement(By.xpath("//input[@id='gh-ac' or @class='gh-tb ui-autocomplete-input']")).sendKeys("rings");
//				driverChrome.findElement(By.xpath("//input[starts-with(@id, 'gh-b')]")).click();
//				driverChrome.findElement(By.xpath("//div[contains(@role, 'ton')]")).click();
//				driverChrome.findElement(By.xpath("//a[text()=' Sell']")).click();
				
				
		
		
//		//XPath Relative Locator
//		driverChrome.get("https://apple.com/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//span[@class='globalnav-link-text-container']")).click();
		
//		//XPath Absolute Locator
//		driverChrome.get("https://apple.com/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("/html/body/div/nav/div/ul/li/div/div/div/ul/li/a/span")).click();
		
//		//XPATH starts-with
//		//tagname[starts-with(@Attribute, 'value']
//		driverChrome.get("https://lamborghini.com");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.id("onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.xpath("//li[starts-with(@id, 'lev')]")).click();
		
//		//XPATH ends-with
//		//tagname[ends-with(@Attribute, 'value']
//		driverChrome.get("https://lamborghini.com");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.id("onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.xpath("//li[ends-with(@id,'-1-0')]")).click();
		
//		//XPATH contains
//		//tagname[contains(@Attribute, 'value']
//		driverChrome.get("https://lamborghini.com");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.id("onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.xpath("//li[contains(@id, '-1-')]")).click();
		
//		//XPATH  text()
//		//tagname[text()='actual text']
//		driverChrome.get("https://enter.online");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//a[text()='Noutăți'")).click();
		
//		XPath AND
//		XPATH=//tagname[@Attribute=’Value’ and @Attribute=’Value’]
		
//		XPath OR
//		XPATH=//tagname[@Attribute=’Value’ or @Attribute=’Value’]

	}

}
