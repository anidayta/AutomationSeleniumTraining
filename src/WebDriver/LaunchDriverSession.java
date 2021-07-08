package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchDriverSession {

	public static void main(String[] args) {	

 
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe"); // WRONG??
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
        driver.get("http://www.google.com"); //get- method to launch the URL
        
        String title = driver.getTitle();
        System.out.println("title");
        
        
        
        
        if (title.equals("Google")){   //result: Correct title
        //if (title.equals("test")){  //result: Incorrect title
        System.out.println("correct title");
        }
        else {
        	System.out.println("incorrect title");
        }
        
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
		
        driver.quit();
       
	}

	
	
}
