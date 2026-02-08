package WebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDDrop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.xpath("//h5[text()='Interactions']")).click();

        js.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.xpath("//span[text()='Droppable']")).click();

        js.executeScript("window.scrollBy(0,400)");
        // driver.SwitchTO().frames(0);                        // if frane are there in the site first we neeed to connect wuth frames using this metheod 
        Actions action = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // =====================================================
        // WAY 1 : clickAndHold + moveToElement + release
        // =====================================================
        // action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
        //       .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
        //       .release()
        //       .build()
        //       .perform();

        // =====================================================
        // WAY 2 : dragAndDrop (direct method)
        // =====================================================
        
        action.dragAndDrop(source, target).perform();               // for demoqa site this logic is working // bases website we need to use difeerent type of logic and 

        // =====================================================
        // WAY 3 : clickAndHold with pause (used currently)
        // =====================================================
        // action.clickAndHold(source)
        //       .moveToElement(target)
        //       .pause(500)
        //       .release()
        //       .perform();
    }
}
