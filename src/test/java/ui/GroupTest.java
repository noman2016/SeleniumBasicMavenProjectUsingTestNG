package ui;

import org.testng.annotations.Test;

@Test(groups="user-registration")
public class GroupTest {
	
	@Test(priority=1, groups="regression")
	//public void bloginTest()
	public void test1()
	
	{
		System.out.println("Test1");

	}
	
	@Test(priority=2, groups="regression")
	//public void alogoutTest() 
	public void test2() 
	{
		System.out.println("Test2");
	}
	
	@Test(groups= {"regression","bvt"})
	public void test3() 
	{
		System.out.println("Test3");
	}
	
	@Test(groups= {"bvt"})
	public void test4() 
	{
		System.out.println("Test4");
	}

}
