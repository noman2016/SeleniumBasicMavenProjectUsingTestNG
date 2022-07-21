package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	public void userRegistration() {
		System.out.println("This is test1");
		Assert.assertTrue(false);
	}
	//(dependsOnMethods = "userRegistration",alwaysRun=true)
	@Test(dependsOnMethods = "userRegistration")
	public void userSerch() {
		System.out.println("This is test2");
	}
	
	public void reporterTest3() {
		System.out.println("This is test3");
	}

}
