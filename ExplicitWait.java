package WebDrive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoqa.com/");
	
		JavascriptExecutor js= (JavascriptExecutor) driver; // why we need to scroll beacuse the element name (form) not visibile on the page 
		js.executeScript("window.scrollBy(0,400)");         // so if the text not visilble on the page the xpath will not work
		
		//WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Forms')]"));  // aslo write like this
		//clickOn(driver, element, 20);
		
		clickOn(driver, driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")), 20);  // it works for only clikable elements
	}
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout)
	
	{
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 
		 wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		 
		 locator.click();

		
	}

}
