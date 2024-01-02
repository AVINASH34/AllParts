package testing;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reusable_methods.My_Listeners;

@Listeners(My_Listeners.class)
public class tets1 {

	@Test
	public void testmethod1() {
		System.out.println("I am inside testmethod1");
	}
	@Test
	public void testmethod2() {
		
		System.out.println("Inside testmethod2");
		Assert.assertTrue(false);
	}
	@Test(timeOut=1000)
	public void testmethod3() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Inside test method3");
	}
	@Test(dependsOnMethods="testmethod3")
	public void testmethod4() {
		
	}
}
