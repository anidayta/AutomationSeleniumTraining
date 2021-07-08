package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException{

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =   new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home");
		Thread.sleep(3000);
		
//It is impossible to click iframe directly through XPath since it is an iframe. First we have to switch to the frame and then we can click using xpath.
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//iframe[@id='a077aa5e']")).click();
		
		//driver.findElement(By.name("a077aa5e")).click();
		////iframe[@id='a077aa5e']
		
	}

}
