package seleniumTraning;

import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		// #1 Get - fara ea nu poate exista un script in testarea automata

		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://olx.ro/");


		// #2 manage
		//driverChrome.get("https://olx.ro/");
		//driverChrome.manage().window().fullscreen(); // nu se intrebuinteaza asa des ca .maximize()


		// #3 getCurrentUrl
		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://olx.ro/");
		//driverChrome.manage().window().maximize();
		//String currentUrl = driverChrome.getCurrentUrl();
		//System.out.println("Adresa curenta este: " + currentUrl);
		//System.out.println("Prescurtare: syso control+backspace (mac)");


		// #4 getTtle
		//ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.get("https://sina.com.cn");
		//driverChrome.manage().window().maximize();
		//String currentTitle = driverChrome.getTitle();


		// #5 getPageSource - folosit rar, dar la interviuri se-ntreaba
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://olx.ro");
		//		driverChrome.manage().window().maximize();
		//		String pageSource = driverChrome.getPageSource();
		//		System.out.println("Codul sursa: " + pageSource);


		// #6 navigate
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://sina.com.cn");
		//		driverChrome.manage().window().maximize();
		//		String firstPageTitle = driverChrome.getTitle();
		//		System.out.println("Primul website: " + firstPageTitle);
		//		driverChrome.navigate().to("https://moonglow.md");
		//		String secondPageTitle = driverChrome.getTitle();
		//		System.out.println("Al doilea website: " + secondPageTitle);


		// #7 quit - inchide browserul indiferent de numarul de tab-uri deschise
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://olx.ro");
		//		driverChrome.manage().window().maximize();
		//		System.out.println("Pagina este accesata");
		//		Thread.sleep(3000);
		//		driverChrome.quit();
		//		System.out.println("Browser-ul s-a inchis");


		// #8 close - se inchide doar tab-ul curent. Dar daca e doar un tab deschis, se inchide tot browser-ul 
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://ebay.com");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.xpath("//*[@id=\"s0-1-0-39-1-3-5-10-0[2]-2-@match-media-0-@ebay-carousel-list\"]/li[1]/div/a/div/div[2]/h3")).click();
		//		Thread.sleep(5000);
		//		driverChrome.close(); //ce tab inchide?
		//		driverChrome.quit();


		// #9 findElement
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://ebay.com");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.xpath("//*[@id=\"s0-1-0-39-1-3-5-10-0[2]-2-@match-media-0-@ebay-carousel-list\"]/li[1]/div/a/div/div[2]/h3")).click();


		// #10 windowHandle - printeaza identificatorul unic al website-ului accesat in fereastra din browser
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://ebay.com");
		//		driverChrome.manage().window().maximize();
		//		String windowHandle = driverChrome.getWindowHandle();
		//		System.out.println(windowHandle);


		// #11 switchTo - poti sa te muti de la un tab la altul 
//				ChromeDriver driverChrome = new ChromeDriver();
//				driverChrome.get("https://point.md");
//				driverChrome.manage().window().maximize();
//				driverChrome.findElement(By.cssSelector("body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p")).click();
//				String firstPageTitle = driverChrome.getTitle();
//				System.out.println(firstPageTitle);
//		//		Thread.sleep(5000);
//				driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/a/div/div[1]")).click();
//				String secondPageTitle = driverChrome.getTitle();
//				System.out.println(secondPageTitle);
//				driverChrome.switchTo().window("Новости Молдовы - Point.md");
		//		

		// #12 sendKeys
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Elena");
		//		

		// #13 clear
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Elena");
		//		Thread.sleep(3000);
		//		driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();


		// #14 click - la interviu cand intreaba de click se are in vedere click stanga, nu dreapta
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Elena");
		//		Thread.sleep(3000);
		//		driverChrome.findElement(By.xpath("//*[@id=\"login-button\"]")).click();


		// #15 getAttribute
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).getAttribute("placeholder"));


		// #16 getCssValue
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).getCssValue("font-family"));



		// #17 getLocation - inseamna get position of the element on the page 
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).getLocation());


		// #18 getSize
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).getSize());


		// #19 getTagName
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"user-name\"]")).getTagName());


		// #20 getText
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")).getText());


		// #21 isDisplayed
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")).isDisplayed());


		// #22 isEnabled
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://saucedemo.com");
		//		driverChrome.manage().window().maximize();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")).isEnabled());


		// #23 isSelected - valabil pentru checkbox-uri sau radio buttons
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://www.sugarcrm.com/uk/contact/?utm_source=sugarcrm.com&utm_medium=referral");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"doi0\"]")).isSelected());
		//		Thread.sleep(8000);
		//		driverChrome.findElement(By.xpath("//*[@id=\"doi0\"]")).click();
		//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"doi0\"]")).isSelected());


		// #24 dropdowns
//				ChromeDriver driverChrome = new ChromeDriver();
//				driverChrome.get("https://www.sugarcrm.com/uk/contact/?utm_source=sugarcrm.com&utm_medium=referral");
//				driverChrome.manage().window().maximize();
//				driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//				WebElement ddown = driverChrome.findElement(By.name("awareness_source_c"));
//				Select selectedOption = new Select(ddown);
//				selectedOption.selectByValue("Podcast");
//				Thread.sleep(3000);
//				selectedOption.selectByIndex(5);
//				Thread.sleep(3000);
//				selectedOption.selectByVisibleText("YouTube");
				
				
				
		// #25 auto-suggestions dropdowns
		
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://makemytrip.com");
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
		
		
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://md.iherb.com/");	
//		driverChrome.manage().window().maximize();
//		
////dropdowns and autosuggestions
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys("vitamin");
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys(Keys.ARROW_DOWN);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("//*[@id=\"txtSearch\"]")).sendKeys(Keys.ENTER);
		
		
		
		// #26 checkbox
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.sugarcrm.com/uk/contact/?utm_source=sugarcrm.com&utm_medium=referral");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//		Thread.sleep(5000);
//		driverChrome.findElement(By.xpath("//*[@id=\"doi0\"]")).click();
		
		
		
		// #27 scrolling
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.sugarcrm.com/uk/contact/?utm_source=sugarcrm.com&utm_medium=referral");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//		Thread.sleep(5000);
//		WebElement footer = driverChrome.findElement(By.xpath("//*[@id=\"menu-item-24616\"]/a"));
//		Actions scrolling = new Actions(driverChrome);
//		scrolling.moveToElement(footer);
//		scrolling.perform();
		
		
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://moonglow.md/");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(5000);
//		WebElement footer = driverChrome.findElement(By.xpath("//*[@id=\"wd-6426abee794d0\"]/div/h2"));
//		Actions scrolling = new Actions(driverChrome);
//		scrolling.moveToElement(footer);
//		scrolling.perform();
		
		
		// #28 radio buttons
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://singaporeair.com/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"sia-header\"]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
//		driverChrome.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[1]/li[2]/div/div/span")).click();
//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
//		driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).click();
//		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]")).isSelected());
		
		
		// #29 iframe-uri 

//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
//		Thread.sleep(5000);
//		driverChrome.switchTo().frame(1);
//		Thread.sleep(5000);
//		driverChrome.findElement(By.xpath("/html/body/button")).click();
		
		
		// #30 alert
		// ce face metoda switchTo? switch to frame sau alert (interviu)
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
//		Thread.sleep(5000);
//		driverChrome.switchTo().frame(1);
//		Thread.sleep(5000);
//		driverChrome.findElement(By.xpath("/html/body/button")).click();
//		Thread.sleep(5000);
//		System.out.println(driverChrome.switchTo().alert().getText());
//		driverChrome.switchTo().alert().accept();
		
		
		// #31 mouse hover
		// cand facem action, mereu punem perform()
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		WebElement meniulMotors = driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
//		Actions mouseHover = new Actions(driverChrome);
//		mouseHover.moveToElement(meniulMotors).perform();
//		
		
		
		
		// #32 drag & drop on the web site
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://jqueryui.com/droppable/");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(3000);
//		driverChrome.switchTo().frame(0);
//		WebElement squareOne = driverChrome.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement squareTwo = driverChrome.findElement(By.xpath("//*[@id=\"droppable\"]"));
//		Actions drag = new Actions(driverChrome);
//		drag.dragAndDrop(squareOne, squareTwo).perform();
		
		
		// #33 right click
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.ebay.com/");
//		driverChrome.manage().window().maximize();
//		Thread.sleep(3000);
//		WebElement product = driverChrome.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/a/div/div"));
//		Actions scrollingDown = new Actions(driverChrome);
//		scrollingDown.moveToElement(product);
//		scrollingDown.perform();
//		Actions rightClick = new Actions(driverChrome);
//		rightClick.contextClick(product).perform();
		
		
		// #34 keyboard events
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.extendsclass.com/text-compare.html");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
//		WebElement firstTextArea = driverChrome.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]"));
//		Actions action = new Actions(driverChrome);
//		Thread.sleep(4000);
//		action.keyDown(firstTextArea, Keys.COMMAND).sendKeys("a").sendKeys("c").build().perform();
//		Thread.sleep(4000);
//		WebElement secondTextArea = driverChrome.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
//		action.keyDown(secondTextArea, Keys.COMMAND).sendKeys("v").build().perform();
		
		
		//  #35
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://www.facebook.com/");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
//		Thread.sleep(4000);
//		driverChrome.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("Dumitru");
//		WebElement firstName = driverChrome.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
//		Actions action = new Actions(driverChrome);
//		Thread.sleep(4000);
//		action.keyDown(firstName, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//		WebElement lastName = driverChrome.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
//		Thread.sleep(4000);
//		action.keyDown(lastName, Keys.CONTROL).sendKeys("v").build().perform();
		
		
		// #36 WAIT - implicitWait
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://ebay.com/");
//		driverChrome.manage().window().maximize();
//		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // care este diferenta fata de thread.sleep? nr maximal de sec pt ca Selenium sa incerce sa gaseasca de fiecare data urmatorul element. Daca o gasit intr-o sec, acceseaza elementul, spre deosebire de threadsleep
//		WebElement meniulFashion = driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
//		Actions mouseHover = new Actions(driverChrome);
//		mouseHover.moveToElement(meniulFashion).perform();
//		driverChrome.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[3]/a")).click();
		
		
//		

//		#37 EXPLICIT WAIT 
		// din telefon

		
		
		// #38 FLUENT WAIT - nu se intrebuinteaza pt ca sta un implicit wait la inceput de proiect 
		
		
		// #39 Screenshots
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://ebay.com/");
		driverChrome.manage().window().maximize();
		
		Date currentDate = new Date();
		System.out.println("Current date in old format: " + currentDate);
		
		String screenshotFileName = currentDate.toString().replace(":", "-").replace(" ", "-").replace("-EET-2024", "");
		System.out.println("Current date in new format: " + screenshotFileName);
		
		File screenshotFile1 = ((TakesScreenshot) driverChrome).getScreenshotAs(OutputType.FILE); //face screenshot
		FileUtils.copyFile(screenshotFile1, new File(".//screenshot/" + screenshotFileName + ".png")); //salveaza fisieerul 
		
		Thread.sleep(10000);
		driverChrome.findElement(By.xpath("//*[@id=\"gh-shipto-click\"]/div/button/span")).click();
		Date currentDate2 = new Date();
		String screenshotFileName2 = currentDate2.toString().replace(":", "-").replace(" ", "-").replace("-EET-2024", "");
		System.out.println("Current date in new format: " + screenshotFileName2);
		
		File screenshotFile2 = ((TakesScreenshot) driverChrome).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile2, new File(".//screenshot/" + screenshotFileName2 + ".png")); 
		
		
		
//		FileUtils.copyFile(screenshotFile1, new File(".//screenshot/" + currentDate.toString().replace(":", "-").replace(" ", "-").replace("-EET-2024", "") + ".png")); //salveaza fisieerul 
		
		
		
		
	

				



	}

}
