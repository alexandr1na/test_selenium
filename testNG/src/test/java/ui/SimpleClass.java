package ui;

import org.testng.annotations.Test;

public class SimpleClass extends DriverClass{
	//Se ruleaza de aici
	@Test
	public void launchApp() {
		
		driverFirefox.get("https://www.iherb.com");
		
		
	}
}