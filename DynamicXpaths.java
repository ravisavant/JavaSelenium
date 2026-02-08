package WebDrive;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpaths 
{
	 public static void main(String args[]) 
	 {
			System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(400));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
			//driver.get("https://demoqa.com/text-box");
			
			//----using properties( autocomplete,placeholder,id,.... is the property here)
			
			//driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Ravi savant");    // using properties-autocomplete is the property here
			//driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']")).sendKeys("Ravi savant");
			//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ravi savant");
			//driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Ravi savant");
			
			
			//---- using Contains function
			
			//driver.findElement(By.xpath("//input[contains(@placeholder,'Full Name')]")).sendKeys("RAVI SAVANT");
			//driver.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("RAVI SAVANT");
			//driver.findElement(By.xpath("//textarea[contains(@placeholder,'Current Address')]")).sendKeys("RAVI SAVANT");
			
			//-------------starts with --------------------//
			
			//id=test_123
		    //id=test_234
		    //id=test_568
			
			//driver.findElement(By.xpath("//input[starts-with(@placeholder,'test_')]")).sendKeys("RAVI SAVANT");
			
			//-------------ends-with-------------------------//
			
			//id=123_test
			//id=234_test_test
			//id=568_test
			
			//driver.findElement(By.xpath("//input[ends-with(@placeholder,'_test')]")).sendKeys("RAVI SAVANT");
			
			//-----for links-----------//
			
			
			driver.get("https://demoqa.com/links");
			driver.findElement(By.xpath("//a[contains(text(),'simpleLink')]")).click();
	 }
}
