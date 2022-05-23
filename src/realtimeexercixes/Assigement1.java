package realtimeexercixes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\frkyz\\OneDrive\\Belgeler\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1. select one checkbox and get the text / checkbox exapmle
		driver.findElement(By.id("checkBoxOption1")).click();
		String text = driver.findElement(By.xpath("//div/fieldset/label[@for='bmw']")).getText();
		System.out.println(text);

		// 2. dropdown click the checkbox text that come from the checkbox / dropdown
		// exapmle
		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(text);

		// 3. enter the label text you get earlier /swicth to alert examo
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		// 4. verify the text you send come in the alerts
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(text)) {
			System.out.println("Succes");
		} else {
			System.out.println("No Succes");
		}

		//

	}

}
