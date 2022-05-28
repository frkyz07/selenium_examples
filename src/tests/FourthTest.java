package tests;

import org.testng.annotations.Test;

public class FourthTest {
	
	@Test
	public void WebLoginLoan()
	{
		//selenium
		System.out.println("WebLogin1Home");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginLoan()
	{
		//appium
		System.out.println("MobileLoginHome");
	}
	@Test
	public void APILoginLoan()
	{
		//Rest Apý automation
		System.out.println("APILoginHome");
	}
}

