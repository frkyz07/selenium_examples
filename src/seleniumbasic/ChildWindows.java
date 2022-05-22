package seleniumbasic;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class=\"blinkingText\"]")).click();
		// getting windows ids
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		String email = driver.findElement(By.xpath("//div/ul/li[text()=' contact@rahulshettyacademy.com']")).getText();
		System.out.println(email.trim());
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys(email);

	}

}
