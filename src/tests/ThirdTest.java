package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before running any class in the classs");
	}
	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		//selenium
		System.out.println("MobileLogin");
	}
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("i am number 1");
	}
	@Test
	public void MobileSignin()
	{
		//appium
		System.out.println("MobileSignin");
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("before every test class in thirdtest class");
	}
	@Test
	public void MobileSignout()
	{
		//Rest Apý automation
		System.out.println("MobileSignout");
	}@Test
	public void APISignout()
	{
		//Rest Apý automation
		System.out.println("APISignout");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("after every test class in thirdtest class");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("i will be the last thing that you will see");
	}
	
}

