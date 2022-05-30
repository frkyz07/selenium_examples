package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest {

	@BeforeClass
	public void beforeclass() {
		System.out.println("before running any class in the classs");
	}

	@Test(groups = { "Smoke" })
	public void MobileLogin() {
		// selenium
		System.out.println("MobileLogin");
	}

	@BeforeSuite
	public void BfSuite() {
		System.out.println("i am number 1");
	}

	@Test(dataProvider="getData")
	public void MobileSignin(String username,String password) {
		// appium
		System.out.println("MobileSignin");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println("before every test class in thirdtest class");
	}

	@Test(enabled=false)
	public void MobileSignout() {
		// Rest Apý automation
		System.out.println("MobileSignout");
	}
	@Parameters({"URL"})
	@Test(dependsOnMethods={"MobileLogin"})
	public void APISignout(String urlname) {
		// Rest Apý automation
		System.out.println("APISignout");
		System.out.println(urlname);
	}

	@AfterMethod
	public void afterevery() {
		System.out.println("after every test class in thirdtest class");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("i will be the last thing that you will see");
	}
	@DataProvider
	public Object[][] getData() 
	{
		// 1st combination - username password - good credit history
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		
		// first user
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		// second user
		data[1][0] = "secondsetusername";
		data[1][1] = "secondapassword";
		
		// third user
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
