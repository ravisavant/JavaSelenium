package WebDrive;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(400));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		
		driver.get("https://www.ebay.com/");
		
		driver.navigate().to("https://demoqa.com/");
		
		Thread.sleep(400);
		
		driver.navigate().back();
		
		Thread.sleep(400);
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.youtube.com/results?search_query=naveen+automationlabs");
		
		
	}

}
