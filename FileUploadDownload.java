package WebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDownload {

	public static void main(String[] args) throws InterruptedException {
		{
				System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
			   
				driver.get("https://demoqa.com/upload-download");
				driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\ravis\\Downloads\\BusinessApps_ReleaseNotes_v18.1.4.pdf"); // upload
				
        Thread.sleep(2000); // wait for 2sec
			
				driver.findElement(By.id("downloadButton")).click();  // download
				
			}
		}
	}
