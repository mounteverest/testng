package testNG_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_features {
WebDriver driver;
@BeforeMethod
public void setup(){
	driver = new FirefoxDriver();
	String url;
	url = "https://www.google.com/";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@Test
public void get_title(){
	String title;
	title = driver.getTitle();
	System.out.println("Title is:"+title);
	Assert.assertEquals(title, "Googlexyz","Title is matched");
	
	
}
@AfterMethod
public void end_test(){
	driver.close();
}
}
