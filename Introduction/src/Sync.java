		import java.time.Duration;

		import java.util.List;

		import org.openqa.selenium.By;

		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.WebElement;

		import org.openqa.selenium.chrome.ChromeDriver;

		import org.openqa.selenium.support.ui.ExpectedConditions;

		import org.openqa.selenium.support.ui.Select;

		import org.openqa.selenium.support.ui.WebDriverWait;

		public class Sync {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - set globally so applies to every step, if element appears before set time it will come out of
		// it and execute - e,g if you implicit 5 seconds and element appears in 2 seconds it will go after 2

		
		//explicit - used for specific steps/scenariosnif you know it will take longer

		System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");

		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select dropdown = new Select(options);

		dropdown.selectByValue("consult");

		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		}
	
	}


