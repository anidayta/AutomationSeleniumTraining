package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionConcept {
	

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
		Assert.assertTrue(b1);
	}
	
	

@Test
	public void rememberTest(){
		driver.findElement(By.id("RememberMe")).click();
		boolean b2 = driver.findElement(By.id("RememberMe")).isEnabled();
		Assert.assertTrue(b2);
		
		
		
}

@Test
public void checkBoxTest() {
	boolean b3 = driver.findElement(By.id("RememberMe")).isSelected();
	Assert.assertFalse(b3);
	Assert.assertEquals(b3, false);


}

@Test
public void navigateTest() {
	driver.navigate().to("https://www.google.com");

}
		@AfterMethod
		public void tearDown(){
			driver.quit();

}
}

