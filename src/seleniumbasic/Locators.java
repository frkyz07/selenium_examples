package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		// implicit wait
		System.setProperty("webdriver.chrome.driver","C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("faruk");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("faruk");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("faruk@actimi.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("frkyz07.13@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("626626");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();	
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("faruk");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkboxTwo\"]")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		

		
		
		
		

	
	}

}
