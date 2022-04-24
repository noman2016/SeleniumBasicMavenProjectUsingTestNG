package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo2 {
	
	@DataProvider (name = "create") // If use the data provider name, then use E.g. (name = "create")
	public Object[][] dataSet1(Method m) 
	{
		Object[][] testdata = null;
		
		if(m.getName().equals("test")) {
			 
		testdata = new Object[][] 
			{ 
				{ "username1", "password1"}, 
				{ "username2", "password2"},
				{ "username3", "password3"},
				{ "username4", "password4"},
			};
		}
			
			else if(m.getName().equals("test1")) 
			{
				testdata = new Object[][] 
						{ 
							{ "username1", "password1", "third1"}, 
							{ "username2", "password2", "third2"},
							{ "username3", "password3", "third3"},
							{ "username4", "password4", "third4"},
						};
			}
		
			else if(m.getName().equals("test2")) 
			{
				testdata = new Object[][] 
						{ 
							{ "username1", "password1", "third1","fourth1"}, 
							{ "username2", "password2", "third2","fourth2"},
							{ "username3", "password3", "third3","fourth3"},
							{ "username4", "password4", "third4","fourth4"},
						};
			}
			return testdata;
	
	}

}
