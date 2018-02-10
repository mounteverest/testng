package testNG_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void add(){
		int x =20, y= 30;
		x += y;
		Reporter.log("THe value of x is:-->" +x, true);
	}
}
