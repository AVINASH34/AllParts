package testing;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import Reusable_methods.ExtentReport;
import pages.Allparts_Login;



public class Login_test extends Allparts_Login {
	
	ExtentReport e = new ExtentReport("Allparts Login page");
	ExtentTest report;
	boolean result;
	public static Logger log = LogManager.getLogger(Allparts_Login.class);
	
	@BeforeClass
	public void openbrowser() throws IOException {
		
		report=e.createTest("Verify Open browser","Anusha","Smoke");
		driver=launchurl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		result = driver != null;
		e.logresult(result, report, "Browser Open Sucessfully", driver,"browser", "Unable to open browser");
	}
	
	@Test(priority = 1)
	public void login_btn() throws IOException {
		report=e.createTest("Login button","Anusha","Smoke");
		myaccountdrop();
		String expected = driver.findElement(By.xpath("//span[text()='Customer Login']")).getText();
		String actual = "Customer Login";
		org.testng.Assert.assertEquals(actual,expected);
		
		
	}
	@Test(priority = 2)
	public void email() {
		report=e.createTest("Verify Valid Email ID","Anusha","Smoke");
		usernameenter("kensiumqa@yopmail.com");
	}
	
	@Test(priority = 3)
	public void password() {
		report=e.createTest("Verify Valid Password","Anusha","Smoke");
		pass_wordenter("qaken$1um");
	}
	
	@Test(priority = 4)
	public void sign() throws IOException {
		report=e.createTest("Verify Login","Anusha","Smoke");
		signin(); 
	//	String Acutal ="";
	//	String Expected = driver.findElement(By.xpath("//span[text()='Customer Login']")).getText();
	//	org.testng.Assert.assertEquals(Acutal,Expected);
		
	}
	
	
	@AfterMethod
	 public void getResult(ITestResult result) throws Exception {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            report.log(Status.FAIL,result.getThrowable());
	           e.testfail(driver, report,"Login Failed", "login");
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	        	report.log(Status.PASS, result.getTestName());
	        }
	        else {
	        	report.log(Status.SKIP, result.getTestName());
	        }
	    }
	
	@AfterTest
	public void endReport()
	{
		e.flush();		
	}

}
