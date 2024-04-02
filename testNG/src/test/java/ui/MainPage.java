package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

	@Test
	public void verifyMainPageTitle() {
		SoftAssert softAssert = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driverChrome = new ChromeDriver();
		//driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://www.ebay.com/");
		String expectedPageTitle = "Electronics, Cars, Fashion, Collectibles & More | eBayJJJ";
		String actualPageTitle = driverChrome.getTitle();
		System.out.println("Acum urmeaza sa fie verificat titlul.");

		//Asertiuni - compara 2 rezultate
		softAssert.assertEquals(actualPageTitle, expectedPageTitle, "Mesaj de eroare personalizat:");
		
		
		String expectedSearchValue = "Search";
		String actualSearchValue = driverChrome.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Acum urmeaza sa fie verificata valoarea butonului 'Search'.");
		softAssert.assertEquals(actualSearchValue, expectedSearchValue);
		
		// hard assertion vs soft assertion (interview)
		// La HA daca cade un tc urmatoarele tc nu se verifica
		// La SA daca cade un tc, scriptul ruleaza pana la urma si verifica toate tc
	}
	

}