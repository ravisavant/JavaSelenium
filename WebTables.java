package WebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Ravi");
        driver.findElement(By.id("lastName")).sendKeys("savant");
        driver.findElement(By.id("userEmail")).sendKeys("ravisavanat@gmail.com");
        driver.findElement(By.id("age")).sendKeys("25");
        driver.findElement(By.id("salary")).sendKeys("10000");
        driver.findElement(By.id("department")).sendKeys("xyz");
        driver.findElement(By.id("submit")).click();
        WebElement deleteBtn = driver.findElement(By.xpath("//div[@role='row' and .//div[text()='Kierra']]//span[@title='Delete']"));   
	}
}
