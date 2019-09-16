package naveenTestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	/*@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoop()
	{
		int i = 1;
		while (i==1)
		{
			System.out.println(i);
		}
	}*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x = "110A";
		Integer.parseInt(x);
	}
}
