package testNG_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_demo {
	
	@BeforeSuite
	
	public void project_title(){
		System.out.println("The project is going to Start....");
	}
	@AfterSuite
	
	public void end_project(){
		System.out.println("The project is completed successfully");
	}
	
	@BeforeTest
	public void testProject(){
		System.out.println("We're doing unit testing");
	}
	@AfterTest
	public void result(){
		System.out.println("Unit testing is done");
	}
	
	@BeforeClass
	public void requirements(){
		System.out.println("The requirements are listed");
	}
	@AfterClass
	public void test_requirements(){
		System.out.println("The requirements are tested");
	}
	@BeforeMethod
	public void design_phase(){
		System.out.println("The designs are implemented");
	}
	@AfterMethod
	public void test_design(){
		System.out.println("The designs are tested well");
	}
	@Test(dependsOnMethods ="subtraction")
	public void add(){
		int x,y;
		x = 20;
		y =30;
		x += y;
		System.out.println("The value of x is :"+x);
	}
	@Test(groups = "priority1")
	public void subtraction(){
		int a,b;
		a=20;b=40;
		b -= a;
		System.out.println("The value of b is:"+b);
		
	}

}
