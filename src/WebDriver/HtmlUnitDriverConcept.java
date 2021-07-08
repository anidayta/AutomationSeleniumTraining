package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//WebDriver driver =   new ChromeDriver();	
		WebDriver driver =   new HtmlUnitDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.mclendons.com/contact-us");
		
		System.out.println("Show title is:===="+driver.getTitle());
		
		driver.findElement(By.xpath("//select[@name = 'Reason for Contact']")).sendKeys("Website Questions");
		driver.findElement(By.xpath("//input[@name = 'First Name']")).sendKeys("Daya");
		driver.findElement(By.xpath("//input[@name = 'Last Name']")).sendKeys("Anand");
	
		Thread.sleep(3000);
	
	}

}
	