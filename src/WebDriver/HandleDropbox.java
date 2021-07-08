package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		driver.get("https://www.mclendons.com/Register");
		
		driver.findElement(By.xpath("//input[@id='firstName2B']")).sendKeys("Daya");
		driver.findElement(By.xpath("//input[@id='lastName2B']")).sendKeys("Ananda");
		driver.findElement(By.xpath("//input[@id='emailAddress2B']")).sendKeys("dayananda.alpha69@gmail.com");
		driver.findElement(By.id("password2B")).sendKeys("Test123456");
		driver.findElement(By.id("confirmPassword2B")).sendKeys("Test123456");
		driver.findElement(By.name("billingAddress2AB")).sendKeys("Vivekananda road");
		driver.findElement(By.name("suiteNo2AB")).sendKeys("apartment Inn #1234");
		driver.findElement(By.cssSelector("#cityName2B")).sendKeys("Wayne");
		driver.findElement(By.xpath("//input[@id='zipCode2B']")).sendKeys("19078");
		driver.findElement(By.xpath("//input[@id='phoneNo2B']")).sendKeys("1234567890");
			
//To Handle dropdown
		Select select = new Select(driver.findElement(By.id("stateName2B")));
		Select select1 = new Select(driver.findElement(By.id("countryName2B")));

		select.selectByVisibleText("Pennsylvania");
		select.selectByVisibleText("United States"); //Default on form, hence Cannot locate element with text: United States

//To add Linktext
		//driver.findElement(By.linkText("storeLocator")).click(); 
		
//Plainlinktext
//driver.findElement(By.partialLinkText("Rent")).click();
		
		
	}

}
