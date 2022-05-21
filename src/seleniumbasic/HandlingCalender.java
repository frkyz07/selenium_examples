package seleniumbasic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Faruk");
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("faruk@actimi.com");
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("123123");
		driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//div/select/option[1]"));
		driver.findElement(By.xpath("//div/input[@value='option1']")).click();
		driver.findElement(By.xpath("//div/input[@name='bday']")).sendKeys("13-07-1997");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div/div[@class='alert alert-success alert-dismissible']")).getText());
		
		
		
		
		
	}

}
