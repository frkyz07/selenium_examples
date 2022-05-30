package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FourthTest {

	@Test
	public void WebLoginLoan() {
		// selenium
		System.out.println("WebLogin1Home");
	}

	@Test(groups = { "Smoke" })
	public void MobileLoginLoan() {
		// appium
		System.out.println("MobileLoginHome");
	}
	@Parameters({"URL","APIkey"})
	@Test
	public void APILoginLoan(String urlname,String apýkey) {
		// Rest Apý automation
		System.out.println("APILoginHome");
		System.out.println(urlname);
		System.out.println(apýkey);
		
	}
}
