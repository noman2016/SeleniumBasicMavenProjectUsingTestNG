package ui;

import org.testng.annotations.Test;

public class DataProviderDemoClass2 {

	@Test(dataProvider = "create",dataProviderClass=DataProviderDemo2.class) //Use method Name
	public void test(String username, String password) {
		System.out.println(username + "======" + password);
	}
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderDemo2.class) //Use Name of the data Provider Or
	//@Test(dataProvider = "dataSet1") //Use method Name
	public void test1(String username, String password, String test) {
		System.out.println(username + "======" + password+"==="+test);
	}
	
	@Test(dataProvider = "create",dataProviderClass=DataProviderDemo2.class) //Use Name of the data Provider Or
	//@Test(dataProvider = "dataSet2") //Use method Name
	public void test2(String username, String password, String test, String test1) {
		System.out.println(username + "======" + password+"==="+test+"==="+test1);
	}

}
