package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =   new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		 driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("dayananda.alpha69@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test123456");
		 //driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 
		 WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
			
			flash(loginBtn, driver);
			drawBorder(loginBtn, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i= 0; i< 100; i++) {
			changeColor("rgb(0,0,0)", element,driver);
			changeColor(bgcolor, element, driver);
		}
	}	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguements[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
		}
	}	
		


		 
public static void drawBorder(WebElement element, WebDriver driver) {
JavascriptExecutor js = ((JavascriptExecutor) driver);
js.executeScript("arguements[0].style.border='3px solid red'", element);
	

}
	}
	


	
		
		