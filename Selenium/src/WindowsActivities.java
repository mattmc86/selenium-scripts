import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //this waits until page is fully loaded
		driver.navigate().to("http://rahulshettyacademy.com"); // this doesn't
		driver.navigate().back();
		driver.navigate().forward();
	}

}
