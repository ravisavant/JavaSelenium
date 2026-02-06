package WebDrive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandling 
{
 public static void main(String args[]) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
   
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.name("proceed")).click();
	
    Thread.sleep(5000); // for waiting 5sec=5000 mili sec
	
	@SuppressWarnings("unused")
	Alert alert = driver.switchTo().alert();
	
	if(alert.getText().equals("Please enter a valid user name"))    // validating the alert 
	{
		System.out.println("Alert is correct");
	    alert.accept();// Accepting the alert
	    
	    driver.findElement(By.name("login")).sendKeys("ravi@gmail.com");
	    driver.findElement(By.name("passwd")).sendKeys("123456789");    
	}
	else
	{
		System.out.println("alert is not correct");
	}
	
}
}
