package realtimeexercixes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> urlLinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	//	List<WebElement> urlList = driver.findElements(By.tagName("a")).getAttribute("href");
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link: urlLinks)
		{
			String url = link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			
			int respCode = connection.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with Text "+link.getText()+" is broken with code "+respCode);
		
		}
		a.assertAll();
		

	}

}
