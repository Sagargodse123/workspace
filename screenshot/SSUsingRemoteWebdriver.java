package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;


public class SSUsingRemoteWebdriver {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); 

			
		Thread.sleep(2000);

		    RemoteWebDriver d1 = (RemoteWebDriver)driver;
		             File f1 = d1.getScreenshotAs(OutputType.FILE);
		           File a1 = new File("./screenshots/ScreenShot6.jpg");
		           Files.copy(f1, a1);
		        
		 
	}

}
