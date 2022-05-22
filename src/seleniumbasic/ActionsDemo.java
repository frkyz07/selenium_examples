package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.tr/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='sp-cc-accept']")).click();

		// create a action class
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		// writing letter in capitals
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// to move to element
		// create a the action and in order to build action you have to use build method
		// and in order to perform that action you have to use perform method
		a.moveToElement(move).contextClick().build().perform();
		// drag and drop

	}

}
