package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_5 {

	public static void main(String[] args) throws InterruptedException {
		
		//Test pentru creare cont pe olx.ro
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://olx.ro");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		driverChrome.findElement(By.xpath("//a[@class='css-12l1k7f']")).click();
//		driverChrome.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("busuioc.ana333@gmail.com");
//		driverChrome.findElement(By.xpath("//input[@name='password']")).sendKeys("auto_ANA9");
		
		
		
		
		//driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div[2]/div[2]/div[2]/form/div[1]/div/div/input")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div[2]/div[2]/div[2]/form/div[1]/div/div/input")).sendKeys("busuioc.ana333@gmail.com");
		driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div[2]/div[2]/div[2]/form/div[2]/div/div/div/input")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div[2]/div[2]/div[2]/form/div[2]/div/div/div/input")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div[2]/div[2]/div[2]/form/button[2]/span/span")).click();
		driverChrome.findElement(By.xpath("/html/body/div[2]/header/div/a/span")).click();
		
		/*
		driverChrome.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts");
		driverChrome.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
		//XPATH=//tagname[@Attribute=’Value’ or @Attribute=’Value’]
		driverChrome.findElement(By.xpath("//label[@for='s0-53-13_incl_desc' or @class='checkbox']")).click();
		//XPATH=//tagname[@Attribute=’Value’ and @Attribute=’Value’]
		driverChrome.findElement(By.xpath("//input[@id='gh-ac' or @class='gh-tb ui-autocomplete-input']")).sendKeys("rings");
		driverChrome.findElement(By.xpath("//input[starts-with(@id, 'gh-b')]")).click();
		driverChrome.findElement(By.xpath("//div[contains(@role, 'ton')]")).click();
		driverChrome.findElement(By.xpath("//a[text()=' Sell']")).click(); 
		*/
	}

}
