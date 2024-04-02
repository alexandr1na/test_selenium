package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases {
	Boolean dataSetup = true;
	@Test (enabled=false)
	public void skipTest1()
	{
		System.out.println("This test 1 is not even executed");	
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("This test 2 test has been executed");
		throw new SkipException("Skipping this test");
	}
	
	@Test()
	public void skipTest3()
	{
		System.out.println("This test 3 test has been skipped based on condition");	
		if (dataSetup==true)
		{
			System.out.println("Se executa"); // se printeaza daca conditia if e indeplinita
		}
		else {
			System.out.println("Nu se executa"); //se printeaza daca conditia if nu e indeplinita
			throw new SkipException("Don't execute further steps");
		}
	}






}
