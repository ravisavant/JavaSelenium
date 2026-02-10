package WebDrive;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindoPopUP 
{
	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/p[3]/font/input")).click();
		
		Set <String> handler=driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
	    
		String childWindowID = it.next();
		System.out.println("child window id:"+childWindowID);
		
        String parentWindowID = it.next();
		System.out.println("child window id:"+parentWindowID);
		
		
	    driver.switchTo().window(childWindowID);
	    
	    Thread.sleep(200);
	    
	    System.out.println("child window pop tittle:"+driver.getTitle());
		
	    Thread.sleep(200);
	    
	    driver.close();
	    
        driver.switchTo().window(parentWindowID);
	    
	    Thread.sleep(200);
	    
	    System.out.println("child window pop tittle:"+driver.getTitle());
	
	}

}
