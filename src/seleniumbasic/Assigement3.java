package seleniumbasic;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assigement3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label/span[text()=' User']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/select[@class=\"form-control\"]")));
		driver.findElement(By.xpath("//div/select[@class=\"form-control\"]")).click();
		driver.findElement(By.xpath("//div/select/option[@value=\"consult\"]")).click();
		driver.findElement(By.xpath("//div/label/span/input[@name=\"terms\"]")).click();
		driver.findElement(By.id("signInBtn")).click();
		
	
		List<WebElement> newProducts = driver.findElements(By.cssSelector("btn btn-info"));
		for (int i = 0; i < newProducts.size(); i++) {
			newProducts.get(i).click();
			}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		
		
		
		
		
	}

}
