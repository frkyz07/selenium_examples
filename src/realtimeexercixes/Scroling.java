package realtimeexercixes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import org.openqa.selenium.WebElement;

public class Scroling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i = 0;i<value.size();i++) 
		{
			sum = sum+Integer.parseInt(value.get(i).getText());
		}
		System.out.println(sum);
		String text =driver.findElement(By.className("totalAmount")).getText();
		
		String newText = text.split(":")[1].trim();
		int total = Integer.parseInt(newText);
		Assert.assertEquals(sum, total);
	}
}
