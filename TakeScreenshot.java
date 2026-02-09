package WebDrive;

import java.io.File;
import java.time.Duration;
import java.nio.file.Files;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShot {

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(400));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		
		driver.navigate().to("https://demoqa.com/");
		
		// take screen shot and store as file format
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// save the screenshot in desired path
		
		Files.copy(src.toPath(),new File("C:\\Users\\ravis\\demo1.png").toPath());

	}

}
