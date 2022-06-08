import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
//		//dropdown with select tag - select is static dropdown
//		//below only works with select tag in HTML
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		//create object of the class so we can use all the methods in dropdown.
//		Select dropdown = new Select(staticDropdown);
//		//dropdown.selectByIndex(3);
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		//dropdown.selectByValue("INR") // if option has value in HTML
//		
		
		//
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		for(i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		//driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default .ui-state-highlight")).click();		
		
	}

}
