package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction {


	public static void main(String[] args) {
		
		// opening the browser
		// chrome - chromedriver -> methods
		// firefox - firefoxdriver -> methods
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		
		// webdrive opening a browser
		
		//WebDriver driver = new ChromeDriver();
		
		
		// firefox
		// geckodriver 
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\frkyz\\OneDrive\\Belgeler\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		// edge
		// edgeriver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\frkyz\\OneDrive\\Belgeler\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
		
		
	}

}
