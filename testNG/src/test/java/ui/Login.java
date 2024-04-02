package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test(groups="user-registration")
public final class Login {
	@BeforeTest
	public void testCaseZero_1() {
		System.out.println("Test preventiv_1");
	}
	
	@BeforeTest
	public void testCaseZero_2() {
		System.out.println("Test preventiv_2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("se conecteaza la BD");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("se deconecteaza de la BD");
	}
	@AfterTest
	public void lastTestCase() {
		System.out.println("Ultimul test");
	}
	
	@Test(priority = 1, description="introduc un username valid")
	public void primulTestCase() {
		System.out.println("Verific username");
	}
	
	@Test(groups = "localisation")
	public void testCase4() {
		System.out.println("Verific fluxul de date");
	}
	
	@Test(groups = "regression")
	public void testCase5() {
		System.out.println("Verific butonul send");
	}
	

	@Test(priority = 3, description="introduc o parola valida")
	public void alDoileaTestCase() {
		System.out.println("Verific parola");
	}
	
	@Test(priority = 2, description="introduc butonul de logare valid")
	public void alTreileaTestCase() {
		System.out.println("Verific butonul de logare");
	}
	


	@BeforeGroups(value="regression")
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	@AfterGroups(value="localisation")
	public void afterGroups() {
		System.out.println("After Groups");
	} 
	
}
 
