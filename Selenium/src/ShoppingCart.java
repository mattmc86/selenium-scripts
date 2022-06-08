import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class ShoppingCart {



public static void main(String[] args) throws InterruptedException {



	System.setProperty("webdriver.chrome.driver", "/Users/matthewmckenna/Desktop/automation/chromedriver");



WebDriver driver=new ChromeDriver();

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

//implicit is good to use here because:
//readable code
//applied globally so always applies

//disadvantage 
//will not catch performance Acceptance Criteria e.g. something should appear within 2 seconds - if it 
// takes 5 seconds test will pass - so it hides performance issues

//explicit
//pros - better for catching performance issues
//cons - more code

String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Beans"};





driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.cssSelector("input.promoCode"))));

driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("button.promoBtn")).click();

//explicit wait to be used on specific step

w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

}

public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

for(int i=0;i<products.size();i++)

{

//Brocolli - 1 Kg

//Brocolli,    1 kg

String[] name=products.get(i).getText().split("-");

String formattedName=name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

List itemsNeededList = Arrays.asList(itemsNeeded);

if(itemsNeededList.contains(formattedName))

{

j++;

//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

if(j==itemsNeeded.length)

{

break;

}

}

}

}



}

