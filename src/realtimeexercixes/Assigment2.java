package realtimeexercixes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr"));
		System.out.println("number of rows "+rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr/th"));
		System.out.println("number of columns "+columns.size());
		driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr[3]/td"));
		List<WebElement> text = driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr[3]/td"));
		for(int i=0;i<text.size();i++)
		{
			System.out.println(text.get(i).getText());
		}
		
		

	}

}
