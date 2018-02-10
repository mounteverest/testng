package testNG_framework;

import org.testng.annotations.Test;

public class Prioratize_annotations {
	@Test
	public void OpenBrowser(){
		System.out.println("Opening the Browser");
	}
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void CloseBrowser(){
		System.out.println("Quit the Browser");
	}
	@Test(enabled=false)
	public void checkElements(){
		System.out.println("The Elements are being Checked");
	}

}
