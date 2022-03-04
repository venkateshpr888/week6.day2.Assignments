package week6.day2.Assignments;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements  IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count=1;
		if(count<2)
		{
			count++;

			return true;
		}
		else {
		return false;
	}

}
	}
