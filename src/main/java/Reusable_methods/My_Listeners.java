package Reusable_methods;

import org.testng.*;


public class My_Listeners implements ITestListener{


	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStarted");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("OnTestFail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTestSkipped");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("OnTestFailwithTimeOut");
	}	

	public void onStart(ITestContext context) {
		System.out.println("OnTestStart");
	}
	

	public void onFinish(ITestContext context) {
		System.out.println("OnTestFinish");
	}
	
	

}
