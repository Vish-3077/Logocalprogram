package listener1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{
	
		
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log(result.getName() + "The Test Case Has been succesfully passed" , true);
		
	}

	@Override
		public void onTestFailure(ITestResult result) 
	{
		Reporter.log(result.getName() + "The Test Case Has been Failed, Try again  " , true);
	}

	@Override
		public void onTestSkipped(ITestResult result) 
	{
		Reporter.log(result.getName() + "The Test Case Has not Executed,Please check Dependancy" , true);
	}
	
}
