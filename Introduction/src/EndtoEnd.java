import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		Thread.sleep(2000);
		
		//check if return date is enabled - should be false
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		//Assert.assertTrue(true);

		}

		else

		{
			System.out.println("its disabled");
		//Assert.assertTrue(false);

		}
		
		//tick round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//check if return date is enabled - should be true
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		//Assert.assertTrue(true);

		}

		else

		{
			System.out.println("its disabled");
		//Assert.assertTrue(false);

		}
		
		//flight from
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//flight to
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//depart date today
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//return date today
		
		//2 adults/3 kids passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<2)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		for(i=1; i<2; i++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		
		//currency USD
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		//dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("USD");
		
		//family and friends checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//click search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
