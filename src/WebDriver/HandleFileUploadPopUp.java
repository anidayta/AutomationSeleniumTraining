package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		//driver.get("https://html.com/input-type-file/");
		//driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\user\\Desktop\\Curriculum vitae- Dayananda D.pdf");
		
		driver.get("https://www.illovocareers.co.za/Upload-Your-CV");
		driver.findElement(By.id("PageContent_LeftCol_custcontrol_1047_txtFirstName")).sendKeys("Dayananda");
		driver.findElement(By.id("PageContent_LeftCol_custcontrol_1047_txtLastName")).sendKeys("D");
		driver.findElement(By.id("PageContent_LeftCol_custcontrol_1047_txtEmailAddress")).sendKeys("dayanand.cool7@gmail.com");
		driver.findElement(By.id("PageContent_LeftCol_custcontrol_1047_upCV")).sendKeys("C:\\Users\\user\\Desktop\\Curriculum vitae- Dayananda D.pdf");
		
		Thread.sleep(5000);

		driver.findElement(By.id("PageContent_LeftCol_custcontrol_1047_btnUpload")).click();
	
	}


}