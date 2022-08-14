package Popups;

import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/Lenovo/Desktop/promptpopup.html");
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 
		      Alert alert = driver.switchTo().alert();
		      Toolkit.getDefaultToolkit().getSystemClipboard().setContents((Transferable) alert, null);
		     alert.sendKeys("SAGAR");
		     Thread.sleep(4000);
		     alert.dismiss();
		    
		      
		      
		 
	
	
	
	}

}
