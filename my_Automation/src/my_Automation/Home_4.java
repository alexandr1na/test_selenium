package my_Automation;

//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Home_4 {
//
//	public static void main(String[] args) {
//		
////		Creați un script pentru olx.ro pentru locatorul CSS cu metoda click(), 
////		care să conțină in total 12 locatori care să aibă: 1 ID, 2 Class, 4 Other attribute, 
//		1 format din doua atribute, 1 prefix substring, 1 matching substring, 1 direct child, 1 next sibling
		

//					//CSS Selector
//					//tagName[AttributeName='AttributeValue']
//					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window();
//					driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
//					driverChrome.findElement(By.cssSelector("input[id='search']")).click();
					
					
					//CSS Selector Id
					//tagName[AttributeName='AttributeValue']
					//sau
					//tagName#elementID
					//sau
					//#elementID
//					driverChrome.get("https://lamborghini.com");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
					
					
//					/*
//					CSS Selector Class
//					tagName[AttributeName='AttributeValue']
//					sau
//					a.elementID
//					*/
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("a.css-1gpccxq")).click();
					
//					/*
//					CSS Selector Other Attribute
//					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("input[data-testid='search-input']")).click();
					
					
					/* CSS Selector Multiple Attributes
					tagName#idValue[AttributeName='AttributeValue'][AttributeName='AttributeValue']
					tagName.classValue[AttributeName='AttributeValue'][AttributeName='AttributeValue']
					tagName[AttributeName='AttributeValue'][AttributeName='AttributeValue']
					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("input#search[data-testid='search-input'][placeholder='Ce anume cauți?']")).click();
					
					
					/* CSS Selector Substring
					input[name^='fixed_d']
					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("input[data-cy^='search-bar-in']")).click();
				
					/* CSS Selector Substring
					input[name$='d_fixed']
					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("input[data-cy$='ch-bar-input']")).click();
					
					/* CSS Selector Substring
					input[name*='d_fixed_d']
					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("input[data-cy*='ch-bar-inp']")).click();
				
					
					/* CSS Selector Direct Child
					tagName[AttributeName='AttributeValue']>tagName[AttributeName='AttributeValue'] is used to select direct child
					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("input[data-cy*='ch-bar-inp']")).click();
				
					
					/* CSS Selector Direct Child
					tagName[AttributeName='AttributeValue']>tagName is used to select just the first child (ex. doar primul copil de tip div 6 rezultate)
					*/
					
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("div[class='css-127xiqh']>div")).click();
					
					
					/* CSS Selector Subchild
					tagName[AttributeName='AttributeValue'] tagName is used to select child and subchild (ex. toti copiii si mai jos de tip div 94 rezultate)
					*/
//					driverChrome.get("https://olx.ro");
//					driverChrome.manage().window().maximize();
//					driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//					driverChrome.findElement(By.cssSelector("div[class='css-127xiqh'] div")).click();
					
					
					/* CSS Selector Next Sibling
					tagName[AttributeName='AttributeValue']+tagName (tagName-ul la al doilea sa fie acelasi ca primul)
					*/ 
		
		
		
		
		
		
		// CSS ID
		// tagname[atribute_Name='atribute_Value']
		// tagName#elementID
		// #elementID
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://lamborghini.com");
//		driverChrome.manage().window().maximize();
//		//driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();	
//		//driverChrome.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

				
//		// CSS Class
//		// tagname[atribute_Name='atribute_Value']
//		// tagname.atribute_Value(numele clasei)
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();	
//		driverChrome.findElement(By.cssSelector("a.css-1gpccxq")).click();	
				
				
//		// CSS Another atribute
//		// tagname[atribute_Name='atribute_Value']
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();	
//		driverChrome.findElement(By.cssSelector("input[data-testid='search-input']")).click();	
		
//		ChromeDriver driverChrome = new ChromeDriver();
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
//		driverChrome.findElement(By.cssSelector("span[class='css-xu7uwr']")).click();	
//		driverChrome.findElement(By.cssSelector("svg[class='css-30858w']")).click();		
//		driverChrome.findElement(By.cssSelector("div[class='css-1rwzo2t']>a[class='css-1gpccxq']")).click();
//		driverChrome.findElement(By.cssSelector("a[class='smcx-btn smcx-btn-secondary smcx-pull-left']")).click();
//	}
//
//}
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home_4 {
    public static void main(String[] args) {
        // Setarea proprietăților pentru driverul Selenium
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        
        // Inițializarea driverului Chrome
        WebDriver driver = new ChromeDriver();

        // Deschiderea paginii web eBay Contact Us
        driver.get("https://www.ebay.com/help/account/default/contacting-ebay-customer-service?id=4379");

        // Așteptare implicită pentru așteptarea elementelor
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Identificarea și completarea câmpurilor de text
        WebElement nameField = driver.findElement(By.cssSelector("input[name='firstname']"));
        nameField.sendKeys("John");

        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("johndoe@example.com");

        WebElement messageField = driver.findElement(By.cssSelector("textarea[name='message']"));
        messageField.sendKeys("Aceasta este un mesaj de contact pentru eBay.");

        // Trimiterea formularului prin apăsarea tasei Enter pe ultimul câmp
        messageField.sendKeys(Keys.ENTER);

        // Așteptăm un timp pentru a vedea rezultatul
        try {
            Thread.sleep(5000); // Așteaptă 5 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Închiderea browserului
        driver.quit();
    }
}
