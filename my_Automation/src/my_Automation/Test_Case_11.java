package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test_Case_11 {
	//Codul de plasare a unei comenzi pentru un utilizator logat fara alegerea unei metode de plata
    public static void main(String[] args) throws InterruptedException {
    	
    	ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driverChrome.findElement(By.xpath("//input[@id='email']")).sendKeys("busuioc.ana333@gmail.com");
		driverChrome.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
		
		driverChrome.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
		driverChrome.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");	
		driverChrome.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//a[@class='action showcart']")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(3000);

		//press "Next"
		driverChrome.findElement(By.cssSelector("#shipping-method-buttons-container > div > button")).click();	
		
    }
}
  