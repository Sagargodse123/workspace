package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("C:\\Users\\Lenovo\\Desktop\\all\\popup.html");
		 driver.findElement(By.xpath("//button[.='Try it']")).click();
		 
		      Alert alert = driver.switchTo().alert();
		      Thread.sleep(5000);
		      
		     String text = alert.getText();
		     System.out.println(text);
		      alert.accept();
		      
		 
	
	
	
	}

}
