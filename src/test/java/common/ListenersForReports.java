package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class ListenersForReports extends testUtils implements ITestListener{
		
    public void onTestStart(ITestResult result){

    	Reporter.log("Method name is - "+result.getName());
    	System.out.println("Test case is starting");
    }
    	
    public void onTestSuccess(ITestResult result){	

    	Reporter.log("Status of execution - "+result.getStatus());
    }
    	
    public void onTestFailure(ITestResult result){

    	System.out.println("Test failed - screenshot captured");
    	//Added later try catch
    	try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    		
    public void onTestSkipped(ITestResult Result){
    	
    }
    
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result){		
    	
    }
    
    public void onStart(ITestContext result){		
    	 		
    }
    
    public void onFinish(ITestContext result){		
    	       		
    }

}
