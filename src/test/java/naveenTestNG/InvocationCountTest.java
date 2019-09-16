package naveenTestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

//	What if we have to write same test case 10 times 
	
	@Test(invocationCount=10)
	public void sum()
	{
		int a= 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is "+ c);
	}
	
	
	
}
