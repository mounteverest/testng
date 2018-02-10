package testNG_framework;

import org.testng.annotations.Test;

public class prioratize_demo {

	@Test(dependsOnMethods = {"OpenBrowser"})
	public void BookTickets(){
	//	int i;
		System.out.println("First check the browser is clicked or not");
	}
	@Test(timeOut = 5000)
	public void OpenBrowser(){
		System.out.println("The browser is been clicked");
		
	}
	@Test(dependsOnMethods ={"BookTickets"},alwaysRun = true)
	public void payments(){
		System.out.println("The payments are made");
		
	}
	@Test(enabled=false)
	public void clearance(){
		System.out.println("Check the payments are running");
	}
	
	
}
