package realtimeexercixes;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// get all the links in the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		// get all the links in the footer using scope
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		List<WebElement> footerLinks = footerDriver.findElements(By.tagName("a"));
		System.out.println(footerLinks.size());

		// get all the linls in the first column of the footer
		WebElement firstColumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> columnLinks = firstColumn.findElements(By.tagName("a"));
		System.out.println(columnLinks.size());

		// Click on each link on the column check the pages are opening

		for (int i = 1; i < columnLinks.size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);

			Thread.sleep(5000L);
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
