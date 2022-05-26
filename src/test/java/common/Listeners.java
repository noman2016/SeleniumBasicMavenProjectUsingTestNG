package common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
		
	// When Test case get Started, this method is called.		
    public void onTestStart(ITestResult result){
    	//TODO Auto-generated method stub
    	//System.out.println(Result.getName()+" test case started");	
    	System.out.println("Test case is starting");
    }
    
    // When Test case get passed, this method is called.		
    public void onTestSuccess(ITestResult result){	
    	//TODO Auto-generated method stub
    	//System.out.println("The name of the testcase passed is :"+result.getName());					
    }
    
    // When Test case get failed, this method is called.		
    public void onTestFailure(ITestResult result){
    	//TODO Auto-generated method stub
    	//System.out.println("The name of the testcase failed is :"+result.getName());	
    	System.out.println("Test failed - screenshot captured");
    }
    
    // When Test case get Skipped, this method is called.		
    public void onTestSkipped(ITestResult Result){
    	//TODO Auto-generated method stub
    	//System.out.println("The name of the testcase Skipped is :"+result.getName());					
    }
    
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result){		
    	//TODO Auto-generated method stub	
    }
    
    public void onStart(ITestContext result){		
    	//TODO Auto-generated method stub  		
    }
    
    public void onFinish(ITestContext result){		
    	//TODO Auto-generated method stub         		
    }

}
