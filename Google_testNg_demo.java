package testNG_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Google_testNg_demo {
	WebDriver driver;

	@BeforeSuite
	public void test_google() {
		// System.out.println("THe google site is going to be tested");
		Reporter.log("TestNG reports and logs :-->The google site is going to be tested", true);

	}

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		String url;
		url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("TestNG reports and logs :--> This one is before the method", true);

	}

	@Test(dependsOnMethods = "test_Mail", groups = "Get_title")
	public void get_url() {

		String title;
		title = driver.getTitle();
		// System.out.println("Title of the webpage is :"+title);
		Reporter.log("TestNG reports and logs :--> test 4 : " + title, true);
	}

	@Test(groups = "test_logo")
	public void test_logo() {
		boolean logo;
		logo = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		// System.out.println("Logo is displayed :"+logo);
		Reporter.log("TestNG reports and logs :--> test 3  :" + logo, true);
	}

	@Test(groups = "Gmail")
	public void test_Mail() {
		boolean mail;
		mail = driver.findElement(By.linkText("mail")).isDisplayed();
		// System.out.println("Gmail is Displayed :"+mail);
		Reporter.log("TestNG reports and logs :--> test 1 :" + mail, true);
	}

	@Test(enabled = true, groups = "google_serach")
	public void test_google_Search() {
		String search;
		search = "//input[@value ='Google Search' and @type='submit']";
		boolean test_search;
		test_search = driver.findElement(By.xpath(search)).isSelected();
		// System.out.println("Google search is Selected :"+test_search);
		Reporter.log("TestNG reports and logs :--> test 2 :  " + test_search, true);
	}

	@Test(groups = "test")
	public void sample_test() {
		Reporter.log("TEstNg Reports and logs:----> Test1");
	}

	@Test(groups = "test")
	public void sample_test1() {
		Reporter.log("TEstNg Reports and logs:----> Test2");
	}

	@Test(groups = "test")
	public void sample_test2() {
		Reporter.log("TEstNg Reports and logs:----> Test3");
	}

	@Test(groups = "test")
	public void sample_test3() {
		Reporter.log("TEstNg Reports and logs:----> Test4");
	}

	@AfterMethod
	public void end_test() {
		Reporter.log("TestNG reports and logs :--> After Method :", true);
		driver.close();
		// driver.quit();

	}

	@AfterSuite
	public void test_over() {
		// System.out.println("All the tests are executed nicely ");
		Reporter.log("TestNG Reports and logs :---- > All the tests are executed nicely", true);

	}

}
// test mail
// test google search
// test logo
// test title
