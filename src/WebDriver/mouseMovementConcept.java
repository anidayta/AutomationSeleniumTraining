package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.myntra.com");
		
		//mouse movement will be done by actions class

		Actions action = new Actions (driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Shrugs")).click();


	}

}
