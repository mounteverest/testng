package testNG_framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot_suite {
	@BeforeSuite
	public void installsoftware(){
		System.out.println("This is the First to be executed in the TestNG Package");
	}

	@AfterSuite
	public void un_install(){
		System.out.println("THis is the Last to be Executed in the TestNG package");
	}
	@Test
	public void sample(){
		System.out.println("regular Samples to be tested");
	}
}
