package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_7 {

	public static void main(String[] args) throws InterruptedException {
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
		//		ChromeDriver driverChrome = new ChromeDriver();
		//		driverChrome.get("https://point.md");
		//		driverChrome.manage().window().maximize();
		//		driverChrome.findElement(By.cssSelector("body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p")).click();
		//		String firstPageTitle = driverChrome.getTitle();
		//		System.out.println(firstPageTitle);
		////		Thread.sleep(5000);
		//		driverChrome.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/a/div/div[1]")).click();
		//		String secondPageTitle = driverChrome.getTitle();
		//		System.out.println(secondPageTitle);
		//		driverChrome.switchTo().window("Новости Молдовы - Point.md");
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
				ChromeDriver driverChrome = new ChromeDriver();
				driverChrome.get("https://www.sugarcrm.com/uk/contact/?utm_source=sugarcrm.com&utm_medium=referral");
				driverChrome.manage().window().maximize();
				driverChrome.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
				WebElement ddown = driverChrome.findElement(By.name("awareness_source_c"));
				Select selectedOption = new Select(ddown);
				selectedOption.selectByValue("Podcast");
				Thread.sleep(3000);
				selectedOption.selectByIndex(5);
				Thread.sleep(3000);
				selectedOption.selectByVisibleText("YouTube");
				



	}

}