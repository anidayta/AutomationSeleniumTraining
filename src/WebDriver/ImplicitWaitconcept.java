package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitconcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =   new ChromeDriver();
		driver.get("https://www.myntra.com");//Launch the URL, 
		
		driver.manage().window().maximize(); //Maximaize window,
		driver.manage().deleteAllCookies(); // delete all cookies
		
		//DynamicWaites
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit. SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions action = new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).build().perform();
		driver.findElement(By.linkText("Shrugs")).click();

	}

}
