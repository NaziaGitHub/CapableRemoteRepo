package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Class4 implements IRetryAnalyzer 
{
	int counter = 0;
	int maxlimitcount = 3;

	@Override
	public boolean retry(ITestResult result) 
	{
		if (counter<maxlimitcount) 
		{
			counter++;
			return true;
		}
		else 
		{
			return false;
		}
	}
}
