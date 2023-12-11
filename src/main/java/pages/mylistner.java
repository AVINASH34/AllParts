package pages;

import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class mylistner implements ITestNGListener{
	
	public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

  
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }


}
