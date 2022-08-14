package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class javaTpoint {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.javatpoint.com/");
		 Thread.sleep(400);
		 driver.findElement(By.xpath("(//li/a)[3]")).click();
		 Thread.sleep(4000);
		 
		 
	
File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
Files.copy(f,new File( "E://ScreenShot//A10.png"));
}
}