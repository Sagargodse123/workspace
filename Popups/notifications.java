package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notifications {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	
	         WebDriver driver = new ChromeDriver();
	      
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.BlueStone.com");
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		 Alert al = driver.switchTo().alert();
	
		Thread.sleep(2000);
		  Robot robo = new Robot();
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyPress(KeyEvent.VK_TAB);
	  robo.keyRelease(KeyEvent.VK_TAB);
	  robo.keyRelease(KeyEvent.VK_ENTER);

	  
		
	}
}