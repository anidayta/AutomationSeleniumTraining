package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibiltyTest {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =   new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://sme.spicejet.com");
		
		//Method 1. isDisplayed Method- to check whther the option or button is visible on the website
		
		boolean b1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']")).isDisplayed();
		System.out.println(b1);
		
		//Method 2. iEnabled To check checkbox
		driver.findElement(By.id("RememberMe")).click();
		boolean b2 = driver.findElement(By.id("RememberMe")).isEnabled();
		System.out.println(b2);
		
		
		
		
		//Method 3. isSelected to verfiy the checkbox
		boolean b3 = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println(b3);
				
				
		
	}

}
