package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Disableorenableuý {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		// //a[@value='MAA'] -- xpath for chennai
		 
		// //a[@value='BLR'] -- xpath for chennai
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(dropdown));
	    dropdown2.click();

		//driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1\']")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//li/a[@value=\"MAA\"]")).click();

	}

}
