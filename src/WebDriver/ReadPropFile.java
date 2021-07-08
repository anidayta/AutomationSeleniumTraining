package WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties(); //create prop as a object
		
		FileInputStream ip = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\SeleniumSession\\src\\WebDriver\\config.properties");
		
		prop.load(ip);
		
		//System.out.println(prop.getProperty("Name")); //output will "null" - uppercase Name is not exist in property file
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver =   new ChromeDriver(); //create global variable after class:  static WebDriver driver;
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
				
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			 driver =   new FirefoxDriver();
		}
	
		driver.get(url);
		
		
		driver.findElement(By.xpath(prop.getProperty("firstName2B_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastName2B_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("emailAddress2AB_xpath"))).sendKeys(prop.getProperty("emailAddress"));
	
	}

}
