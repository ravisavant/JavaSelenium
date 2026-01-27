package WebDrive;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillingForm 
{
	public static void main(String args[]) {
		 System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/automation-practice-form"); // lunching demoqa web site
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver; // scrolling
		 js.executeScript("window.scrollBy(0,400)");
		 
		 driver.findElement(By.id("firstName")).sendKeys("Ravi");                 // name
		 driver.findElement(By.id("lastName")).sendKeys("Savant");                // lastname
		 driver.findElement(By.id("userEmail")).sendKeys("Ravis@gmail.com");      // email
		 driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();  // gender  The visible clickable area is the label thtas we used label or By.xpath("//label[text()='Male']"
		 driver.findElement(By.id("userNumber")).sendKeys("1234567899");          // mobilenumber
		 
		 driver.findElement(By.id("dateOfBirthInput")).click();                   // click on dob
		 
		 Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));     // select month
				month.selectByVisibleText("May");   
				
		 Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));       // select year
			    year.selectByVisibleText("2027");
			    
	    driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='28' and not(contains(@class,'outside-month'))]")).click();   // select the date


	    WebElement subject = driver.findElement(By.id("subjectsInput"));               //*[@id="subjectsContainer"
	    subject.sendKeys("Maths");                                                      //*[@id="subjectsContainer"
	    subject.sendKeys(Keys.ENTER);                                                  //*[@id="subjectsContainer"
	    
	    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();    //hobbies
	    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();    //hobbies
	    
	    
	    WebElement address = driver.findElement(By.id("currentAddress"));              // currentAdress
	    js.executeScript("arguments[0].scrollIntoView(true);", address); 
	    address.sendKeys("Bangalore");                                                 //driver.findElement(By.id("currentAddress")).sendKeys("Bangalore"); 
	    
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,400)");
	    
	    driver.findElement(By.xpath("//*[@id='state']")).click();                      // State
	                                                                                   //driver.findElement(By.id("state")).click();
	    driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();
                                                                                             // City
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.xpath("//div[text()='Agra']")).click();
	    
	    
	    driver.findElement(By.id("submit")).click();                   // click on submit

	
	}
}
