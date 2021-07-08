package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpaths {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		driver.get("https://www.mclendons.com/contact-us");
		
		driver.findElement(By.xpath("//select[@name = 'Reason for Contact']")).sendKeys("Website Questions");
		driver.findElement(By.xpath("//input[@name = 'First Name']")).sendKeys("Daya");
		driver.findElement(By.xpath("//input[@name = 'Last Name']")).sendKeys("Anand");
		driver.findElement(By.xpath("//input[@name = 'Email Address']")).sendKeys("daya96@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'Phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//select[@name = 'Preferred Store']")).sendKeys("Sumner");
		driver.findElement(By.xpath("//textarea[@name = 'Message']")).sendKeys("form test");

}
}
