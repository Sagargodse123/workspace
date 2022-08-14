package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class takeScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/explore/"); 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Log in with Facebook']")).click();

			
		Thread.sleep(2000);

		   TakesScreenshot d1 = (TakesScreenshot)driver;
		             File f1 = d1.getScreenshotAs(OutputType.FILE);
		           File a1 = new File("./screenshots/ScreenShot7.jpg");
		           Files.copy(f1, a1);
		        
		 
	}

}
