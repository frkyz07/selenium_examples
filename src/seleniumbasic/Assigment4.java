package seleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//li/a[text()='Multiple Windows']")).click();
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		String childText = driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(childText);
		driver.switchTo().window(parentId);
		String parentText = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(parentText);

	}

}
