package my_Automation;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// #25 dropdowns_2_Auto-sugestion
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.makemytrip.com");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Sydney");
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).sendKeys(Keys.ENTER);


		
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
		
//      27. Scrolling		
//		driverChrome.get("https://www.sugarcrm.com/uk/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//		driverChrome.findElement(By.xpath("//"[@id=\"menu-item-22276\"]/a")).click();
//scrolling
		
//		driverChrome.get("https://www.sugarcrm.com/uk/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//		WebElement customerStories = driverChrome.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/div/div[3]/div/div/a"));
//		Actions actions = new Actions(driverChrome);
//		actions.moveToElement(customerStories);
//		actions.perform();
		
//      Radio Butoane
//		driverChrome.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"sia-header\"]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
//		driverChrome.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[1]/li[2]/div/div/span")).click();		
//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
//		Thread.sleep(3000);
//		driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).click();
//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
//		
//      IFrame
//		driverChrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driverChrome.manage().window().maximize();
//		driverChrome.switchTo().frame(2);
//		driverChrome.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
//alert
		
//		driverChrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driverChrome.manage().window().maximize();
//		driverChrome.switchTo().frame(1);
//		driverChrome.findElement(By.xpath("/html/body/button")).click();
//		System.out.println(driverChrome.switchTo().alert().getText()); // daca dorim sa fie printat acest text
//		Thread.sleep(4000);
//		driverChrome.switchTo().alert().accept();
		
// Hover mouse
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		WebElement menuMotors = driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
//		Actions mouseHover = new Actions(driverChrome);
//		mouseHover.moveToElement(menuMotors).perform();
		
		//dragANDdrop
		
//		driverChrome.get("https://jqueryui.com/droppable/");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(3000);
//		driverChrome.switchTo().frame(0);
//		WebElement squareOne = driverChrome.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement squareTwo = driverChrome.findElement(By.xpath("//*[@id=\"droppable\"]"));
//		
//		Actions drag = new Actions(driverChrome);
//		drag.dragAndDrop(squareOne, squareTwo).perform();
		
//		//right click
//		
//				driverChrome.get("https://www.ebay.com/");
//				driverChrome.manage().window().maximize();
//				Thread.sleep(3000);
//				WebElement product = driverChrome.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/a/div/div"));
//				
//				Actions scrollingDown = new Actions(driverChrome);
//				scrollingDown.moveToElement(product);
//				scrollingDown.perform();
//				
//				Actions rightClick = new Actions(driverChrome);
//				rightClick.contextClick(product).perform();
		
		//Keyboard Events
		//#34 KeyboardEvents
		
//				driverChrome.get("https://extendsclass.com/text-compare.html");
//				driverChrome.manage().window().maximize();
//				WebElement firstTextArea = driverChrome.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre"));
//				Actions action = new Actions(driverChrome);
//				Thread.sleep(4000);
//				action.keyDown(firstTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//				WebElement secondTextArea = driverChrome.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre"));
//				Thread.sleep(4000);
//				action.keyDown(secondTextArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
//				
//				//exemplu_2
//				driverChrome.get("https://www.facebook.com/");
//				driverChrome.manage().window().maximize();
//				driverChrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
//				Thread.sleep(4000);
//				driverChrome.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("Dumitru");
//				WebElement firstName = driverChrome.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
//				Actions action = new Actions(driverChrome);
//				Thread.sleep(4000);
//				action.keyDown(firstName, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//				WebElement lastName = driverChrome.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
//				Thread.sleep(4000);
//				action.keyDown(lastName, Keys.CONTROL).sendKeys("v").build().perform();
//				
//				
	// Implicit Wait
				
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.ebay.com/");
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement menuFashion = driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
		Actions mouseHover = new Actions(driverChrome);
		mouseHover.moveToElement(menuFashion).perform();
		driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[3]/a")).click();
	
	// Explicit Wait
		
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driverChrome, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[3]/a"))).click();
//				
//	Fluent Wait	
//		Wait<WebDriver> waitFluent= new FluentWait<WebDriver>(driverChrome)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("This is a custom message")
//				.ignoring(NoSuchElementException.class); 
		
		
	// #35 FluentWait
		
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement menuFashion = driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
//		Actions mouseHover = new Actions(driverChrome);
//		mouseHover.moveToElement(menuFashion).perform();
//		
//		Wait<WebDriver> waitFluent= new FluentWait<WebDriver>(driverChrome)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("This is a custom message")
//				.ignoring(NoSuchElementException.class); 
//		
//		driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[3]/a")).click();
		
		
		// #39 Screenshots
		//importam org.openqa.selenium.NoSuchElementException;
				
//		FileUtils.copyFile(screenshotFile1, new File(".//screenshot/" + currentDate.toString().replace(":", "-").replace(" ", "-").replace("-EET-2024", "") + ".png")); //salveaza fisieerul 
				










	}

}
