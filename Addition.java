
package testNG_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Addition {
	@BeforeClass
	public void projectdemo(){
		System.out.println("Its the first of all");
	}
	@AfterClass
	public void endproject(){
		System.out.println("The project is over");
	}
	@BeforeMethod
	//It's a prerequisite for all the tests
	public void title(){
		
		System.out.println("This is the  test");
		
	}
	@BeforeTest
	public void subject(){
		System.out.println("It's a Calculator Program");
	}
	@AfterTest
	public void result(){
		System.out.println("The program is Over");
	}
	@AfterMethod
	//Its a post-requisite for the test to run
	public void test_result(){
		System.out.println("The test case is done");
	}
	@Test(groups ="priority2")
	public void add(){
		int x = 10;
		int y = 20;
		y += x;
		System.out.println("The Value of addition is:"+y);
	}
	@Test(dependsOnMethods = {"add"})
	public void multiply(){
		int x = 20;
		int y = 30;
		x *=y;
		System.out.println("The value of multiplication is :"+x);
	}
	@Test(groups="priority1")
	public void divide(){
		int  m = 400;
		int n = 20;
		m /=n;
		System.out.println("The value of division is :"+m);

	}
	@Test(dependsOnMethods={"multiply"})
	public void remainder(){
		int x = 300;
		int y = 13000;
		x /=y;
		System.out.println("The remainder is x:"+x);
	}
}
