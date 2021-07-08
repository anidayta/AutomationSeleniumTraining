package WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =   new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[1]/font[1]/b[1]/a[3]")).click();
		
		Thread.sleep(2000);
		 
			Set<String>  handler =  driver.getWindowHandles();
		    Iterator<String> it = handler.iterator();
		    
		    String parentWindowId = it.next();
		    System.out.println("Parent Window id:"+ parentWindowId );
		    
		    String childWindowId = it.next();
		    System.out.println("Child Window id:"+ childWindowId );
		    
		    driver.switchTo().window(childWindowId);
		    
		    Thread.sleep(2000);
			 
		    System.out.println("child window pop up title" + driver.getTitle());
		    
		    driver.close();
		    
		    driver.switchTo().window(parentWindowId);
		    
		    Thread.sleep(2000);
			 
		    System.out.println("parent window title"+ driver.getTitle());
		    
		 
	 
 
		
	}

}
