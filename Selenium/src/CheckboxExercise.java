import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		driver.findElement(By.id("checkBoxOption1")).click();
		//get number of checkboxes in page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//check the first checkbox and assert
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//uncheck the first checkbox and assert
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
	}

}
