package WebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Ravi");
        driver.findElement(By.id("userEmail")).sendKeys("ravisavant@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("#684, Bengaluru");
        driver.findElement(By.id("permanentAddress")).sendKeys("#683, Bengaluru");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        driver.findElement(By.id("submit")).click();
    }
}

