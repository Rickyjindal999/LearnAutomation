package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int counter = 0;
	int retrylimit = 3;
	
	public boolean retry(ITestResult result)  // Override this method for test level
	{
		if (counter<retrylimit)
		{
			return true;
		}
		return false;
	}
	

}
