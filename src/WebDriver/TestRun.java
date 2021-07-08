package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =   new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mcmcstage.cimm2.com/doLogin.action");
		
		driver.findElement(By.xpath("//div[@class='cimm_loginTbx']//input[@name='loginId']")).sendKeys("technicalsupport@unilogcorp.com");
		driver.findElement(By.xpath("//div[@class='cimm_loginTbx']//input[@name='loginPassword']")).sendKeys("test123456");
		driver.findElement(By.className("buttonGrad")).click();

	}

}
