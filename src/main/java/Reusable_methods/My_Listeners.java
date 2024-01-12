package Reusable_methods;

import org.testng.*;

public class My_Listeners implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("OnTestStart");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("OnTestSuccess");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("OnTestFailure");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("OnTestSkipped");
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("OnTestFailedWithTimeout");
    }

    public void onStart(ITestContext context) {
        System.out.println("OnStart");
    }

    public void onFinish(ITestContext context) {
        System.out.println("OnFinish");
    }
}
