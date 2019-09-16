package retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTranfermer  implements IAnnotationTransformer {

	
	// We have override tranform method -- For run time failed execution
	public void transform(ITestAnnotation annotation, Class testClass , Constructor testConstructor, Method testMethod)
	{
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
