package WebDrive;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
         
		 WebDriver driver = new ChromeDriver();     // launching chrome browser
	     driver.manage().window().maximize();      // maximizeing the window size
	     driver.get("https://www.ebay.com/");     // enter URL
	     driver.manage().deleteAllCookies();     // deleting all the cookies
	     
	     // Dynamic Wait
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	     //Implicit Wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     
	     
	}

}
