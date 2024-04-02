package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Recapitulare_2 {

	@Test 
	public void implicitlyWait() {
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test	
	public void methodGet() {	
	//prin metoda get(); deschidem web site-ul	
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.insead.edu/");
	}
	
	@Test 
	public void methodWindMax() {
		
	//prin metoda manage().window().maximize(); marim fereastra browser-ului
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.insead.edu/");
		driverChrome.manage().window().maximize();
	}

	@Test
	public void currentUrl() {
	//apelam getCurrentUrl();
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.insead.edu/");
		driverChrome.manage().window().maximize();
		String currUrl = driverChrome.getCurrentUrl();
		System.out.println("Adresa curenta: "+currUrl);
	}

	@Test
	public void displayTitle() {
///prin metoda getTitle(); obtinem titlul
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.insead.edu/");
		driverChrome.manage().window().maximize();
		String mainPageTitle = driverChrome.getTitle();
		System.out.println("Titlul website este: "+mainPageTitle);
	//accept cookies
		driverChrome.findElement(By.xpath("//*[@id=\"popup-buttons\"]/button[1]")).click();
	}
		
//	//metoda getPageSource();
//		String pageSource=driverChrome.getPageSource();
//		System.out.println("Page source: "+pageSource);
		
//	//quit(); - inchide browser-ul indiferent de nr te tab-uri deschise la moment
//		driverChrome.quit();
//		System.out.println("Browser closed");

//	//accesam repetat website-ul
//		driverChrome.get("https://www.insead.edu/");
	
	
	//click on hamburger menu 
	//	driverChrome.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/div[1]")).click();
	//go to MyINSEAD (new separate page open)
//		driverChrome.findElement(By.xpath("/html/body/div[1]/div/header/div[3]/div/div/div[4]/div[1]/nav/ul/li[3]/a")).click();
//		driverChrome.navigate().to("https://www.insead.edu/");
	//windowHandle();- identificatorul unic al website-ului accesat in fereastra din browser
//		String windowHandle=driverChrome.getWindowHandle();
//		System.out.println("Window Handle is: "+windowHandle);
		
	//switchTo(); este utilizat pentru mutarea catre un alt tab
//		String myINSEADPageTitle = driverChrome.getTitle();
//		System.out.println("MyINSEAD page title is: "+myINSEADPageTitle);
//		driverChrome.switchTo().window(mainPageTitle);
	
	@Test
	public void methosAttribute() {
	//getAttribute();
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.insead.edu/");
		driverChrome.manage().window().maximize();
		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"block-mainpagecontent\"]/article/div/div[4]/div/section/div/div/div/div/a[2]/div/div[1]/picture/img")).getAttribute("loading"));
	}
	
	@Test
	public void methodCssValue() {
	//getCssValue();- returneaza valoare unui element css
	    ChromeDriver driverChrome = new ChromeDriver();
	    driverChrome.get("https://www.insead.edu/");
	    driverChrome.manage().window().maximize();
		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"block-mainpagecontent\"]/article/div/div[3]/div/section/div/div/div/div/div/div[3]/a/img")).getCssValue("width"));
	}
	
	@Test
	public void methodGetLocation() {
	//getLocation();
		ChromeDriver driverChrome = new ChromeDriver();
	    driverChrome.get("https://www.insead.edu/");
	    driverChrome.manage().window().maximize();
		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"block-mainpagecontent\"]/article/div/div[3]/div/section/div/div/div/div/div/div[3]/a/img")).getLocation());
	}
	
	
	@Test
	public void methodGetSize() {
	//getSize();
		ChromeDriver driverChrome = new ChromeDriver();
	    driverChrome.get("https://www.insead.edu/");
	    driverChrome.manage().window().maximize();
		System.out.println(driverChrome.findElement(By.xpath("//*[@id=\"block-mainpagecontent\"]/article/div/div[3]/div/section/div/div/div/div/div/div[3]/a/img")).getSize());
	}
	
	@Test
	public void methodGetText() {
	//getText();
		ChromeDriver driverChrome = new ChromeDriver();
	    driverChrome.get("https://www.insead.edu/");
	    driverChrome.manage().window().maximize();
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[1]/div/footer/div[1]/div/div[1]/div[1]/div[2]")).getText());
	}
	
	@Test
	public void actionScrolling() {
	//scrolling
		ChromeDriver driverChrome = new ChromeDriver();
	    driverChrome.get("https://www.insead.edu/");
	    driverChrome.manage().window().maximize();
		WebElement CaseCenterText=driverChrome.findElement(By.xpath("//*[@id=\"248931\"]/div[2]/div/div/div/a[1]/div/div[2]/div/div/h3"));
		Actions scrollDown=new Actions(driverChrome);
		scrollDown.moveToElement(CaseCenterText);
		scrollDown.perform();
		
	}

}