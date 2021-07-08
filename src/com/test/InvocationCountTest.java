package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountTest {

	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =   new ChromeDriver();	//IMPORTANT do not start with "WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://www.google.com");
		driver.get("https://sme.spicejet.com");
	}
	
	@Test
	public void loginTest(){
		boolean b1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']")).isDisplayed();
		System.out.println(b1);
		
	}

@Test(invocationCount=5) //5 times Remember me checkbox get checked
	public void rememberTest(){
		driver.findElement(By.id("RememberMe")).click();
		boolean b2 = driver.findElement(By.id("RememberMe")).isEnabled();
		System.out.println(b2);
		
		
	}

	
	@Test
	public void checkBoxTest() {
		boolean b3 = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println(b3);
	
	}
	
	
		@AfterMethod
		public void tearDown(){
			driver.quit();
	}
}



