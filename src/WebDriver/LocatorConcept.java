package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		driver.get("https://www.grainger.com/content/user_registration");
		//driver.get("https://www.grainger.com/content/covid-19-recovery?cm_sp=Global-_-C19-_-Covid19_Recovery_05082020");
		
		//Method 1. XPath
		
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tom");
		//driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("cruise");
		//driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("dayananda.alpha69@gmail.com");

		//Method 2. id
		
		//driver.findElement(By.id("firstName")).sendKeys("Tom");
		//driver.findElement(By.id("lastName")).sendKeys("Jerry");
		
		
		//Method 3. Name
		
		driver.findElement(By.name("firstName")).sendKeys("Test");
		driver.findElement(By.name("lastName")).sendKeys("user");
		

		
		//Method 4: LinkText : only for links
		
		//driver.findElement(By.linkText("Buy Now >")).click(); //To run above line #14
		//driver.findElement(By.linkText("Register")).click();
		
		//Method 5: PatialLinkText : only for links having more length 
		
		//driver.findElement(By.partialLinkText("Portable Safety")).click();//To run above line #14
		
		
		//Method 6 : by CSS selector
		driver.findElement(By.cssSelector("#emailAddress")).sendKeys("daya88@gmail.com");
	}
	

}
