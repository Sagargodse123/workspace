package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/Lenovo/Desktop/popup.html");
		 driver.findElement(By.xpath("//button[.='Try it']")).click();
		 
		      Alert alert = driver.switchTo().alert();
		      Thread.sleep(5000);
		      alert.dismiss();
		 
	
	
	
	}

}
