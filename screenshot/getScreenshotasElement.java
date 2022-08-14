package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class getScreenshotasElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/"); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("momos");
		WebElement ss = driver.findElement(By.id("nav-search-submit-button"));
		
		

		Thread.sleep(4000);
		
		
		 File f = driver.getScreenshotAs(OutputType.FILE);
		       File f1 = new File( "./screenshots/ScreenShot3.jpg");
		       Files.copy(f, f1);
		
	}

}
