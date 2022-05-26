package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filtering {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
	
		List<WebElement> filterResults = driver.findElements(By.xpath("//tr/td[1]"));
		//  5 results
		List<WebElement> filtered = filterResults.stream().filter(a->a.getText().contains("Rice")).
				collect(Collectors.toList());
		// 1 results
		Assert.assertEquals(filterResults.size(),filtered.size());
		
	}

}
