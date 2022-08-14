package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class submit {

	public static void main(String[] args) throws InterruptedException, IOException {
	     
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.id("email")).sendKeys("8625853882");
		 driver.findElement(By.id("pass")).sendKeys("9130179632");
		WebElement div = driver.findElement(By.name("login"));
		Thread.sleep(4000);
 div.submit();
	
	Thread.sleep(5000);

	Alert alert= driver.switchTo().alert(); 
	String msg=alert.getText(); 
	System.out.println(msg); 
	alert.accept();
	
	Thread.sleep(10000);
 

 File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 Files.copy(f,new File( "E://ScreenShot//A9.png"));
	}

}
