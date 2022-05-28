package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("I will execute last");
	}
	
	@Test(groups= {"Smoke"})
	public void Second()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequrest() 
	{
		System.out.println("I will execute first");
		
	}
}
