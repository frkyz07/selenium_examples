package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListeneres interface which testng listeners
public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult results) {
		
	System.out.println("I successfully executed listeners pass code"+results.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult results) {
		
		// screenshot code
		// response if API is failed
	//	System.out.println("I successfully executed listeners pass code");
	}
	
	@Override
	public void onTestSkipped(ITestResult results) {
		
		System.out.println("");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult results) {
		
		System.out.println("");
	}
	
	@Override
	public void onTestStart(ITestResult results) {
		
		System.out.println("");
	}


}
