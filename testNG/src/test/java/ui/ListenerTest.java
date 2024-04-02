package ui;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenerTest implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Aceasta metoda se executa cand ruleaza un test case");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Assert.assertTrue(false);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Aceasta metoda se executa cand a cazut un test case");
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}
	@Override
	public void onStart(ITestContext context) {
	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Aceasta metoda se executa dupa finalizarea unui test case");
	}
	//implements - crearea unei legaturi intre o clasa si o interfata
	
	
}