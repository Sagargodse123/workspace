package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class f12 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/"); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("momos");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		

		Thread.sleep(4000);
		
		
		  TakesScreenshot f = (TakesScreenshot) driver;
		 File f2 = f.getScreenshotAs(OutputType.FILE);
		  File f3 = new File( "./screenshots/ScreenShot2.jpg");
		  Files.copy(f2, f3);
		
	}

}
