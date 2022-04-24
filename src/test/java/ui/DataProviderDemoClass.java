package ui;

import org.testng.annotations.Test;

public class DataProviderDemoClass {

	@Test(dataProvider = "dataSet",dataProviderClass=DataProviderDemo.class) //Use method Name
	public void test(String username, String password) {
		System.out.println(username + "======" + password);
	}
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderDemo.class) //Use Name of the data Provider Or
	//@Test(dataProvider = "dataSet1") //Use method Name
	public void test1(String username, String password, String test) {
		System.out.println(username + "======" + password+"==="+"test");
	}

}
