package WebDrive;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElemnts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(400));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		driver.get("https://www.ebay.com/");
	
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		
	
		// Size of links
		
    System.out.println("the total count of the all links is "+ linklist.size());   // the total count of the link
		
	  // get the text each link on the page
		
		for(int i=0;i<=linklist.size();i++)
		{
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
	  }
}
}
