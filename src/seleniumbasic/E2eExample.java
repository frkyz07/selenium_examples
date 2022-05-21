package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2eExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		// first city select
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[14]")).click();
		// second city select
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[10]")).click();
		// picking a date
		//driver.findElement(By.xpath("//div/div[@data-testid=\"departure-date-dropdown-label-test-id\"]")).click();
		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-19h5ruw.r-136ojw6 > div > div.css-1dbjc4n.r-1niwhzg.r-z2wwpe.r-17b9qp5.r-1g94qm0.r-h3f8nf.r-u8s1d.r-u3yave.r-8fdsdq > div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu > div.css-1dbjc4n.r-1euycsn > div.css-1dbjc4n.r-150rngu.r-18u37iz.r-16y2uox.r-1wbh5a2.r-lltvgl.r-buy8e9.r-1sncvnh > div > div:nth-child(1) > div > div:nth-child(3) > div:nth-child(4) > div:nth-child(7) > div > div")).click();
		// checking the disabled item
		if(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[1]")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		// dropdown menu
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
		}
		
		// selecting item in the static dropdown
		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c > div:nth-child(2) > div")).click();
		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c > div:nth-child(2) > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-1rjd0u6.r-1g94qm0.r-h3f8nf.r-u8s1d.r-8fdsdq > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div:nth-child(3)")).click();

		//clicking the check boxes
		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div:nth-child(6) > div > div.css-1dbjc4n.r-1d09ksm.r-1inuy60.r-m611by > div:nth-child(2) > div > div:nth-child(2) > div > div > div:nth-child(1) > svg > circle")).click();
		// clicking the search button
		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-1wtj0ep.r-1lgpqti > div:nth-child(2) > div")).click();
		
		
		//div/input[@autocapitalize='sentences']
	
		

	}

}
