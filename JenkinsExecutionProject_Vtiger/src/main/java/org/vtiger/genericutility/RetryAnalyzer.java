package org.vtiger.genericutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int startingPoint =0;
	int upperLimit=3;
	@Override
	public boolean retry(ITestResult result) {
		if(startingPoint<upperLimit) {
			startingPoint++;
			return true;
		}
		return false;
	}

}
