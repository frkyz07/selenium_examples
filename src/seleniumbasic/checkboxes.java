package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div")).click();
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div")).isSelected());
		// count the chechkboxes
		Assert.assertEquals(false, false);
		System.out.println(driver.findElements(By.className("css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa")).size());
		

		

	}

}
