import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//if using another browser
//		System.setProperty("webdriver.gecko.driver", "/Users/matthewmckenna/Desktop/automation/geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "/Users/matthewmckenna/Desktop/automation/msedgedriver");
//		WebDriver driver = new EdgeDriver();
		
		//Locators
		
		//ID
		//name
		//class name
		//css selector
		//tag name
		//link text
		//partial link text
		//xpath
		
		//implicit wait - will wait for duration but if it comes earlier will find it
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); // will quit current tab
//		driver.quit(); - will quit all browser tabs
		driver.findElement(By.id("inputUsername")).sendKeys("Matthew");
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Matthew");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("matt@test.com");
		//indexing can be used if there is no unique identifier like below
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("matt@test2.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("07777777");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Matthew");
		//regex
		//pretend password is passxxxx the xxxx is dynamic
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.className("signInBtn")).click();
		//if customer cssselector you need all class names - whereas if you use classname only pick one class
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	
	
	}
	

}
