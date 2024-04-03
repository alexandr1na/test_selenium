package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test_Case_0 {
    public static void main(String[] args) throws InterruptedException {
    	//Codul de creare a unui cont nou -> se va rula doar o data, la inceput
    	ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://magento.softwaretestingboard.com");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
		driverChrome.findElement(By.cssSelector("#firstname")).sendKeys("ANA"+System.currentTimeMillis());
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("//input[@id='lastname']")).sendKeys("BUSUIOC"+System.currentTimeMillis());
		driverChrome.findElement(By.xpath("//input[@id='email_address']")).sendKeys("busuioc.ana"+System.currentTimeMillis()+"@gmail.com");
		driverChrome.findElement(By.xpath("//input[@id='password']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("auto_ANA9");
		driverChrome.findElement(By.xpath("//button[@title='Create an Account']")).click();
		Thread.sleep(3000);
    }
 }