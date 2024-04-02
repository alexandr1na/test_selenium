package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Home_7 {

	public static void main(String[] args) throws InterruptedException {

	
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.jw.org/ro/"); // #1 Get 
        driverChrome.manage().window().fullscreen(); // #2 manage
        String pageSource = driverChrome.getPageSource();
		System.out.println("Codul sursa: " + pageSource); // #5 getPageSource
		driverChrome.findElement(By.xpath("//*[@id=\"mid1011200\"]/div[1]/div/div/button[2]")).click(); // #9 findElement
		String windowHandle = driverChrome.getWindowHandle(); // #10 getWindowHandle() 
		System.out.println(windowHandle);
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/main/div[2]/div[1]/div[2]/a/span")).click();
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.xpath("/html/body/div[4]/div/div/header/div[4]/div/form/input")).sendKeys("viitor"); // #12 sendkeys()
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("/html/body/div[4]/div/div/header/div[4]/div/form/input")).clear(); // #13 clear()		
		driverChrome.findElement(By.xpath("/html/body/div[4]/div/div/header/div[4]/div/form/input")).sendKeys("succes");
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("//button[@type='submit']//span[@class='buttonIcon']//*[name()='svg']")).click(); // #14 click()
		Thread.sleep(5000);
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/div/nav/ul/li[3]/a/span[2]")).getAttribute("iconLink-text")); // #15 getAttribute
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/div/nav/ul/li[3]/a/span[2]")).getCssValue("font-family")); // #16 getCssValue
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/div/nav/ul/li[3]/a/span[2]")).getLocation()); // #17 getLocation
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/div/nav/ul/li[3]/a/span[2]")).getSize()); // #18 getSize
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/div/nav/ul/li[3]/a/span[2]")).getTagName()); // #19 getTagName
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[6]/div/div/div/nav/ul/li[3]/a/span[2]")).getText()); // #20 getText
		driverChrome.manage().window().maximize();
		System.out.println(driverChrome.findElement(By.xpath("//span[@class='iconLink-text'][contains(text(),'ȘTIRI')]")).isDisplayed()); // #21 isDisplayed
		System.out.println(driverChrome.findElement(By.xpath("//span[@class='iconLink-text'][contains(text(),'ȘTIRI')]")).isEnabled()); // #22 isEnabled
		driverChrome.findElement(By.xpath("/html/body/div[5]/div/div/header/div[4]/a[1]/span[3]")).click();
		Thread.sleep(4000);
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[2]/div[1]/label/span")).isSelected());
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[2]/div[1]/label/span")).click();
		System.out.println(driverChrome.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/form/div/div[2]/div[1]/label/span")).isSelected()); // #23 isSelected
		Thread.sleep(4000);
		driverChrome.findElement(By.xpath("//div[@class='standardModal-flexWrapper']//span[@class='closeModal-icon']//*[name()='svg']")).click();
		driverChrome.findElement(By.xpath("//span[@class='iconLink-text'][contains(text(),'ÎNVĂȚĂTURI BIBLICE')]")).click();
		Thread.sleep(4000);
		String currentUrl = driverChrome.getCurrentUrl(); // #3 getCurrentUrl
        System.out.println("Adresa curenta este: " + currentUrl);
        String currentTitle = driverChrome.getTitle(); // #4 getTitle
        System.out.println("Titlul curent este: " + currentTitle);
		String firstPageTitle = driverChrome.getTitle();
		System.out.println("Primul website: " + firstPageTitle);
		Thread.sleep(4000);
		driverChrome.navigate().to("https://moonglow.md"); // #6 navigate	
		driverChrome.findElement(By.xpath("//li[@id='menu-item-256820']//span[@class='nav-link-text'][contains(text(),'🎁Seturi Cadou')]")).click();
		String secondPageTitle = driverChrome.getTitle();
		System.out.println("Al doilea website: " + secondPageTitle);
		driverChrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/form/select")).click();
//		driverChrome.switchTo().window("Căutare pe site | JW.ORG"); // #11 switchTo()
		WebElement elem = driverChrome.findElement(By.name("orderby"));
		Select selectedOption = new Select(elem);
		selectedOption.selectByValue("rating");
		Thread.sleep(5000);
		//selectedOption.selectByIndex(3);
		//Thread.sleep(5000);
		//selectedOption.selectByVisibleText("Sortează după preț: de la mic la mare");
		//Thread.sleep(5000);
		driverChrome.close(); // #8 close
		driverChrome.quit(); // #7 quit
		

	}

}