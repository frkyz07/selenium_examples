package seleniumbasic;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// This was amazon's interview question
// in this example i learn how important is writing you code as dynamic as possible. no hard coding.  

public class SynchronizationIssues {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		// define the product we need
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		// Thread.sleep(3000);
		// go to the web site
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		// order method
		addItems(driver, itemsNeeded);
		
		// approved the order
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		// use the promo code
		driver.findElement(By.xpath("//div/input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div/button[@class='promoBtn']")).click();
		
		// explicit wait, waiting for the promo text
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@class='promoCode']")));
		
		// explicit wait, waiting for the promo info
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
// we wrote a ordering method to use in our test
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		// get the products
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// create for loop to find the products that you want to select
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// format it to get actual product name
			// check whether name you extracted is present in array or not
			// convert array into list for easy search
			List itemNeededList = Arrays.asList(itemsNeeded);

			// check the names
			if (itemNeededList.contains(formattedName)) {
				j++;
				// clicking needed products
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
