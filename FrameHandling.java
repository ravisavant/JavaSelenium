package WebDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site
        driver.get("https://demoqa.com/frames");

        // Switch to first frame using id
        driver.switchTo().frame("frame2");

        // Read text inside frame
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println(text.getText());

        // Switch back to main page
        driver.switchTo().defaultContent();
    }
}
