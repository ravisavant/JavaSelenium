package WebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement
{
   public static void main(String args[]) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		   
			driver.get("https://www.spicejet.com/");
			
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Travel Policies')]"))).build().perform();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Passenger Support')]")).click();
	}

}
