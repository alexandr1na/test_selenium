package my_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {

	public static void main(String[] args) {
		
		//CSS Selector
//		//tagName[AttributeName='AttributeValue']
//		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window();
//		driverChrome.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
//		driverChrome.findElement(By.cssSelector("input[id='search']")).click();
		
		
		//CSS Selector Id
		//tagName[AttributeName='AttributeValue']
		//sau
		//tagName#elementID
		//sau
		//#elementID
//		driverChrome.get("https://lamborghini.com");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		
		
//		/*
//		CSS Selector Class
//		tagName[AttributeName='AttributeValue']
//		sau
//		a.elementID
//		*/
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("a.css-1gpccxq")).click();
		
//		/*
//		CSS Selector Other Attribute
//		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("input[data-testid='search-input']")).click();
		
		
		/* CSS Selector Multiple Attributes
		tagName#idValue[AttributeName='AttributeValue'][AttributeName='AttributeValue']
		tagName.classValue[AttributeName='AttributeValue'][AttributeName='AttributeValue']
		tagName[AttributeName='AttributeValue'][AttributeName='AttributeValue']
		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("input#search[data-testid='search-input'][placeholder='Ce anume cauți?']")).click();
		
		
		/* CSS Selector Substring
		input[name^='fixed_d']
		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("input[data-cy^='search-bar-in']")).click();
	
		/* CSS Selector Substring
		input[name$='d_fixed']
		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("input[data-cy$='ch-bar-input']")).click();
		
		/* CSS Selector Substring
		input[name*='d_fixed_d']
		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("input[data-cy*='ch-bar-inp']")).click();
	
		
		/* CSS Selector Direct Child
		tagName[AttributeName='AttributeValue']>tagName[AttributeName='AttributeValue'] is used to select direct child
		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("input[data-cy*='ch-bar-inp']")).click();
	
		
		/* CSS Selector Direct Child
		tagName[AttributeName='AttributeValue']>tagName is used to select just the first child (ex. doar primul copil de tip div 6 rezultate)
		*/
		
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("div[class='css-127xiqh']>div")).click();
		
		
		/* CSS Selector Subchild
		tagName[AttributeName='AttributeValue'] tagName is used to select child and subchild (ex. toti copiii si mai jos de tip div 94 rezultate)
		*/
//		driverChrome.get("https://olx.ro");
//		driverChrome.manage().window().maximize();
//		driverChrome.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
//		driverChrome.findElement(By.cssSelector("div[class='css-127xiqh'] div")).click();
		
		
		/* CSS Selector Next Sibling
		tagName[AttributeName='AttributeValue']+tagName (tagName-ul la al doilea sa fie acelasi ca primul)
		*/
	}

}
