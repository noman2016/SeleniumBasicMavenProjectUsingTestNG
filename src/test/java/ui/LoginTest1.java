package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest1 {
	
	@BeforeTest
	public void loginToApplication() 
	{
		System.out.println("Login to application");
	}
	
	@AfterTest
	public void logoutFromApplication() 
	{
		System.out.println("Logout from application");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disConnectFromDB()
	{
		System.out.println("Disconect DB Connected");
	}
	
	@Test(priority=2,description="This is a login test")
	//public void bloginTest()
	public void loginTest()
	
	{
		System.out.println("Login is successful");

	}
	
	@Test(priority=1,description="This is a logout test")
	//public void alogoutTest() 
	public void logoutTest() 
	{
		System.out.println("Logout is successful");
	}

}
