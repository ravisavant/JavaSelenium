package WebDrive;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// ---------------- ROW COUNT ----------------
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowcount=rows.size();
		System.out.println("Total rows : "+rowcount);
		
		// ---------------- COLUMN COUNT ----------------
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int columncount=columns.size();
		System.out.println("Total columns : "+columncount);
		
		// ---------------- COMPANY COLUMN ----------------
		WebElement company=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[1]"));  
		System.out.println("\n"+company.getText()+"\n");
		
		String Beforexpath = "//*[@id='customers']/tbody/tr[";
		String Afterxpath = "]/td[1]";
		
		for(int i=2;i<=rowcount;i++)
		{
			String Actualxpath=Beforexpath+i+Afterxpath;
			WebElement el=driver.findElement(By.xpath(Actualxpath));
			System.out.println(el.getText());
			
			if(el.getText().equals("Magazzini Alimentari Riuniti"))
			{
				System.out.println("Company found at row : "+i);
				break;
			}
		}
		
		// ---------------- CONTACT COLUMN ----------------
		WebElement contact=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[2]"));  
		System.out.println("\n"+contact.getText()+"\n");
		
		String contactBeforexpath = "//*[@id='customers']/tbody/tr[";
		String contactAfterxpath="]/td[2]";
		
		for(int i=2;i<=rowcount;i++)
		{
			String Actualxpath=contactBeforexpath+i+contactAfterxpath;
			WebElement el=driver.findElement(By.xpath(Actualxpath));
			System.out.println(el.getText());
		}
		
		// ---------------- COUNTRY COLUMN ----------------
		WebElement country=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[3]"));  
		System.out.println("\n"+country.getText()+"\n");
		
		String countryBeforexpath = "//*[@id='customers']/tbody/tr[";
		String countryAfterxpath="]/td[3]";
		
		for(int i=2;i<=rowcount;i++)
		{
			String Actualxpath=countryBeforexpath+i+countryAfterxpath;
			WebElement el=driver.findElement(By.xpath(Actualxpath));
			System.out.println(el.getText());
		}
		
		int columncount2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();

		for(int row = 2; row <= rowcount; row++)
		{
			for(int col = 1; col <= columncount2; col++)
			{
				String cellXpath = "//*[@id='customers']/tbody/tr[" + row + "]/td[" + col + "]";
				System.out.print(driver.findElement(By.xpath(cellXpath)).getText() + " | ");
			}
			System.out.println();
		}

	}    
	
	
}
