package my_Automation;

import org.openqa.selenium.By;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Home_8 {

	public static void main(String[] args) throws InterruptedException {

////      25 dropdowns_Auto-sugestion
		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.jw.org/ro/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("/html/body/div[5]/div/div/header/div[4]/a[1]/span[3]")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys("Italiana");
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[1]/div/input")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys(Keys.ENTER);
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"mid1011200\"]/div[1]/div/div/button[2]")).click();
//		Thread.sleep(4000);
//		
////      27. Scrolling
//		WebElement new_page = driverChrome.findElement(By.xpath("/html/body/div[7]/div/div/main/div[4]/div/a[5]/div"));
//		Actions actions = new Actions(driverChrome);
//		actions.moveToElement(new_page);
//		actions.perform();
//		
////      33. right click
//		Thread.sleep(4000);
//		Actions rightClick = new Actions(driverChrome);
//		rightClick.contextClick(new_page).perform();
//		
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("/html/body/div[7]/div/div/main/div[4]/div/a[5]/div")).click();
//		Thread.sleep(4000);
//		driverChrome.quit();
		
//		28 Radio Butoane
		driverChrome.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.xpath("//*[@id=\"sia-header\"]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
		driverChrome.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[1]/li[2]/div/div/span")).click();		
		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).click();
		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
		
	}
}		
		
        //dropdowns and autosuggestions
//		driverChrome.get("https://md.iherb.com/");	
//		driverChrome.manage().window().maximize();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys("vitamin");
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys(Keys.ARROW_DOWN);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys(Keys.ENTER);


//		26. CheckBox interaction
//		driverChrome.get("https://www.sugarcrm.com/uk/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//		Thread.sleep(5000);
//		driverChrome.findElement(By.xpath("//*[@id=\"doi0\"]")).click();
		
		
//      28 Radio Butoane
//		driverChrome.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"sia-header\"]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
//		driverChrome.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[1]/li[2]/div/div/span")).click();		
//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
//		Thread.sleep(3000);
//		driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).click();
//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
//		
//      29 IFrame
//		driverChrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driverChrome.manage().window().maximize();
//		driverChrome.switchTo().frame(2);
//		driverChrome.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
//30 alert
		
//		driverChrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driverChrome.manage().window().maximize();
//		driverChrome.switchTo().frame(1);
//		driverChrome.findElement(By.xpath("/html/body/button")).click();
//		System.out.println(driverChrome.switchTo().alert().getText()); // daca dorim sa fie printat acest text
//		Thread.sleep(4000);
//		driverChrome.switchTo().alert().accept();
		
//31 Hover mouse
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		WebElement menuMotors = driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
//		Actions mouseHover = new Actions(driverChrome);
//		mouseHover.moveToElement(menuMotors).perform();
		
		//32 dragANDdrop
		
//		driverChrome.get("https://jqueryui.com/droppable/");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(3000);
//		driverChrome.switchTo().frame(0);
//		WebElement squareOne = driverChrome.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement squareTwo = driverChrome.findElement(By.xpath("//*[@id=\"droppable\"]"));
//		
//		Actions drag = new Actions(driverChrome);
//		drag.dragAndDrop(squareOne, squareTwo).perform();
		
		//33 right click
//		
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(3000);
//		WebElement product = driverChrome.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/a/div/div"));
//				
//		Actions scrollingDown = new Actions(driverChrome);
//		scrollingDown.moveToElement(product);
//		scrollingDown.perform();
//				
//		Actions rightClick = new Actions(driverChrome);
//		rightClick.contextClick(product).perform();
		
		
		// #39 Screenshots

		
	



